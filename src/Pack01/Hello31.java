package Pack01;
/*
 * staic : 정적(고정) != 동적(dynamic)
 */
class Tiger7{
	static int count;
	static void f1() { // static 선언시에 메모리 할당. 처음부터 메모리가 존재하기 때문에 객체선언을 하지않고도 사용할 수 있다.
		System.out.println("call1");
	}

	void f2() { // new 선언 시에 메모리 할당.
		System.out.println("call2");
	}
	
	void f3() {
		f2();
		System.out.println("call3");
	}
	static void f4() {
//		f2(); 스태틱 함수 안에서는 반드시 스태틱멤버만 사용가능하다.
	}
}

public class Hello31 {

	public static void main(String[] args) {
		Tiger7.f1(); // new 객체 선언 전에 사용할 수 있다.
		//Tiger4.f2(); //사용 불가
		Tiger7 t = new Tiger7();
		t.f2();
		t.f3();
//		System.out.println(f3()); return이 없으므로 사용이 안됨.
		//예
		System.out.println(Math.abs(-100)); // Math는 클래스 이고 abs는 스태틱으로 선언돼 선언 없이 바로 사용가능하다.
	}
}