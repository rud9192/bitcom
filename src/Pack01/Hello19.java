package Pack01;

class Tiger{
	void f1() {
		System.out.println("call");
	}
}

public class Hello19 {
/*
 * 
 */
	public static void main(String[] args) {
		Tiger[] arr = new Tiger[3];
		arr[0] = new Tiger();
		arr[0].f1();
		
		arr[1] = new Tiger();
		arr[1].f1();
		//error : arr[2].f1();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Tiger();
		}
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].f1();
		}
		
		Tiger[] brr = new Tiger[] {new Tiger(), new Tiger(), new Tiger()};
		
		for (Tiger obj : brr) {
			obj.f1();
		}
		
		
	}

}
