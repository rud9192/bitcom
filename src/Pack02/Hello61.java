package Pack02;

public class Hello61 {

	public static void main(String[] args) {
		System.out.println(1);
		for (int i = 0; i < 5; i++) {
			// 특정 조건 만족한 이후에 함수실행을 끝내는 이러한 함수를 블로킹 함수라고 한다.
			try { Thread.sleep(1000);} catch (InterruptedException e) {}
			System.out.println(i*10);
		}
		
		System.out.println(2);
	}

}