package Pack04;

interface Test1 {
	void f1();
}
//사용 1)
class Tiger76 implements Test1 {
	@Override
	public void f1() {
		System.out.println(1);
	}
}

public class Hello76 {

	public static void main(String[] args) {
		Tiger76 t1 = new Tiger76();
		t1.f1();
		
		// 사용2 익명 클래스
		Test1 t2 = new Test1() {
			@Override
			public void f1() {
				System.out.println(2);
			}
		}; t2.f1();
		
		// 사용3 람다식
		Test1 t3 =() -> {
			System.out.println(3);
		};t3.f1();
		
		// 사용4 익명 객체
		new Test1() {
			@Override
			public void f1() {
				System.out.println(4);
			}
		}.f1();
		
		// 응용1
		Thread t5 = new Thread() {
			public void run() {
				System.out.println("thread start");
				System.out.println("thread end");
			}
		};t5.start();
		
		//응용2
		new Thread() {
			public void run() {
				System.out.println("thread start2");
				System.out.println("thread end2");
			}
		}.start();
	}

}








/*
package Pack04;

interface Test1 {
	void f1();
}

interface Test2 {
	int f1();
}

class Tiger77 {
	void f2(Test1 t) {
		t.f1();
	}
	void f3(Test2 t) {
		System.out.println(t.f1());
	}
	
	Test1 f4() {
		return () -> {
			System.out.println(555);
		};
	}
}

public class Hello76 {

	public static void main(String[] args) {
		Test1 t1 = () ->{
			System.out.println("1");
		}; t1.f1();
		
		Tiger77 tiger = new Tiger77();
		tiger.f2(new Test1() {
			@Override
			public void f1() {
				System.out.println(10);
				System.out.println(20);
				System.out.println(30);
			}
		});
		tiger.f2( () -> {
			System.out.println(40);
			System.out.println(50);
			System.out.println(60);
		});
		
		tiger.f3(new Test2() {
			@Override
			public int f1() {
				return 888;
			}
		});
		
		tiger.f3(() -> {
			return 999;
		});
		
		tiger.f3( () -> 1000);
		
		Test1 t2 = tiger.f4();
		t2.f1();
		
		tiger.f4().f1();
	}

}




package Pack04;


@FunctionalInterface // 함수를 한개만 작성하겠다.
interface Test1 {
	void f1();
	
//	void f2(char c, char d);
	// 자바 컴파일러는 함수형 인터페이스에 두 개 이상의 메소드가 선언되면 오류를 발생시킵니다.
	// 람다식은 구현하는 인터페이스에 추상메서드가 딱 1개 있을 때에만 가능하다.
	// 추상메서드가 1개만 있는 인터페이스를 함수형 인터페이스라고 한다.
	// 인터페이스에 추상 메서드가 2개 이상이라면 무명 객체 생성, 구현 클래스 만들어서 객체 생성중 하나를 사용해야 함.
}

interface Test2 {
	void f1(int num);
}

interface Test3 {
	void f1(int num, String str);
}

interface Test4 {
	int f1();
}

interface Test5 {
	int f1(int num);
}

public class Hello76 {
	public static void main(String[] args) {
		// 익명 클래스로 객체 생성
//		Test1 t1 = new Test1() {
//			@Override
//			public void f1() {
//				System.out.println("f1 call");
//			}
//		};
//		t1.f1();
//		
		Test1 t1 = () -> {
			System.out.println("f1 call");
		}; t1.f1();
		
		Test2 t2 = new Test2() {
			@Override
			public void f1(int num) {
				System.out.println(num + " 입니다. ");
			}
		}; t2.f1(100);
		
		// 인수 전달이 한개일 때만 ()를 생략 할 수 있다.
		// 거의 대부분의 프로그램에서는 ()를 생략한다.
		Test2 t3 = num -> {
			System.out.println(num + " 입니다. ");
		}; t3.f1(100);
		
		Test3 t4 = (n, s) -> {
			System.out.println(n + s);
		}; t4.f1(300, "홍길동");
		
		Test4 t5 = () -> {
			return 400;
		}; System.out.println(t5.f1());
		
		// 단문장 일때는 {}와 return을 생략할 수 있다.
		// {}와 return을 같이 생략해야한다.
		// 생략이 일반적이다.
		Test4 t6 = () -> 500;
		System.out.println(t6.f1());

		// 약식의 의미를 가질때 사용하는 코드 : 슈가 코드
		Test5 t7 = n -> n + 600;
		System.out.println(t7.f1(700));
	}
}




package Pack04;
// 람다 함수 : 함수적 프로그래밍
public class Hello76 {
	static void func() {
		
	}
	public static void main(String[] args) {
		func( void f1() {System.out.println()});
	}

}
*/