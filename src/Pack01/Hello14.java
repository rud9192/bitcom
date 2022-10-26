package Pack01;

public class Hello14 {
	/*
	 * case 뒤에는 변수가 올 수 없다. int num = 200; case num: (불가능)
	 * 
	 * switch에는 변수를 사용할 수 있다. switch (num) 가능
	 * 
	 * case뒤에 중복된 숫자는 올 수 없다. case(100) case(100) (불가능)
	 * 
	 * 자바 버전에 따라서 문자열을 분기시킬 수 있다. switch("독수리") case "독수리": switch(s) case "독수리":
	 * 
	 * 일반적으로 case break는 한쌍인데 의도적으로 break를 생략할 수 있다.
	 * 
	 */
	public static void main(String[] args) {
		switch (100) {
		case 100:
			System.out.println(1);
			break;

		case 200:
			System.out.println(1);
			break;

		case 300:
			System.out.println(1);
			break;

		default:
			break;
		}

		String s = "소나무";
		switch (s) {
		case "독수리": // break;
		case "코끼리":
			System.out.println("동물입니다.");
			break;

		case "소나무":
		case "대나무":
			System.out.println("식물입니다.");
			break;
		}

	}
}
