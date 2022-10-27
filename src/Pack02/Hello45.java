//ex43)

package Pack02;
/*
 * 상속 : 기존 클래스가 가지고 있는 기능을 확장하는 것.
 * 		n차 상속이 가능하다.(자식클래스가 자식클래스를 상속 가능, 여러자식클래스가 하나의 부모클래스 상속 가능)
 * 		다중 상속은 불가능 하다 (부모클래스 두개를 자식클래스가 상속)
 * 단일 책임의 원칙 : 하나의 객체는 반드시 하나의 기능만을 가질 것, 기능을 추가하고 싶으면 아래 Tiger클래스를 확장해서 사용. (상속을 이용 : 기존 기능 + a)
 * 객체지향프로그램 개발 5대 원칙 : SOLID원칙
 * 
 */
// 부모클래스
class Tiger45 {
	void f1() {
		System.out.println(1);
	}
	void f3() {
		System.out.println(31);
	}
}
// 자식클래스
class Lion45 extends Tiger45{
	void f2() {
		System.out.println(2);
	}
	void f3() { // override
		System.out.println(32);
	}
	void f4() {
		this.f3();  // 자식클래스의 f3을 사용(this)
		super.f3(); // 부모클래스의 f3을 사용(super)
	}
}

public class Hello45 {

	public static void main(String[] args) {
//		Tiger t = new Tiger();
		Lion45 t = new Lion45();
		t.f1();
		t.f2();
		t.f3();
		t.f4();
	}

}
