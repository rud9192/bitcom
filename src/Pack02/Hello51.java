package Pack02;

interface A4 {
	void f1();
}

interface B4 {
	void f2();
}

class C4 implements A4, B4{
	public void f1() {
		System.out.println(1);
	}
	public void f2() {
		System.out.println(2);
	}
}

public class Hello51 {

	public static void main(String[] args) {
		C4 t = new C4();
		t.f1();
		t.f2();
		
	}
}