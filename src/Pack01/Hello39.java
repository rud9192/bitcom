package Pack01;
/*
* this의 용법 2
* 함수 호출의 체이닝을 쓰기 위해서
*/
class Tiger15{
	Tiger15 f1() {
		System.out.println(this.hashCode());
		return this;
	}
	Tiger15 f2() {
		System.out.println("f2 call");
		return this;
	}
	void f3() {
		System.out.println("f3 call");
	}
}

public class Hello39 {

	public static void main(String[] args) {
		Tiger15 t = new Tiger15();
		System.out.println(t.hashCode());
		Tiger15 t2 =t.f1();
		System.out.println(t2.hashCode());
		
		Tiger15 tiger = new Tiger15();
		tiger.f1().f1().f1().f2().f3();; // 체이닝 기법 자신객체를 리턴받아 계속 .을 찍을 수 있음
	}

}