package Pack02;

abstract class Tiger48 {
	// 추상 함수이다.
	// 추상함수를 1개라도 가지는 클래스는 반드시 추상클래스이어야 한다.
	abstract void f1(); // 미완성코드 (abstract : 추상)
	//완성된 코드
	void f2() {
		System.out.println(1);
	}
}
// 상속받은 자식은 반드시 부모의 미완성 코드를 완성해야 한다.
// override 문법을 이용해서
class Lion48 extends Tiger48 {
	void f1() {
		System.out.println(2);
	}
}

public class Hello48 {
	public static void main(String[] args) {
		//추상클래스는 개체 생성을 할 수 없다.
		Lion48 t = new Lion48();
		t.f1();
		t.f2();
	}

}