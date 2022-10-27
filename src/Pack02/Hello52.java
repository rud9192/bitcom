package Pack02;
class A3{
	void f1() {
		System.out.println(1);
	}
}

interface B3 {
	void f2();
}

interface C3 {
	void f3();
}

class D3 extends A3 implements B3, C3 {
	public void f2() {
		System.out.println(2);
	}
	public void f3() {
		System.out.println(3);
	}
}

public class Hello52 {

	public static void main(String[] args) {
		D3 t = new D3();
		t.f1();
		t.f2();
		t.f3();
		
	}

}