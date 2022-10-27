package Pack02;
// 업캐스팅
import java.util.Random;

interface Animal1 {
	abstract void cry() ;
}

class Dog1 implements Animal1{
	public void cry() {
		System.out.println(" 멍 멍 ");
	}
}

class Cat1 implements Animal1{
	public void cry() {
		System.out.println(" 야 옹 ");
	}
}

public class Hello57 {

	public static void main(String[] args) {
		Animal1 t = new Dog1();
		t.cry();
	}
}