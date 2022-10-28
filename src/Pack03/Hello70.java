package Pack03;
/*
 * 비트연산과 관련된 사항은 주로 최적화나 성능 향상을 주 목적으로 가진다.
 */
public class Hello70 {

	public static void main(String[] args) {
		int w = 800;
		int y = 321;
		System.out.println(w * y);
		System.out.println( (y << 9) + (y << 8) + (y << 5) );
	}

}
