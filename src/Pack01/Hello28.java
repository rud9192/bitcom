package Pack01;
/*
 * 인자 전달.
 */
class Lion2{
	void cry() {
		System.out.println("어흥");
	}
}

class Tiger4{
//	int a = 10, String b = 호랑이 ch = 책 <대입연산>
//	String으로 인수전달 받았다는 것은 클래스로 전달 받았다. 즉 인수전달에서 객체(클래스) 사용이 가능하다
	void func(int a, String b, char ch, Lion2 lion) {
		System.out.println(a + b + ch);
		System.out.println("2 : " + lion.hashCode());
		lion.cry(); // Lion 클래스의 Cry 메서드 실행.
	}
}

public class Hello28 {

	public static void main(String[] args) {
		Tiger4 t = new Tiger4();
		Lion2 l = new Lion2();
		System.out.println("1 : " + l.hashCode());
		t.func(10, "호랑이", '책', l); // l, lion이 동일한 객체
		
	}

}
