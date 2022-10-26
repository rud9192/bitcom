package Pack01;

class Tiger8{
	void f1() {
		
	}
	void f2() {
		// 스스로 자신의 클래스 타입으로 객체를 만들 수 있다.
		Tiger8 t = new Tiger8();
		t.f1();
	}
}

public class Hello32 {
	//생성자를 가질 수 있다.
	//필드를 가질 수 있다.
	//메서드를 가질 수 있다.
	int count = 100;
	void f1() {
		
	}
	void f2() {
		System.out.println(count);
		f1();
	}
	static void f3() {
		
	}
	
	public static void main(String[] args) {
//		System.out.println(count);
//		f1();
		f3();
		Hello32 h = new Hello32();
		h.f1();
		h.f2();
		h.f3();
	}

}
