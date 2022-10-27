package Pack02;

class Tiger20 {
	int f1(int a, int b) {
//		if(a > b) {
//			return 1000;
//		}else {
//			return 2000;
//		}
		
		return a > b ? 1000 : 2000; // 조건 ? (true) : (false)
	}
}

public class Hello58 {

	public static void main(String[] args) {
		// ex1
		int num1;
		if( true ) {
			num1 = 10;
		}else {
			num1 = 20;
		}
		
		num1 = true ? 10 : 20;
		
		// ex2
		if( true ) {
			System.out.println("호랑이");;
		}else {
			System.out.println("코끼리");
		}
		
		System.out.println( true ? "호랑이" : "코끼리");
		
		Tiger20 t = new Tiger20();
		t.f1(3, 4);
		
		int num = 1234567;
		int cnt = 0;
		while (true) {
			System.out.println(num);
			if (num % 2 == 0) {
				num = num / 2;
				cnt++;
			} else {
				num = num * 3 + 1;
				cnt++;
			}
			
			num = num % 2 == 0 ? num / 2 : num * 3 + 1;

			if (num == 1) {
				System.out.println(num);
				System.out.println("CNT : " + cnt);
				break;
			}

		}
	}

}

