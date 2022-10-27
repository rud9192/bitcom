package Pack02;
// 업캐스팅
import java.util.Random;

class Animal2 {
	void cry() {
		System.out.println(" 잉 잉 ");
	}
}

class Dog2 extends Animal2{
	void cry() {
		System.out.println(" 멍 멍 ");
	}
}

class Cat2 extends Animal2{
	void cry() {
		System.out.println(" 야 옹 ");
	}
}

class Snake2 extends Animal2 {
	
}

public class Hello56{

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
		
		Animal2[] ani = new Animal2[] {new Dog2(), new Cat2(), new Snake2()};
		
		for (int i = 0; i < 5; i++) {
			ani[new Random().nextInt(3)].cry();
		}
		
	}

}