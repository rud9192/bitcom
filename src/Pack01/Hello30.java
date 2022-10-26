package Pack01;
/*
 * 동일한 함수 이름을 가지는 여러가지 함수 만들기
 * 1. 전달되는 인수의 갯수가 다를때 (함수 오버로딩)
 * 2. 인자의 갯수가 같더라도 인자 타입이 다를때 (타입캐스팅을 사용하여 명확하게 사용해야한다) t.show((int)1), t.show((short)1)
 */
class Point{
	int x, y;
}

class Tiger6{
	void show() {
		System.out.println(1);
	}

	void show(int num) {
		System.out.println(2);
	}

	void show(int a, int b) {
		System.out.println(3);
	}
	
	void show(short num) {
		System.out.println(4);
	}
}

class Rect {
	int width, height;
	int getAera(int w, int h) {
		return w * h;
	}
	int getAera(Point s, Point e) {
		int w = e.x - s.x;
		int h = e.y - s.y;
		return w * h;
	}
	
	int getArea(int x1, int y1, int x2, int y2) {
		int w = x2 - x1;
		int h = y2 - y1;
		return w*h;
	}
}

public class Hello30 {

	public static void main(String[] args) {
		Tiger6 t = new Tiger6();
		t.show();
		t.show(1);
		t.show(2, 3);
		t.show(4);
		t.show((short)4);
		Rect r = new Rect();
		System.out.println(r.getAera(3, 4));
		Point p1 = new Point();
		Point p2 = new Point();
		p1.x = 3;
		p1.y = 4;
		p2.x = 8;
		p2.y = 9;
		System.out.println(r.getAera(p1, p2));
	}

}
