package Pack01;

public class Hello7 {
	public static void main(String[] args) {
		/*
		 * and(&&), or(||), not
		 */
		
		System.out.println(false && false);
		System.out.println(false && true);
		System.out.println(true && false);
		System.out.println(true && true);
		System.out.println("ㅡㅡㅡ");
		System.out.println(false || false);
		System.out.println(false || true);
		System.out.println(true || false);
		System.out.println(true || true);
		System.out.println("ㅡㅡㅡ");
		System.out.println(!false);
		System.out.println(!true);
//		System.out.println(true && false);
//		System.out.println(true && true);
		System.out.println("ㅡㅡㅡ");
		boolean test = true;
		System.out.println(!test);
//		System.out.println();
		System.out.println("ㅡㅡㅡ");
		System.out.println(true && false && true && true);
		System.out.println(!(true && false && true && true));
		System.out.println("ㅡㅡㅡ");
		//연산 순위 : 산술 > 관계 > 논리
		System.out.println(3+2>2 && 4-2<10 && 3*3>=8);
		// 5>2 && 2<10 && 9>=8
		// true && true && true
		// true && true
		// = true
		/*
		 * System.out.println(true && true || true); < -- 가독성 문제로 잘못됨
		 * System.out.println( (true && true) || true); 괄호사용하여 순서정해야함
		 * System.out.println( true && (true || true));
		 */
	}
}
