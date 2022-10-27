package Pack02;

class Tiger19 {
	void f1() {
		System.out.println(1);
		try {
			throw new Exception();	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	void f2() throws Exception{ // 호출한 사람이 exceptiron을 처리해 달라는 요구를 하고싶을 때 void ~() throws Exception{ 이라 작성한다.
		System.out.println(2);
		throw new Exception();
	}
}

public class Hello60 {

	public static void main(String[] args) {
		Tiger19 t1 = new Tiger19();
		t1.f1();
		
		//Unhandled exception type Exception
		try {
			t1.f2();			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}

}