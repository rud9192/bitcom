package Pack01;
/*
 * 
 */

class Person1{
	// 필드는 외부에 오픈시키지 않는다.
	// 데이터 은닉 private
	private String name = "홍길동";
	private int age = 20;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

public class Hello25 {

	public static void main(String[] args) {
		Person1 p1 = new Person1();
		//p1.name = "강길동";
		//p1.age = 30;
		//System.out.println(p1.name + " " + p1.age);
		p1.setName("강길동");
		System.out.println(p1.getName());
	}

}
