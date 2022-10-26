package Pack01;
/*
* this의 용법 2
* 함수 호출의 체이닝을 쓰기 위해서
*/
class Tiger16{
	Tiger16 f1() {
		System.out.println("아침먹고");
		return this;
	}
	Tiger16 f2() {
		System.out.println("점심먹고");
		return this;
	}
	Tiger16 f3() {
		System.out.println("저녁먹고");
		return this;
	}
}

public class Hello40 {

	public static void main(String[] args) {
		Tiger16 t = new Tiger16();
		t.f1().f2().f3(); // 하나씩 ;을 찍지 않고 체이닝을 하는 이유 : 서로 관련성 있는 코드들을 같이 작성 하고 코드의 난입을 막는 용도.
		
//		예시
		t.f1();
		System.out.println("잔다."); //  코드의 난입을 막기 위헤.
		t.f2();
		t.f3();

	}

}