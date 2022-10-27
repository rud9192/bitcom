//import java.util.Random;
/*
package Pack02;

class Tiger {

}

public class Hello43 {

	public static void main(String[] args) {
		Tiger t = new Tiger();
		
	}

}
*//////////////////////////////////////////////////////////////////////////////////////////////////////////////

package Pack02;

public class Hello43 {

	public static void main(String[] args) {
		String s = "무궁화꽃이피었습니다. ";
		// 1)
		System.out.println(s.length()); // 길이
		// 2)
		System.out.println(s.charAt(3)); // index 안에 3번째 문자
		// 3)
		System.out.println(s.indexOf("무")); // index 안에 일치하는 문자 위치
		System.out.println(s.indexOf("나무")); // index 안에 일치하는 문자 위치 못찾을 경우 -1 리턴
		if(s.indexOf("나무") == -1) {
			System.out.println(" not found ");
		}else {
			System.out.println(" find ");
		}
		// 4)
		System.out.println(s.replace("꽃이", "나무가")); // 리턴값이 변경된 것이다. 원본값 변경 X
		System.out.println(s); // 원본은 변경되면 안된다.
		String newString = s.replace("꽃이", "식물이");
		System.out.println(newString);
		
		// 5)
		System.out.println(s.substring(3)); // index 3번부터 끝까지 잘라서 리턴
		
		// 6)
		System.out.println(s.substring(3, 5)); // a ~ b-1 리턴 index 3,4만 리턴
	}

}

/*
package Pack02;

import java.util.Scanner;

public class Hello43 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		System.out.println("입력된 숫자는 : " + num + "입니다");
	}
}
*/
/*
package Pack02;

class Tiger {

}

public class Hello43 {

	public static void main(String[] args) {
		System.out.println(1);
		for (int i = 0; i < 5; i++) {
			// 특정 조건 만족한 이후에 함수실행을 끝내는 이러한 함수를 블로킹 함수라고 한다.
			try { Thread.sleep(1000);} catch (InterruptedException e) {}
			System.out.println(i*10);
		}
		
		System.out.println(2);
	}

}
*/
/*
package Pack02;

class Tiger {
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

public class Hello43 {

	public static void main(String[] args) {
		Tiger t1 = new Tiger();
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
*/
/*
package Pack02;
// 예외처리.
class Tiger {

}

public class Hello43 {

	public static void main(String[] args) {
		System.out.println(1);
		// 1. ArithmeticException
		// 프로그램이 중단되었다.
		try {			
			System.out.println( 4 / 0); // exception 이 발생할 경우 catch 수행.
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 2.ArrayIndexOutOfBoundsException 배열의 index가 경계영역을 벗어남
		int[] ar = new int[3];
		try {
			ar[3] = 10;	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String str = null;
		// 3.NullPointerException 객체가 생성되지 않았다.
		try {
			System.out.println(str.length());
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("무궁화 꽃이 피었습니다.");
		
	}

}
*/
// 삼항연산
/*
package Pack02;

public class Hello43 {

	public static void main(String[] args) {
		// ex1
		int num1;
		if( true ) {
			num1 = 10;
		}else {
			num1 = 20;
		}
		
		num1 = true ? 10 : 20;
		
		// ex2
		if( true ) {
			System.out.println("호랑이");;
		}else {
			System.out.println("코끼리");
		}
		
		System.out.println( true ? "호랑이" : "코끼리");
		
		Tiger t = new Tiger();
		t.f1(3, 4);
		
		int num = 1234567;
		int cnt = 0;
		while (true) {
			System.out.println(num);
			if (num % 2 == 0) {
				num = num / 2;
				cnt++;
			} else {
				num = num * 3 + 1;
				cnt++;
			}
			
			num = num % 2 == 0 ? num / 2 : num * 3 + 1;

			if (num == 1) {
				System.out.println(num);
				System.out.println("CNT : " + cnt);
				break;
			}

		}
	}

}

class Tiger {
	int f1(int a, int b) {
//		if(a > b) {
//			return 1000;
//		}else {
//			return 2000;
//		}
		
		return a > b ? 1000 : 2000; // 조건 ? (true) : (false)
	}
}
*/


/*
package Pack02;
// 업캐스팅
import java.util.Random;

interface Animal {
	abstract void cry() ;
}

class Dog implements Animal{
	public void cry() {
		System.out.println(" 멍 멍 ");
	}
}

class Cat implements Animal{
	public void cry() {
		System.out.println(" 야 옹 ");
	}
}

public class Hello43 {

	public static void main(String[] args) {
		Animal t = new Dog();
		t.cry();
	}
}
*/
/*
package Pack02;
// 업캐스팅
import java.util.Random;

class Animal {
	void cry() {
		System.out.println(" 잉 잉 ");
	}
}

class Dog extends Animal{
	void cry() {
		System.out.println(" 멍 멍 ");
	}
}

class Cat extends Animal{
	void cry() {
		System.out.println(" 야 옹 ");
	}
}

class Snake extends Animal {
	
}

public class Hello43 {

	public static void main(String[] args) {
//		Dog t1 = new Dog();
//		Cat t2 = new Cat();
//		Snake t3 = new Snake();
//		
//		for (int i = 0; i < 5; i++) {
//			
//			switch (new Random().nextInt(3)) {
//			case 0:
//				t1.cry();
//				break;
//			case 1:
//				t2.cry();
//				break;
//			case 2:
//				t3.cry();
//				break;
//			default:
//				break;
//			}
//		}
		
		int[] arr = new int[3];
		
		Animal[] ani = new Animal[] {new Dog(), new Cat(), new Snake()};
		
		for (int i = 0; i < 5; i++) {
			ani[new Random().nextInt(3)].cry();
		}
		
	}

}
*/
/*
package Pack02;

class Animal {
	void cry() {
		System.out.println(" ing ing ");
	}
}

class Dog extends Animal{
	void cry() {
		System.out.println(" 멍 멍 ");
	}
}

class Cat extends Animal{
	void cry() {
		System.out.println(" 야 옹 ");
	}
}

class Snake extends Animal{
}

class Zoo {
	void sound(Animal ani) {
		ani.cry();
	}	
}

public class Hello43 {

	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		zoo.sound(new Dog());
		zoo.sound(new Cat());
		zoo.sound(new Snake());
		
		
		
		Animal t1 = new Dog();
		Animal t2 = new Cat();
		Animal t3 = new Snake();
		
		t1.cry();
		t2.cry();
		t3.cry();
	}

}
*/
/*
package Pack02;
// 클래스의 결과나 인터페이스나 동일하다.
class A {
	void f1() {
		System.out.println(1);
		}
	void f2() {
		System.out.println(2);
	}
	void f3() {
		System.out.println("f3call");
		f4();
	}
	void f4() {
		System.out.println("p f4");

	}
}
class B extends A {
	void f2() {
		System.out.println(3);
	}
	void f4() {
		System.out.println("c f4");
	}
}

public class Hello43 {

	public static void main(String[] args) {
		// 부 = 자 (업캐스팅 형태) 부모클래스의 함수를 실행하기 전에 자식클래스에 함수가 존재하는지 확인 후 존재하면 자식클래스의 함수를 실행.
		A t = new B();
		t.f1();
		t.f2();
		t.f3();
	}

}
*/
/*
package Pack02;

class A {
	void f1() {}
}

class B extends A {
	void f2() {}

}

public class Hello43 {

	public static void main(String[] args) {
		// 상속과는 무관하다.
		A t1 = new A();
		t1.f1();
		// 업캐스팅
		A t2 = new B();
		t2.f1();
		//t2.f2();  메모리는 있지만 접근을 할 수 없다.
		
		// 자바에서 지원하지 않는다.(다운캐스팅)
		//B t3 = new A();
		
		// 자식것을 보고 없으면 부모것을 살펴본다.
		B t4 = new B();
		t4.f1();
		t4.f2();
		
	}

}
*/
/*
package Pack02;
class A{
	void f1() {
		System.out.println(1);
	}
}

interface B {
	void f2();
}

interface C {
	void f3();
}

class D extends A implements B, C {
	public void f2() {
		System.out.println(2);
	}
	public void f3() {
		System.out.println(3);
	}
}

public class Hello43 {

	public static void main(String[] args) {
		D t = new D();
		t.f1();
		t.f2();
		t.f3();
		
	}

}
*/
/*
package Pack02;

interface A {
	void f1();
}

interface B {
	void f2();
}

class C implements A, B{
	public void f1() {
		System.out.println(1);
	}
	public void f2() {
		System.out.println(2);
	}
}

public class Hello43 {

	public static void main(String[] args) {
		C t = new C();
		t.f1();
		t.f2();
		
	}

}
*/

/*
package Pack02;
// abstract, interface 동일한 조건일 경우 interface로 작성한다.
// abstract은 클래스 이기 때문에 다중상속을 시킬 수 없다.
// interface는 다중상속이 가능하다.
interface Tiger {
	abstract void f1();
	abstract void f2();
}
// 부모의 인터페이스를 구현하는 함수는 반드시 public 이어야 한다.
class Lion implements Tiger{
	public void f1() {
		System.out.println(1);
	}
	public void f2() {
		System.out.println(2);
	}
}

public class Hello43 {

	public static void main(String[] args) {
		Lion t = new Lion();
		t.f1();
		t.f2();
	}

}
*/
/*
package Pack02;

abstract class 대장장이 {
	void 칼() {
		System.out.println("칼 만듬");
	}
	abstract void 방패();
}

class 병사1 extends 대장장이 {
	void 방패() {
		System.out.println("스텔리도 구해서 사용함");
	}
}

class 병사2 extends 대장장이 {
	void 방패() {
		System.out.println("나무방패 만들어 사용함");
	}
}
public class Hello43 {

	public static void main(String[] args) {
		병사1 t1 = new 병사1();
		병사2 t2 = new 병사2();
		t1.칼();
		t1.방패();
		t2.칼();
		t2.방패();
		
	}

}
*/
/*
package Pack02;

abstract class Tiger {
	// 추상 함수이다.
	// 추상함수를 1개라도 가지는 클래스는 반드시 추상클래스이어야 한다.
	abstract void f1(); // 미완성코드 (abstract : 추상)
	//완성된 코드
	void f2() {
		System.out.println(1);
	}
}
// 상속받은 자식은 반드시 부모의 미완성 코드를 완성해야 한다.
// override 문법을 이용해서
class Lion extends Tiger {
	void f1() {
		System.out.println(2);
	}
}

public class Hello43 {

	public static void main(String[] args) {
		//추상클래스는 개체 생성을 할 수 없다.
		Lion t = new Lion();
		t.f1();
		t.f2();
	}

}
*/
/*
ex45)
package Pack02;
// 상속은 is a, has a 관계를 가진다.
class Animal {

}
// 자식은 부모이다.
// 사자는 동물이다. (is a 관계 lion is a animal)
class Lion extends Animal {
	
}

class Weapon {
	
}
// 자식은 부모를 가지고 있다.
// 경찰은 무기를 가지고 있다. (has a 관계 Police has a Weapon)
class Police extends Weapon {
	
}
public class Hello43 {

	public static void main(String[] args) {
		Animal t = new Animal();
		
	}

}
*/
/*
//ex44) 다형성
package Pack02;

class A { // extends object 생략 (모든클래스는 object클래스를 상속받음.)
	void f1() {
		System.out.println(1);
	}
}
class B extends A{
	void f2() {
		System.out.println(2);
	}
}
class C extends B{
	void f3() {
		System.out.println(3);
	}
}
class D extends C{
	void f4() {
		System.out.println(4);
	}
}
class F extends A{
	void f5() {
		System.out.println(5);
	}
}

public class Hello43 {

	public static void main(String[] args) {
		D t1 = new D();
		t1.f4(); // f(1), f(2), f(3), f(4) 사용가능
		F t2 = new F();
		t2.f5(); // f(1), f(5) 사용가능
	}

}
*/
//ex43)
/*
package Pack02;
/*
 * 상속 : 기존 클래스가 가지고 있는 기능을 확장하는 것.
 * 		n차 상속이 가능하다.(자식클래스가 자식클래스를 상속 가능, 여러자식클래스가 하나의 부모클래스 상속 가능)
 * 		다중 상속은 불가능 하다 (부모클래스 두개를 자식클래스가 상속)
 * 단일 책임의 원칙 : 하나의 객체는 반드시 하나의 기능만을 가질 것, 기능을 추가하고 싶으면 아래 Tiger클래스를 확장해서 사용. (상속을 이용 : 기존 기능 + a)
 * 객체지향프로그램 개발 5대 원칙 : SOLID원칙
 * 
 */
// 부모클래스
/*
class Tiger {
	void f1() {
		System.out.println(1);
	}
	void f3() {
		System.out.println(31);
	}
}
// 자식클래스
class Lion extends Tiger{
	void f2() {
		System.out.println(2);
	}
	void f3() { // override
		System.out.println(32);
	}
	void f4() {
		this.f3();  // 자식클래스의 f3을 사용(this)
		super.f3(); // 부모클래스의 f3을 사용(super)
	}
}

public class Hello43 {

	public static void main(String[] args) {
//		Tiger t = new Tiger();
		Lion t = new Lion();
		t.f1();
		t.f2();
		t.f3();
		t.f4();
	}

}
*/
/*
//ex42)
package Pack02;

class Tiger {
	Lion f1(int a, String s, Tiger t, Lion l) {
		return new Lion();
	}
}

class Lion {
	
}

public class Hello43 {

	public static void main(String[] args) {
		Tiger t = new Tiger();
		t.f1(10, "호랑이", new Tiger(), new Lion());
	}

}
*/