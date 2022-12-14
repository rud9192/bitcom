package Pack02;
// abstract, interface 동일한 조건일 경우 interface로 작성한다.
// abstract은 클래스 이기 때문에 다중상속을 시킬 수 없다.
// interface는 다중상속이 가능하다.
// 공통된 기능이 필요하다면 추상클래스를 이용해서 일반 메서드를 작성하여 
// 자식 클래스에서 사용할 수 있도록 하면 된다.
interface Tiger50 {
	abstract void f1();
	abstract void f2();
}
// 부모의 인터페이스를 구현하는 함수는 반드시 public 이어야 한다.
// 인터페이스의 메서드는 전부 재선언 해야한다. ( 추상메서드가 없어야 한다. )
class Lion50 implements Tiger50{
	public void f1() {
		System.out.println(1);
	}
	public void f2() {
		System.out.println(2);
	}
}

public class Hello50 {

	public static void main(String[] args) {
		Lion50 t = new Lion50();
		t.f1();
		t.f2();
	}

}