package Pack03;

import java.util.LinkedList;

/*
 * 제네릭
 * 자료구조를 만들어 배포 하려할 때 여러가지 타입을 지원하고 싶은 경우 사용.
 * 제네릭(Generic)은 클래스 내부에서 지정하는 것이 아닌 외부에서 사용자에 의해 지정되는 것
 * 특정(Specific)타입을 미리 지정해주는 것이 아닌 필요에 의해 지정할 수 있도록 일반(Generic)타입
 * 
 */
/*
class Tiger66 {
	private int data;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
}

class Lion66 {
	private String data;
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
}

public class Hello66 {

	public static void main(String[] args) {
		Tiger66 t = new Tiger66();
		t.setData(100);
		System.out.println(t.getData());
		
		Lion66 l = new Lion66();
		l.setData("호랑이");
		System.out.println(l.getData());
	}
}
*/

class Tiger66<T>{
	private T data;
	
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
}


public class Hello66 {

	public static void main(String[] args) {
		Tiger66<Integer> t1 = new Tiger66<>();
		t1.setData(100);
		System.out.println(t1.getData());
		
		Tiger66<String> t2 = new Tiger66<String>();
		t2.setData("호랑이");
		System.out.println(t2.getData());
		
		Tiger66<Float> t3 = new Tiger66<Float>();
		t3.setData(3.14f);
		System.out.println(t3.getData());
		
		LinkedList<String> mm = new LinkedList<>();
		
	}
}







