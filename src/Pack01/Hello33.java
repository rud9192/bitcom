package Pack01;
/*
 * 생성자
 * 1. 생성자 : 생성자 함수
 * 2. 생성자도 함수이기때문에 함수 오버로딩이 가능하다.
 * 3. 함수이름이 반드시 클래스 이름과 동일해야 한다.
 * 4. 인수전달을 할 수 있지만 리턴값을 가질 수 없다.
 * 5. 목적은 멤버 변수초기화가 유일한 목적이다.
 * 6. 객체가 생성(new)될 때 자동 호출이 되고 프로그래머가 임의로 호출할 수 없다.
 */
class Tiger9{
	Tiger9(){ // 생성자 함수. 디폴트 생성자.
		System.out.println("생성자 콜1");
	}
	Tiger9(int num){
		System.out.println("생성자 콜2");
	}
}

public class Hello33 {

	public static void main(String[] args) {
		System.out.println(1);
		Tiger9 t = new Tiger9();
		System.out.println(2);
		Tiger9 t2 = new Tiger9(100);
		System.out.println(3);
		
	}

}