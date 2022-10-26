/*
package Pack01;

class Tiger4{

}

public class Hello28 {

	public static void main(String[] args) {


	}

}
*/

/////////////////////////////////////////////////////////////////////////////////////////////////////////


package Pack01;
/*
 * 
 */
class Tiger4{
	int x, y;
	
	Tiger4(){
		System.out.println(1);
	}
	Tiger4(int a){
		this();
		x = a * 33;
		System.out.println(2);
	}
	Tiger4(int a, int b){
		this(a); // 다른 생성자에 인수 전달 인수가 30 하나인 두번째 생성자가 실행된다.
		y = b;
		System.out.println(3);
		System.out.println("x : " + x + " y : " + y);
	}
}

public class Hello28 {

	public static void main(String[] args) {
		Tiger4 t = new Tiger4(10, 20);

	}

}








//package Pack01;
///*
//* this의 용법 2
//* 함수 호출의 체이닝을 쓰기 위해서
//*/
//class Tiger4{
//	Tiger4 f1() {
//		System.out.println("아침먹고");
//		return this;
//	}
//	Tiger4 f2() {
//		System.out.println("점심먹고");
//		return this;
//	}
//	Tiger4 f3() {
//		System.out.println("저녁먹고");
//		return this;
//	}
//}
//
//public class Hello28 {
//
//	public static void main(String[] args) {
//		Tiger4 t = new Tiger4();
//		t.f1().f2().f3(); // 하나씩 ;을 찍지 않고 체이닝을 하는 이유 : 서로 관련성 있는 코드들을 같이 작성 하고 코드의 난입을 막는 용도.
//		
////		예시
//		t.f1();
//		System.out.println("잔다."); //  코드의 난입을 막기 위헤.
//		t.f2();
//		t.f3();
//
//	}
//
//}







//package Pack01;
///*
//* this의 용법 2
//* 함수 호출의 체이닝을 쓰기 위해서
//*/
//class Tiger4{
//	Tiger4 f1() {
//		System.out.println(this.hashCode());
//		return this;
//	}
//	Tiger4 f2() {
//		System.out.println("f2 call");
//		return this;
//	}
//	void f3() {
//		System.out.println("f3 call");
//	}
//}
//
//public class Hello28 {
//
//	public static void main(String[] args) {
//		Tiger4 t = new Tiger4();
//		System.out.println(t.hashCode());
//		Tiger4 t2 =t.f1();
//		System.out.println(t2.hashCode());
//		
//		Tiger4 tiger = new Tiger4();
//		tiger.f1().f1().f1().f2().f3();; // 체이닝 기법 자신객체를 리턴받아 계속 .을 찍을 수 있음
//	}
//
//}









//package Pack01;
///*
// * this의 용법 1
// * 생성자 함수의 인수명과 필드명을 구분하기 위하여 사용된다.
// */
//class Tiger4{
//	String name;
//	int age;
//	
//	Tiger4(){}
//	Tiger4(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
//
//	@Override
//	public String toString() {
//		return "Tiger4 [name=" + name + ", age=" + age + "]";
//	}
//}
//
//public class Hello28 {
//
//	public static void main(String[] args) {
//		Tiger4 t = new Tiger4("호랑이", 20);
//		System.out.println(t.toString());
//
//	}
//
//}









//package Pack01;
///*
// * this는 new를 이용해서 생성된 객체를 공유하는 변수이다.
// * 자기 자신이 생성되었을 때의 객체를 공유
// */
//class Tiger4{
//	//Tiger this;
//	int num;
//	Tiger4(){
//		//this = t; 공유가 되었다.
//		System.out.println(this.hashCode());
//	}
//	void f1() {
//		
//	}
//	void f2() {
//		this.f2();
//	}
//}
//
//public class Hello28 {
//
//	public static void main(String[] args) {
//		Tiger4 t = new Tiger4();
//		System.out.println(t.hashCode());
//		t.num = 20;
//		
//		Tiger4 t2 = new Tiger4();
//		
//	}
//
//}


//package Pack01;
//
//class Tiger4{
//	String name = "홍길동";
//	int age = 20;
//	
//	Tiger4(){}
//	Tiger4(String name, int age){
//		this.name = name;
//		this.age = age;
//	}
//	@Override
//	public String toString() {
//		return "Tiger4 [name=" + name + ", age=" + age + "]";
//	}
//}
//
//public class Hello28 {
//
//	public static void main(String[] args) {
//		Tiger4 t = new Tiger4("호랑이", 10);
//		System.out.println(t.toString());
//
//	}
//
//}









//package Pack01;
//
//class Tiger4{
//	String name = "홍길동";
//	int age = 20;
//	Tiger4(){
//		name = "이순신";
//		age = 30;
//	}
//	Tiger4(String n, int a){
//		name = n;
//		age = a;
//	}
//	void showData() {
//		System.out.println(name + " " + age);
//	}
//	@Override
//	public String toString() {
//		return "Tiger4 [name=" + name + ", age=" + age + "]";
//	}
//	
//}
//
//public class Hello28 {
//
//	public static void main(String[] args) {
//		Tiger4 t1 = new Tiger4();
//		t1.showData();
//		System.out.println(t1.toString());
//
//		Tiger4 t2 = new Tiger4();
//		t2.showData();
//		
//		Tiger4 t3 = new Tiger4("호랑이", 40);
//		t3.showData();
//	}
//
//}


















//package Pack01;
///*
// * 생성자를 만들지 않으면 디폴트 생성자를 자동으로 만들어 준다.
// * 생성자를 만들면 디폴트 생성자를 만들지 않는다.
// * 생성자를 만들때 디폴트 생성자는 만드는 것을 원칙으로 한다.
// */
//class Tiger4{
//	Tiger4(){}
//	
//}
//
//public class Hello28 {
//
//	public static void main(String[] args) {
//		Tiger4 t = new Tiger4(); // 프로그래머가 생성자를 작성하지 않으면 디폴트 생성자를 만든다.
//		System.out.println(1);
//	}
//
//}





















//package Pack01;
///*
// * 생성자
// * 1. 생성자 : 생성자 함수
// * 2. 생성자도 함수이기때문에 함수 오버로딩이 가능하다.
// * 3. 함수이름이 반드시 클래스 이름과 동일해야 한다.
// * 4. 인수전달을 할 수 있지만 리턴값을 가질 수 없다.
// * 5. 목적은 멤버 변수초기화가 유일한 목적이다.
// * 6. 객체가 생성(new)될 때 자동 호출이 되고 프로그래머가 임의로 호출할 수 없다.
// */
//class Tiger4{
//	Tiger4(){ // 생성자 함수. 디폴트 생성자.
//		System.out.println("생성자 콜1");
//	}
//	Tiger4(int num){
//		System.out.println("생성자 콜2");
//	}
//}
//
//public class Hello28 {
//
//	public static void main(String[] args) {
//		System.out.println(1);
//		Tiger4 t = new Tiger4();
//		System.out.println(2);
//		Tiger4 t2 = new Tiger4(100);
//		System.out.println(3);
//		
//	}
//
//}










//package Pack01;
//
//class Tiger4{
//	void f1() {
//		
//	}
//	void f2() {
//		// 스스로 자신의 클래스 타입으로 객체를 만들 수 있다.
//		Tiger4 t = new Tiger4();
//		t.f1();
//	}
//}
//
//public class Hello28 {
//	//생성자를 가질 수 있다.
//	//필드를 가질 수 있다.
//	//메서드를 가질 수 있다.
//	int count = 100;
//	void f1() {
//		
//	}
//	void f2() {
//		System.out.println(count);
//		f1();
//	}
//	static void f3() {
//		
//	}
//	
//	public static void main(String[] args) {
////		System.out.println(count);
////		f1();
//		f3();
//		Hello28 h = new Hello28();
//		h.f1();
//		h.f2();
//		h.f3();
//	}
//
//}














//package Pack01;
///*
// * staic : 정적(고정) != 동적(dynamic)
// */
//class Tiger4{
//	static int count;
//	static void f1() { // static 선언시에 메모리 할당. 처음부터 메모리가 존재하기 때문에 객체선언을 하지않고도 사용할 수 있다.
//		System.out.println("call1");
//	}
//
//	void f2() { // new 선언 시에 메모리 할당.
//		System.out.println("call2");
//	}
//	
//	void f3() {
//		f2();
//		System.out.println("call3");
//	}
//	static void f4() {
////		f2(); 스태틱 함수 안에서는 반드시 스태틱멤버만 사용가능하다.
//	}
//}
//
//public class Hello28 {
//
//	public static void main(String[] args) {
//		Tiger4.f1(); // new 객체 선언 전에 사용할 수 있다.
//		//Tiger4.f2(); //사용 불가
//		Tiger4 t = new Tiger4();
//		t.f2();
//		t.f3();
////		System.out.println(f3()); return이 없으므로 사용이 안됨.
//		//예
//		System.out.println(Math.abs(-100)); // Math는 클래스 이고 abs는 스태틱으로 선언돼 선언 없이 바로 사용가능하다.
//	}
//}

//package Pack01;
///*
// * 동일한 함수 이름을 가지는 여러가지 함수 만들기
// * 1. 전달되는 인수의 갯수가 다를때 (함수 오버로딩)
// * 2. 인수의 갯수가 같더라도 인수 타입이 다를때 (타입캐스팅을 사용하여 명확하게 사용해야한다) t.show((int)1), t.show((short)1)
// */
//
//class Point{
//	int x, y;
//}
//
//class Tiger4{
//	void show() {
//		System.out.println(1);
//	}
//
//	void show(int num) {
//		System.out.println(2);
//	}
//
//	void show(int a, int b) {
//		System.out.println(3);
//	}
//	
//	void show(short num) {
//		System.out.println(4);
//	}
//}
//
//class Rect {
//	int width, height;
//	int getAera(int w, int h) {
//		return w * h;
//	}
//	int getAera(Point s, Point e) {
//		int w = e.x - e.x;
//		int h = e.y - s.y;
//		return w * h;
//	}
//	
//	int getArea(int x1, int y1, int x2, int y2) {
//		int w = x2 - x1;
//		int h = y2 - y1;
//		return w*h;
//	}
//}
//
//public class Hello28 {
//
//	public static void main(String[] args) {
//		Tiger4 t = new Tiger4();
//		t.show();
//		t.show(1);
//		t.show(2, 3);
//		t.show(4);
//		t.show((short)4);
//		Rect r = new Rect();
//		System.out.println(r.getAera(3, 4));
//		Point p1 = new Point();
//		Point p2 = new Point();
//		p1.x = 3;
//		p1.y = 4;
//		p2.x = 8;
//		p2.y = 9;
//		r.getAera(p1, p2);
//	}
//
//}












//package Pack01;
///*
// * 인자 전달.
// */
//class Lion{
//	void cry() {
//		System.out.println("어흥");
//	}
//}
//
//class Tiger4{
//	String f1() {
//		// String 타입의 클래스 객체가 리턴된다.
//		return null; // 일단 에러를 피하고 싶을 경우 return null을 사용<나는 객체가 아니다>
//	}
//	Lion f2() {
//		Lion lion = new Lion(); // 지역변수.
//		System.out.println(lion.hashCode());
//		return lion;
//	}
//}
//
//public class Hello28 {
//
//	public static void main(String[] args) {
//		Tiger4 t = new Tiger4();
//		System.out.println(t.f1());
//		Lion l = new Lion();
//		l.cry();
//		System.out.println(t.f2());
//
////		for (int i = 0; i < 50; i++) {
////			t.f2();
////		}
////
////		
////		for (int i = 0; i < 50; i++) {
////			System.out.println(l.hashCode());
////		}
//
//	}
//
//}





//package Pack01;
///*
// * 인자 전달.
// */
//class Lion{
//	void cry() {
//		System.out.println("어흥");
//	}
//}
//
//class Tiger4{
////	int a = 10, String b = 호랑이 ch = 책 <대입연산>
////	String으로 인수전달 받았다는 것은 클래스로 전달 받았다. 즉 인수전달에서 객체(클래스) 사용이 가능하다
//	void func(int a, String b, char ch, Lion lion) {
//		System.out.println(a + b + ch);
//		System.out.println("2 : " + lion.hashCode());
//		lion.cry(); // Lion 클래스의 Cry 메서드 실행.
//	}
//}
//
//public class Hello28 {
//
//	public static void main(String[] args) {
//		Tiger4 t = new Tiger4();
//		Lion l = new Lion();
//		System.out.println("1 : " + l.hashCode());
//		t.func(10, "호랑이", '책', l); // l, lion이 동일한 객체
//		
//	}
//
//}
