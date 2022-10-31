package Pack04;

interface Test1 {
	void f1(int a, int b);
	
//	void f2(char c, char d);
	//자바 컴파일러는 함수형 인터페이스에 두 개 이상의 메소드가 선언되면 오류를 발생시킵니다.
	// 람다식은 구현하는 인터페이스에 추상메서드가 딱 1개 있을 때에만 가능하다.
	// 추상메서드가 1개만 있는 인터페이스를 함수형 인터페이스라고 한다.
	// 인터페이스에 추상 메서드가 2개 이상이라면 무명 객체 생성, 구현 클래스 만들어서 객체 생성중 하나를 사용해야 함.
}

public class Hello76 {
	public static void main(String[] args) {
		// 익명 클래스로 객체 생성
//		Test1 t1 = new Test1() {
//			@Override
//			public void f1() {
//				System.out.println("f1 call");
//			}
//		};
//		t1.f1();
//		
		Test1 t2 = (int a, int b) -> {
			System.out.println("f2 call");
		};
		
		t2.f1(3, 5);
	}
}



/*
package Pack04;
// 람다 함수 : 함수적 프로그래밍
public class Hello76 {
	static void func() {
		
	}
	public static void main(String[] args) {
		func( void f1() {System.out.println()});
	}

}
*/