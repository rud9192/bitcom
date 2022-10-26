package Pack01;
/*
 * 생성자에서 다른생성자를 콜 시킬 필요성이 있을때 사용한다.
 */
class Tiger17{
	int x, y;
	
	Tiger17(){
		System.out.println(1);
	}
	Tiger17(int a){
		this();
		x = a * 33;
		System.out.println(2);
	}
	Tiger17(int a, int b){
		this(a); // 다른 생성자에 인수 전달 인수가 30 하나인 두번째 생성자가 실행된다.
		y = b;
		System.out.println(3);
		System.out.println("x : " + x + " y : " + y);
	}
}

public class Hello41 {

	public static void main(String[] args) {
		Tiger17 t = new Tiger17(10, 20);

	}

}