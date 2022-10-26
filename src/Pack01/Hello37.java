package Pack01;
/*
 * this는 new를 이용해서 생성된 객체를 공유하는 변수이다.
 * 자기 자신이 생성되었을 때의 객체를 공유
 */
class Tiger13{
	//Tiger this;
	int num;
	Tiger13(){
		//this = t; 공유가 되었다.
		System.out.println(this.hashCode());
	}
	void f1() {
		
	}
	void f2() {
		this.f2();
	}
}

public class Hello37 {

	public static void main(String[] args) {
		Tiger13 t = new Tiger13();
		System.out.println(t.hashCode());
		t.num = 20;
		
		Tiger13 t2 = new Tiger13();
		
	}

}