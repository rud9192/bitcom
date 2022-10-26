package Pack01;

public class Hello17 {
	/*
	 * 일차원 배열 배열 < 한개 이상의 연속된 데이터를 관리하기 위하여 사용>
	 * 
	 */
	public static void main(String[] args) {
		int a = 10;

		// array
		// 방법1
		int[] arr = new int[1000];
		// 방법2
		int[] brr = new int[] { 1, 2, 3, 4, 5 };
		// 방법3
		int[] crr = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println(arr.length);
		System.out.println(brr.length);
		System.out.println(crr.length);

		for (int i = 0; i < brr.length; i++) {
			System.out.print(brr[i] + " ");
		}
		System.out.println();

		// i, value, item, x
		// 배열 crr 에서 하나씩 가져와 value에 대입.
		for (int value : crr) {
			System.out.print(value + " ");
		}
		System.out.println();

		int[] drr = new int[5];
//		0~4
//		ArrayIndexOutOfBoundsException
//		error : drr[5] = 100;
//		drr[2] = 100;
//		drr[2*5-7] = 100;
//		drr[drr[2]] = 2;
//		drr[drr[4]*3-5] = 999;

	}

}
