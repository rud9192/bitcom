package Pack01;

public class Hello11 {

	public static void main(String[] args) {

		// 1만 증가시킨다는 전제아래에서

		int num = 0;
		num = num + 1; // <-- 대입연산과 산술연산이 사용,
		System.out.println(num);
		// 나머지는 단독명령.
		// move, add
		num++;
		System.out.println(num);
		++num;
		System.out.println(num);

		num += 1; // 10번라인보다 약간 좋다. 기계어로 번역되는 속도가 10번라인보다 조금 빠르다.
		System.out.println(num);

		int test = 10;
		int count = 20;
		test += count;
		// test = test + count

	}

}
