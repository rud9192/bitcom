package Pack02;

public class Hello61 {

	public static void main(String[] args) {
		System.out.println(1);
		for (int i = 0; i < 5; i++) {
			// 일시정지 상태에서 주어진 시간이 되기전에 interrupt() 메소드가
			// 호출되면 interruptedException이 발생하기 때문에 예외처리가 필요하다.
			// 특정 조건 만족한 이후에 함수실행을 끝내는 이러한 함수를 블로킹 함수라고 한다.
			try { Thread.sleep(1000);} catch (InterruptedException e) {}
			System.out.println(i*10);
		}
		
		System.out.println(2);
	}

}