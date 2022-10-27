package Pack02;

abstract class 대장장이 {
	void 칼() {
		System.out.println("칼 만듬");
	}
	abstract void 방패();
}

class 병사1 extends 대장장이 {
	void 방패() {
		System.out.println("스텔리도 구해서 사용함");
	}
}

class 병사2 extends 대장장이 {
	void 방패() {
		System.out.println("나무방패 만들어 사용함");
	}
}
public class Hello49 {

	public static void main(String[] args) {
		병사1 t1 = new 병사1();
		병사2 t2 = new 병사2();
		t1.칼();
		t1.방패();
		t2.칼();
		t2.방패();
		
	}

}