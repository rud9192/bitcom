package Pack01;
/*
 * 이차원 배열
 */
public class Hello21 {

	public static void main(String[] args) {
		int[] arr = new int[3];
		int[][] brr = new int[5][3]; // [세로][가로] 끝에서부터 해석 3번 가로줄 생기고 5번 세로줄 생성.
		int[][][] crr = new int [2][5][3]; 
		System.out.println("test세로 : " + brr.length); // 세로길이 탐색
		System.out.println("test가로 : " + brr[0].length); // 가로길이 탐색
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				brr[i][j] = i * 3 + j;
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("%3d", brr[i][j]);
			}System.out.println();
		}
	}
}