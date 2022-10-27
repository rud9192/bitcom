package Pack02;

class Animal3 {
	void cry() {
		System.out.println(" ing ing ");
	}
}

class Dog3 extends Animal3{
	void cry() {
		System.out.println(" 멍 멍 ");
	}
}

class Cat3 extends Animal3{
	void cry() {
		System.out.println(" 야 옹 ");
	}
}

class Snake3 extends Animal3{
}

class Zoo3 {
	void sound(Animal3 ani) {
		ani.cry();
	}	
}

public class Hello55 {

	public static void main(String[] args) {
		Zoo3 zoo = new Zoo3();
		zoo.sound(new Dog3());
		zoo.sound(new Cat3());
		zoo.sound(new Snake3());
		
		
		
		Animal3 t1 = new Dog3();
		Animal3 t2 = new Cat3();
		Animal3 t3 = new Snake3();
		
		t1.cry();
		t2.cry();
		t3.cry();
	}

}