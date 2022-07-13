package co.edu.io.memo;

import java.util.Scanner;

public class MemoApp {

    public static void main(String[] args) {
        MemoManager memoManager = MemoManager.getInstance();
        Scanner sc = new Scanner(System.in);
        boolean run = true;

        while (run) {
            System.out.println("1. 등록 | 2. 조회 | 3. 삭제 | 4. 파일로 저장 후 종료");
            System.out.print("메뉴를 선택해주세요.> ");

            int selectNo = Integer.parseInt(sc.nextLine());

            switch (selectNo) {
                case 1:
                    memoManager.inputData();
                    break;
                case 2:
                    memoManager.search();
                    break;
                case 3:
                    memoManager.deleteData();
                    break;
                case 4:
                    memoManager.storeToFile();
                    run = false;
                    break;
                default:
                    System.out.println("메뉴 선택이 잘못 되었습니다.\n1 ~ 4번 중에 선택해주세요.");
            }

//            if (selectNo == 1) {
//                memoManager.inputData();
//            } else if (selectNo == 2) {
//                memoManager.search();
//            } else if (selectNo == 3) {
//                memoManager.deleteData();
//            } else if (selectNo == 4) {
//                memoManager.storeToFile();
//                break;
//            } else {
//                System.out.println("메뉴 선택이 잘못 되었습니다.\n1 ~ 4번 중에 선택해주세요.");
//            }
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
