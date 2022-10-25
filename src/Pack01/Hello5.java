package Pack01;

public class Hello5 {
	public static void main(String[] args) {
		System.out.println(27 + 4);
		System.out.println(27 - 4);
		System.out.println(27 * 4);
		System.out.println(27 / 4); //몫 
		System.out.println(27 % 4); //나머지 result : 0~3

/*
 * 	왼쪽에서 오른쪽으로 해석
 * 숫자 + 문자열 = 문자열
 * 문자열 + 숫자 = 문자열
 * 문자열 + 문자열 = 문자열
 */
		System.out.println(27 + "ghfkddl");
		System.out.println("ghfkddl" + 27 + 30);
		System.out.println(27 + 30 + "ghfkddl");
		System.out.println(27 + 30 + "ghfkddl" + 27 + 30);
		System.out.println("ghfkddl" + "zhRLfl");
		
		int a, b;
		a = 10;
		b = 20;
		
		System.out.println(a + "ghfkddl" + a + b);
	}
}
