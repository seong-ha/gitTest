package co.edu.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteExample {

	public static void main(String[] args) {
		long start = System.nanoTime();
		try {
			FileInputStream fis = new FileInputStream("c:/Dev/img.jpg");
			FileOutputStream fos = new FileOutputStream("c:/Dev/img2.jpg");
			// 처리시간749_399_200 -> 처리시간11_201_300
			byte[] arr = new byte[100];
			
			while (true) {
				int buf = fis.read(arr);
				if(buf == -1) { break; }
				fos.write(arr);
			}
			
			fos.flush();
			fis.close();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		long end = System.nanoTime();
		
		System.out.println("처리시간" + (end - start));
	}

	public static void read2() {
		try {
			FileInputStream fis = new FileInputStream("c:/Dev/data2.dat");
			byte[] arr = new byte[2];
			
			while (true) {
				int buf = fis.read(arr);  // 한번읽을 때 최대 arr의 크기만큼씩 읽어들인다. 총 3개니까 2개읽고 남은1개 읽고
				if (buf == -1) { break; }
				for (int i = 0; i < buf; i++) {
					System.out.print(arr[i] + "  ");
				}
				System.out.println();
			}
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("실행.");
	}

	public static void write2() {
		byte[] arr = new byte[] { 10, 20, 30 };
		try {
			FileOutputStream fos = new FileOutputStream("c:/Dev/data2.dat");
			fos.write(arr); // 입력
			fos.flush(); // 보내기
			fos.close(); // 자원 반납
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("실행.");
	}

	// byte 기반 입력스트림.
	public static void read1() {
		try {
			FileInputStream fis = new FileInputStream("c:/Dev/data1.dat");

			while (true) {
				int buf = fis.read();
				if (buf == -1) { break; }
				System.out.println(buf);
			}
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("실행.");
	}

	// byte 기반 출력스트림.
	public static void write1() {
		try {
			FileOutputStream fos = new FileOutputStream("c:/Dev/data1.dat");
			byte a = 10, b = 20, c = 30;

			fos.write(a);
			fos.write(b);
			fos.write(c);

			fos.flush();
			fos.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("실행");
	}

}
