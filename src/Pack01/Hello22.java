package Pack01;

import java.util.Random;

/*
 * 랜덤 함수
 */
public class Hello22 {

	public static void main(String[] args) {
		Random rn = new Random();
//		for (int i = 0; i < 10; i++) {
		// integer범위 만큼 +- 20억 숫자를 랜덤하게 얻는다.
//			System.out.println(rn.nextInt());			

		// 0 <= x < 10
//			System.out.println(rn.nextInt(10));
//		}

//		for (int i = 0; i < 10; i++) {
//			System.out.println(new Random().nextInt(50));
//		}

		int[][] arr = new int[3][4];

		for (int k = 0; k < 5; k++) {
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 4; j++) {
					arr[i][j] = rn.nextInt(20);
					System.out.printf("%3d", arr[i][j]);
				}
				System.out.println();
			}
			int cnt = 0;
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 3; j++) {
					cnt += arr[j][i];
				}
				System.out.printf("%3d", cnt);
				cnt = 0;
			}
			System.out.println();
			System.out.println();
		}

	}
}
