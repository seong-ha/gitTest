package psh20220803.lotto;

import java.util.ArrayList;
import java.util.Scanner;

public class LottoApp {
    ArrayList<int[]> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void lottoExe() {

        boolean run = true;

        while (run) {
            System.out.println("1. 로또 생성 | 2. 로또 조회 | 3. 종료");
            System.out.print("메뉴 선택 (1~3) > ");

            int menuNo = Integer.parseInt(sc.nextLine());

            switch (menuNo) {
                case 1:
                    buyLotto();
                    break;
                case 2:
                    getLottoResult();
                    break;
                case 3:
                    System.out.println("로또를 종료합니다.");
                    run = false;
            }
        }
    }

    private void buyLotto() {
        System.out.print("로또에 지르실 금액을 입력하세요(1000원 단위) > ");
        int money = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < money / 1000; i++) {
            list.add(createNum());
        }
        System.out.println("로또번호 생성이 완료되었습니다.");
    }

    private int[] createNum() {
        int[] lineArr = new int[6];

        for (int j = 0; j < 6; j++) {
            int randNum = (int) (Math.random() * 45) + 1;

            if (j == 0) {
                lineArr[j] = randNum;
            } else {
                boolean duplicateCheck = false;

                for (int k = 0; k < j; k++) {
                    if (lineArr[k] == randNum) {
                        j -= 1;
                        duplicateCheck = true;
                        break;
                    }
                }
                if (!duplicateCheck) {
                    lineArr[j] = randNum;
                }
            }
        }
        return lineArr;
    }

    private void getLottoResult() {
        System.out.println("로또 지른 금액: " + (list.size() * 1000) + "원\n");

        for (int i = 0; i < list.size(); i++) {
            String numLine = (i % 5) + 1 + "번> ";

            for (int num : list.get(i)) {
                numLine += num + "  ";
            }

            System.out.println(numLine);
            if ((i + 1) % 5 == 0) {
                System.out.println("----------------------------");
            }
        }

        System.out.println("\n로또 번호 출력이 완료되었습니다.");
    }
}
