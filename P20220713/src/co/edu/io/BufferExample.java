package co.edu.io;

import java.io.*;
import java.util.Scanner;

// 보조스트림 생성. 바이트기반 -> 문자기반 (InputStreamReader, OutputStreamWriter)
//               버퍼스트림(성능향상)
public class BufferExample {

    public static void main(String[] args) {
    	bufferReaderWriter();
    }
    // 버퍼스트림
    public static void bufferReaderWriter() {
        try {
            FileInputStream fis = new FileInputStream("c:/Dev/img.jpg");  // 기본
            BufferedInputStream bis = new BufferedInputStream(fis);     // 보조

            FileOutputStream fos = new FileOutputStream("c:/Dev/buffer.jpg");
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            while (true) {
                int bt = bis.read();
                if (bt == -1) { break; }
                bos.write(bt);
            }
            bos.flush();
            bos.close();
            bis.close();
            fis.close();
            fos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("실행됨.");


    }

    public static void streamToWriter() {
        // 바이트 단위의 스트림 -> 문자스트림. (InputStreamReader, OutputStreamWriter)
        OutputStream os = System.out;     //  키보드를 통해 출력.
        OutputStreamWriter osw = new OutputStreamWriter(os);

        Scanner sc = new Scanner(System.in);
        System.out.print("입력> ");
        String text = sc.nextLine();

        try {
            osw.write(text + "\n");
            osw.write("실행완료.");
            osw.flush();
            osw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void streamToReader() {
        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        char[] cbuf = new char[10];
        System.out.print("입력> ");
        try {
            int b = isr.read(cbuf);
            for (int i = 0; i < cbuf.length; i++) {
                System.out.print((char) cbuf[i]);
            }
            isr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("실행됨.");
    }
}
