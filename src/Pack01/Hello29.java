package Pack01;
/*
 * 인자 전달.
 */
class Lion{
	void cry() {
		System.out.println("어흥");
	}
}

class Tiger5{
	String f1() {
		// String 타입의 클래스 객체가 리턴된다.
		return null; // 일단 에러를 피하고 싶을 경우 return null을 사용 <나는 객체가 아니다>
	}
	Lion f2() {
		Lion lion = new Lion(); // 지역변수.
		System.out.println(lion.hashCode());
		return lion;
	}
}
public class Hello29 {
	public static void main(String[] args) {
		Tiger5 t = new Tiger5();
		System.out.println(t.f1());
		Lion l = new Lion();
		l.cry();
		System.out.println(t.f2());

//		for (int i = 0; i < 50; i++) {
//			t.f2();
//		}
//
//		
//		for (int i = 0; i < 50; i++) {
//			System.out.println(l.hashCode());
//		}

	}
}
