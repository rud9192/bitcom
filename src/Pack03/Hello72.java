package Pack03;

import java.io.*;

public class Hello72 {

	public static void main(String[] args) {
		int width = 8, height = 7;
//		int width = 7, height = 8;
/*	
		try {
			// 파일을 오픈시킨다.
			Writer w = new FileWriter("sample.txt");
		
			for (int i = 0; i < height; i++) {
				
				if(i%2 != 0) {
					for (int j = 0; j < width; j++) {
						
						if(j%2 != 0) {
							w.write("X ");
						}else {
							w.write("O ");
						}
						
					}w.write("\n");
				}else {
					for (int j = 0; j < width; j++) {
						if(j%2 != 0) {
							w.write("O ");
						}else {
							w.write("X ");
						}
					}w.write("\n");
				}
			

			}
			w.close();
		}catch (IOException e) {}
*/
		try {
			Writer w = new FileWriter("sample.txt");
			
			for (int i = 0; i < height; i++) {
				for (int j = 0; j < width; j++) {
//					if((i+j)%2 == 0) {
//						w.write("O ");
//					}else {
//						w.write("X ");
//					}
					w.write( (i+j)%2 == 0 ? "O " : "X ");
					
				}w.write("\n");
			}
		
		w.close();
		}catch (IOException e) {}
		
	}

}
