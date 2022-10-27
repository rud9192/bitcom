package Pack02;
// 예외처리.

public class Hello59 {

	public static void main(String[] args) {
		System.out.println(1);
		// 1. ArithmeticException
		// 프로그램이 중단되었다.
		try {			
			System.out.println( 4 / 0); // exception 이 발생할 경우 catch 수행.
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 2.ArrayIndexOutOfBoundsException 배열의 index가 경계영역을 벗어남
		int[] ar = new int[3];
		try {
			ar[3] = 10;	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String str = null;
		// 3.NullPointerException 객체가 생성되지 않았다.
		try {
			System.out.println(str.length());
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("무궁화 꽃이 피었습니다.");
		
	}

}