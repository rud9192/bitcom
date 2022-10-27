//ex44) 다형성
package Pack02;

class A46 { // extends object 생략 (모든클래스는 object클래스를 상속받음.)
	void f1() {
		System.out.println(1);
	}
}
class B46 extends A46{
	void f2() {
		System.out.println(2);
	}
}
class C46 extends B46{
	void f3() {
		System.out.println(3);
	}
}
class D46 extends C46{
	void f4() {
		System.out.println(4);
	}
}
class F46 extends A46{
	void f5() {
		System.out.println(5);
	}
}

public class Hello46 {

	public static void main(String[] args) {
		D46 t1 = new D46();
		t1.f4(); // f(1), f(2), f(3), f(4) 사용가능
		F46 t2 = new F46();
		t2.f5(); // f(1), f(5) 사용가능
	}

}