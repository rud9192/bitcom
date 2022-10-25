package Pack01;

public class Hello16 {

	public static void main(String[] args) {
		int num = 1234567;
		int cnt = 0;
		while(true) {
			System.out.println(num);
			if(num % 2 == 0) {
				num = num / 2;
				cnt ++;
			}else {
				num = num * 3 + 1;
				cnt ++;
			}
			
			
			if(num == 1) {
				System.out.println(num);
				System.out.println("CNT : " + cnt);
				break;
			}
				
		}

	}

}
