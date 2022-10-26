package Pack01;
/*
 * 리턴 사용 방법.
 */
class Tiger3 {
	int func() {
		return 100;
	}
	void test() {
		
	}
}

public class Hello27 {

	public static void main(String[] args) {
		Tiger3 t = new Tiger3();
//		1. 버린다.
		t.func(); // 리턴값은 다음 줄로 넘어가면 사라짐.
		
//		2. 변수로 받아서 사용
		int num = t.func();
		System.out.println(num * 10);
		
//		3. 바로 출력으로 연결
		System.out.println(t.func());
		
//		System.out.println(t.test());
//		return이 없으므로 출력을 할 수 가 없다.
		
	}

}
