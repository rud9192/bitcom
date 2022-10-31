package Pack04;

import java.util.Scanner;

class Lion extends Thread {
	public void run() {
		System.out.println("Lion start");
		Scanner sc = new Scanner(System.in);
		sc.nextInt(); // blocking
		System.out.println("Lion end"); //출력전 제어권 넘김으로 인해 end가 바로 출력되지 않는 상황 발생.
	}
}

class Tiger extends Thread {
	public void run() {
		Thread t = new Lion();
		t.start();
		System.out.println("Tiger start");
		Scanner sc = new Scanner(System.in);
		sc.nextInt(); // blocking
		System.out.println("Tiger end"); //출력전 제어권 넘김으로 인해 end가 바로 출력되지 않는 상황 발생.
	}
}


public class Hello75 {

	public static void main(String[] args) {
		System.out.println("main start");
		Tiger t = new Tiger();
		t.start();
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); // blocking
		
		System.out.println("main end"); //출력전 제어권 넘김으로 인해 end가 바로 출력되지 않는 상황 발생.
		
//		Thread.sleep(0)은 CPU가 쉴 수 있는 가장 짧은 시간
//		try {Thread.sleep(0);} catch (InterruptedException e) {}
		
		
		
	}

}

/*
package Pack04;

class Tiger extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("코끼리" + i);
			try {Thread.sleep(0);} catch (InterruptedException e) {}
		}
	}
}


public class Hello75 {

	public static void main(String[] args) {
		System.out.println("main start");
		
		Tiger t = new Tiger();
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("호랑이" + i);
			try {Thread.sleep(0);} catch (InterruptedException e) {}
		}
		
		System.out.println("main end");
		
//		Thread.sleep(0)은 CPU가 쉴 수 있는 가장 짧은 시간
//		try {Thread.sleep(0);} catch (InterruptedException e) {}
	}
}
*/
/*
package Pack04;

class Tiger extends Thread {
	@Override
	public void run() {
		System.out.println("thread start");
		System.out.println("run call");
		System.out.println("thread exit");
	}
}

public class Hello75 {

	public static void main(String[] args) {
		System.out.println("main start");
		Thread t = new Tiger();
		t.start();
		try {Thread.sleep(1000);} catch (InterruptedException e) {}
		System.out.println("main end");
	}
}
*/
/*
package Pack04;

class Tiger extends Thread {
	@Override
	public void run() {
		System.out.println("run call");
	}
}

public class Hello75 {

	public static void main(String[] args) {
		Thread t = new Tiger();
		t.start();
	}

}
*/

/*
package Pack04;

class A {
	void start() {
		System.out.println("start");
	}
	void run() {
		System.out.println("A run");
	}
}

class B extends A {
	void run() {
		System.out.println("B run");
	}
}

public class Hello75 {

	public static void main(String[] args) {
		A t = new B();
		t.start();
	}

}
*/