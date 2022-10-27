package Pack01;
/*
 * this 4번째 용법
 */
class Tiger18 {
	int money = 500;
	void f1() {
		System.out.println("tiger f1 call");
		Lion3 lion = new Lion3();
		lion.merry(this);
	}
	void f3() {
		System.out.println("Tiger f3 call");
	}
}

class Lion3 {
	void merry(Tiger18 t) {
		if(t.money >  600) {
			System.out.println("ok");
		}else {
			System.out.println("no");
		}
		System.out.println("lion f2 call");
		t.f3();
	}
}

public class Hello42 {

	public static void main(String[] args) {
		Tiger18 t = new Tiger18();
		t.f1();
	}

}
