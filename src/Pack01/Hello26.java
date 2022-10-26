package Pack01;
/*
 * 메서드의 기본 형태
 */

class Tiger2{
//	void f1는 함수 원형 이라고 한다(prototype)
	
	
//	1
	void f1() {
		System.out.println(1);
	}
	
//	2
	void f2(int a) { // 인수 전달은 1개이상 할 수 있다.
		System.out.println(2);
	}
	
//	3
	int f3() { // 리턴은 1개만 할 수 있다.
		System.out.println(3);
		return 0;
	}
	
//	4
	int f4(int a) {
		System.out.println(4);
		return 0;
	}
}

public class Hello26 {

	public static void main(String[] args) {
		Tiger2 t = new Tiger2();
		t.f1();
		t.f2(10);
		t.f3();
		t.f4(0);

	}

}
