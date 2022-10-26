package Pack01;

public class Hello09 {

	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			System.out.println(i);
		}
		for (int i = 1; i <= 4; i++) {
			System.out.println(i);
		}
		for (int i = -4; i <= 4; i++) {
			System.out.println(i); // 좌표에서 주로사용
		}

		// bad 코드
//		for (int i = 0; i <= 4; i++) {
//			
//		}
//		for (int i = 2; i <= 4; i++) {
//			
//		}
//		for (int i = 0; i <= 4; i+=2) {
//			
//		}
//		for (int i = 0; i > 4; i+=2) {
//			
//		}
		
		int num = 5;
		for (int i = 0; i < 10; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}

		int sum = 0;
		num = 10;
		for (int i = 0; i <= num; i++) {
			sum = sum + i;
		}
		System.out.println(sum);

		// sum + i = sum += i 복합대입연산자

	}

}
