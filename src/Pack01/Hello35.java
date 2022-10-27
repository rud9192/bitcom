package Pack01;

class Tiger11{
	String name = "홍길동";
	int age = 20;
	Tiger11(){
		name = "이순신";
		age = 30;
	}
	Tiger11(String n, int a){
		this.name = n;
		this.age = a;
	}
	void showData() {
		System.out.println(name + " " + age);
	}
	@Override
	public String toString() {
		return "Tiger11 [name=" + name + ", age=" + age + "]";
	}
	
}

public class Hello35 {

	public static void main(String[] args) {
		Tiger11 t1 = new Tiger11();
		t1.showData();
		System.out.println(t1.toString());

		Tiger11 t2 = new Tiger11();
		t2.showData();
		
		Tiger11 t3 = new Tiger11("호랑이", 40);
		t3.showData();
	}

}