package Pack01;

public class Hello12 {

	static void f1(int a, int b) {
		System.out.println(a + " " + b);
	}

	public static void main(String[] args) {
		int a = 3;
		int b = a++; // 대입 후 증가
		int c = 3;
		int d = ++c; // 증가 후 대입
		System.out.println(b + " " + d);

		int n1 = 3, n2 = 3;
		f1(n1++, ++n2);
		/*
		 * int a = n1++ int b = ++n2 인수전달에 대입연산(=)이 생략되어있다.
		 */

		/*
		 * 자료가 10의 크기를 가질때 자료를 순회하면서 하나씩 가져오거나 저장할때 이터레이터를 사용하여 이터레이터 연산중 이터레이터++,
		 * ++이터레이터 두 명령이 존재한다. 이때 두 명령의 속도는 30배 정도 차이가 난다. <++이터레이터를 쓰자>
		 */

	}

}
