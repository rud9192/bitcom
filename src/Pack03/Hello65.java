package Pack03;

class A65{
	void showMeTheMoney() {
		System.out.println(1);
	}
}

class B65 extends A65{
	@Override
	void showMeTheMoney() {
		System.out.println(2);
	}
}

interface C {
	void f1();
}

class D implements C {
	// 코드 자동 완성을 이용하였다.
	@Override
	public void f1() {
		
	}
}

public class Hello65 {

	public static void main(String[] args) {
		A65 a = new B65();
		a.showMeTheMoney();
	}

}
