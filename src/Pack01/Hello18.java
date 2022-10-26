package Pack01;

public class Hello18 {

	public static void main(String[] args) {
		String[] arr = new String[4];
		arr[0] = "앵무새0";
		arr[1] = "앵무새1";
		arr[2] = "앵무새2";
		arr[3] = "앵무새3";

		String[] brr = new String[] { "호랑이", "코끼리", "독수리" };
		String[] crr = { "호랑이1", "호랑이2", "호랑이3" };

		System.out.println(arr[2]);
		for (int i = 0; i < brr.length; i++) {
			System.out.print(brr[i] + " ");
		}
		System.out.println();
		for (String value : crr) {
			System.out.print(value + " ");
		}
		System.out.println();
	}

}
