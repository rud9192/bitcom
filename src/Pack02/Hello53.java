package Pack02;

class A2 {
	void f1() {}
}

class B2 extends A2 {
	void f2() {}

}

public class Hello53 {

	public static void main(String[] args) {
		// 상속과는 무관하다.
		A2 t1 = new A2();
		t1.f1();
		// 업캐스팅
		A2 t2 = new B2();
		t2.f1();
		//t2.f2();  메모리는 있지만 접근을 할 수 없다.
		
		// 자바에서 지원하지 않는다.(다운캐스팅)
		//B t3 = new A();
		
		// 자식것을 보고 없으면 부모것을 살펴본다.
		B2 t4 = new B2();
		t4.f1();
		t4.f2();
		
	}

}