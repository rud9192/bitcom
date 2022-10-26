package Pack01;

public class Hello10 {

	public static void main(String[] args) {
		char ch = 'A'; // 문자 A의 아스키코드값 65
		System.out.println(ch);
		// println은 ch가 무슨타입인지 확인
		// 문자타입이라고 확인하고 숫자를 아스키문자로 출력
		System.out.println((int) ch);
		// 강제 형 변환(단, 현재라인에서만 적용된다.)
		// Type casting
		System.out.println((char) 65);
		System.out.println("----------");

		char ch2 = 'A';
		for (int i = 0; i < 26; i++) {
			System.out.println(ch2 + i);
			System.out.println((char) (ch2 + i));
		}

	}

}
