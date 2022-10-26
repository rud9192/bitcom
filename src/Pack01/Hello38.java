package Pack01;
/*
 * this의 용법 1
 * 생성자 함수의 인수명과 필드명을 구분하기 위하여 사용된다.
 */
class Tiger14{
	String name;
	int age;
	
	Tiger14(){}
	Tiger14(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Tiger4 [name=" + name + ", age=" + age + "]";
	}
}

public class Hello38 {

	public static void main(String[] args) {
		Tiger14 t = new Tiger14("호랑이", 20);
		System.out.println(t.toString());

	}

}