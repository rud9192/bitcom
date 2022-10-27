package Pack01;
/*
 * 생성자를 만들지 않으면 디폴트 생성자를 자동으로 만들어 준다.
 * 생성자를 만들면 디폴트 생성자를 만들지 않는다.
 * 생성자를 만들때 디폴트 생성자는 만드는 것을 원칙으로 한다.
 */
class Tiger10{
	Tiger10(){
//		System.out.println(2);
	}
	
}

public class Hello34 {

	public static void main(String[] args) {
		Tiger10 t = new Tiger10(); // 프로그래머가 생성자를 작성하지 않으면 디폴트 생성자를 만든다.
		System.out.println(1);
	}

}