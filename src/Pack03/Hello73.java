package Pack03;

import java.io.*;

public class Hello73 {

	public static void main(String[] args) {
		System.out.println("start");
		
		try {
			Reader r = new FileReader("sample.txt");
			
			// Read : 파일 끝까지 읽어보고 읽을 데이터가 파일에 없다라고 판단될때는 -1 리턴
			while(true) {
				int readData = r.read();

				if(readData == -1) { System.out.println("파일 탈출"); break;
			}
				System.out.print((char)readData);
			}
			r.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("end");
	}

}
