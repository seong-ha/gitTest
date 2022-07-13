package co.edu.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CharExample {

	public static void main(String[] args) {
		reader2();
	}

	public static void reader2() {
		try {
			FileReader fr = new FileReader("c:/Dev/test.txt");
			char[] cbuf = new char[10];
			int buf = 0;
			while ((buf = fr.read(cbuf)) != -1) {     // ★ 한 번 눈여겨보기. 대입 후 비교를 한번에 작성.
				for (int i = 0; i < cbuf.length; i++ ) {
					System.out.print(cbuf[i]);
				}
				System.out.println("\n----");
			}
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("실행됨.");
	}

	public static void reader1() {
		try {
			FileReader fr = new FileReader("c:/Dev/test.txt");
			
			while (true) {
				int buf = fr.read();
				if (buf == -1 ) { break; }
				System.out.print((char) buf);
			}
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("실행됨.");
	}

	public static void writer1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력> ");
		String txt = "";
		try {
			FileWriter fw = new FileWriter("c:/Dev/test.txt");
			while (true) {
				try {
					txt = sc.nextLine();
				} catch (NoSuchElementException e) {
					System.out.println("Ctrl + z 누름 -> 종료");
					break;
				}
				fw.write(txt + "\n");
			}
			fw.flush();  // 버퍼 비우기.
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("실행됨.");
	}

}
