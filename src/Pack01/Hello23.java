package Pack01;
/*
 * 1. 파일 1개당 클래스 1개가 원칙
 * 2. 파일명은 클래스명과 동일하게 한다.
 * 3. 클래스명의 첫자는 대문자, 파일명의 첫자는 소문자
 * 4. 1개의 파일에 여러개의 클래스가 들어갈 수 있는데 반드시 1개만 public이어야 한다.
 * 5. Person 설계도이다.
 */
class Person {
//	1. 생성자
//	2. 필드(field)      	>> 변수
//	3. 메서드(method)   	>> 함수(function)
	
}
//	6. 객체생성항법
//	Person person = new Person();

public class Hello23 {

	public static void main(String[] args) {
		// new는 메모리를 사용하는 것이다.
		// 메모리 반납코드가 있어야 한다.
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());

		// 서로 다른 이름으로 객체를 공유(참조:reference)했다.
		// 사회 : 홍길동, 집 : 곰돌이 동일한 사람을 서로 다른 이름으로 사용.
		Person p4 = p1;
		System.out.println(p4.hashCode());

		// 메모리 반납코드가 있어야 한다.
		// 자바는 사용하지 않는다고 판단되면 자동으로 반납한다.(가비지 콜렉션)
	}

}