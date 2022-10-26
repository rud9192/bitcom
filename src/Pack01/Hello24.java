package Pack01;
/*
 * 
 */
class Tiger1 {
	int num;
	float count;
	String str;
}

public class Hello24 {

	public static void main(String[] args) {
		Tiger1 t1 = new Tiger1();
		Tiger1 t2 = new Tiger1();
		t1.num = 10;
		t1.count = 20.0f;
		t1.str = "호랑이";
		System.out.println(t1.num);
		
		t2.num = 30;
		t2.count = 40.0f;
		t2.str = "호랑이2";
		System.out.println(t2.num);
	}

}
