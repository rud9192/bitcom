/*
package Pack03;

class A74{}
class B74 extends A74{}
class C74 extends A74{}

public class Hello74 {

	public static void main(String[] args) {
//		A74 t1 = new B74();
//		A74 t2 = new C74();
		
		A74 t1 = new B74(); // 객체 1개
		
		t1 = new C74(); // t1객체를 만들며 객체는 1개
		
		t1 = new B74(); // t1객체를 만들며 객체는 1개
		
		
		
	}

}
*/
// 데코레이션 패턴.

package Pack03;

class A74{
	int num = 30;
	int run() {
		System.out.println("A의 run Call");
		return num;
	}
}
class B74 extends A74{
	A74 a;
	int num = 20;
	B74(A74 a){
		this.a = a;
	}
	int run() {
		System.out.println("B의 run Call");
		return num + a.run();
	}
}
class C74 extends A74{
	A74 a;
	C74(A74 a){
		this.a = a;
	}
	int run() {
		System.out.println("C의 run Call");
		return num + a.run();
	}
}

public class Hello74 {
	
	public static void main(String[] args) {
		A74 a = new A74();
		a = new B74(a);
//		System.out.println(a.run());
		a = new C74(a);
		System.out.println(a.run());
	}
	
}
