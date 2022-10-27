package Pack02;
// 클래스의 결과나 인터페이스나 동일하다.
class A1 {
	void f1() {
		System.out.println(1);
		}
	void f2() {
		System.out.println(2);
	}
	void f3() {
		System.out.println("f3call");
		f4();
	}
	void f4() {
		System.out.println("p f4");

	}
}
class B1 extends A1 {
	void f2() {
		System.out.println(3);
	}
	void f4() {
		System.out.println("c f4");
	}
}

public class Hello54 {

	public static void main(String[] args) {
		// 부 = 자 (업캐스팅 형태) 부모클래스의 함수를 실행하기 전에 자식클래스에 함수가 존재하는지 확인 후 존재하면 자식클래스의 함수를 실행.
		A1 t = new B1();
		t.f1();
		t.f2();
		t.f3();
	}

}