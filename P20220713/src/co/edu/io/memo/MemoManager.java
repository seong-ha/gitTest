package co.edu.io.memo;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MemoManager {

    List<Memo> memoStorage = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    File file = new File("c:/Dev/memo.dat");

    private static final MemoManager instance = new MemoManager();
    private MemoManager() { readFromFile();}

    public static MemoManager getInstance() {
        return instance;
    }

    // 등록
    public void inputData() {
        System.out.print("메모번호> ");
        int num = Integer.parseInt(sc.nextLine());

        System.out.print("작성날짜> ");
        String date = sc.nextLine();

        System.out.print("내용> ");
        String content = sc.nextLine();

        memoStorage.add(new Memo(num, date, content));
        System.out.println("메모가 등록되었습니다.");
    }

    // 조회(날짜에 대한 모든 메모 출력)
    public void search() {
        System.out.print("조회할 날짜> ");
        String memoDate = sc.nextLine();
        boolean isExist = false;
        for (Memo memo : memoStorage) {
            if (memo.getDate().equals(memoDate)) {
                System.out.println(memo + "\n");
                isExist = true;
            }
        }

        if (!isExist) {
            System.out.println("해당 날짜의 메모가 없습니다.");
            return;
        }

        System.out.println("조회가 완료되었습니다.");
    }

    public void deleteData() {
        System.out.print("삭제할 메모번호> ");
        int memoNum = Integer.parseInt(sc.nextLine());
        boolean isExist = false;

        Iterator<Memo> it = memoStorage.iterator();
        while(it.hasNext()) {
            Memo memo = it.next();
            if (memo.getNum() == memoNum) {
                it.remove();
                isExist = true;
            }
        }

        if (!isExist) {
            System.out.println("해당 번호의 메모가 없습니다.");
            return;
        }

        System.out.println("삭제가 완료되었습니다.");
    }

    // 종료하면서 파일로 저장.
    public void storeToFile() {
        try {
            FileOutputStream fos = new FileOutputStream(file);
            // 객체 처리해주는 보조스트림 ObjectOutputStream: ArrayList를 -> 바이트 배열로 변경.
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(memoStorage); // 객체타입을 바이트타입으로 변경해줌.
            oos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("파일로 저장이 완료되었습니다.");
    }

    public void readFromFile() {
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);

            memoStorage = (List<Memo>) ois.readObject();
            ois.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
