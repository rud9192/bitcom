package Pack01;

public class Hello15 {
	/*
	 * 정확한 반복횟수를 알고 있을 때 for문 프로그래머가 정확한 반복횟수를 모를때 while문
	 */
	public static void main(String[] args) {
		int num = 0;
		while (num < 4) {
			System.out.println(num++);
		}

		while (true) {
			System.out.println(num++);
			if (num == 33) {
				System.out.println("탈출");
				break;
			}
		}

	}

}
