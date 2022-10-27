package Pack01;

class Tiger12{
	String name = "홍길동";
	int age = 20;
	
	Tiger12(){}
	Tiger12(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Tiger12 [name=" + name + ", age=" + age + "]";
	}
}

public class Hello36 {

	public static void main(String[] args) {
		Tiger12 t = new Tiger12("호랑이", 10);
		System.out.println(t.toString());

	}

}