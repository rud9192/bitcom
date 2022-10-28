package Pack03;

import java.io.*;

public class Hello71 {
	public static void main(String[] args) {
		System.out.println("start");
		System.out.println("end");
		
		try {
			// 파일을 오픈시킨다. 
			// 반드시 w.close 코드를 작성해 입력을 종료 시켜준다.
			Writer w = new FileWriter("sample.txt");
			w.write("apple\n");
			w.write("호랑이");
			w.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		} // 업캐스팅 문법
	}
}
