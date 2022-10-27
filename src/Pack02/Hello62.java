package Pack02;

public class Hello62 {

	public static void main(String[] args) {
		String s = "무궁화꽃이피었습니다. ";
		// 1)
		System.out.println(s.length()); // 길이
		// 2)
		System.out.println(s.charAt(3)); // index 안에 3번째 문자
		// 3)
		System.out.println(s.indexOf("무")); // index 안에 일치하는 문자 위치
		System.out.println(s.indexOf("나무")); // index 안에 일치하는 문자 위치 못찾을 경우 -1 리턴
		if(s.indexOf("나무") == -1) {
			System.out.println(" not found ");
		}else {
			System.out.println(" find ");
		}
		// 4)
		System.out.println(s.replace("꽃이", "나무가")); // 리턴값이 변경된 것이다. 원본값 변경 X
		System.out.println(s); // 원본은 변경되면 안된다.
		String newString = s.replace("꽃이", "식물이");
		System.out.println(newString);
		
		// 5)
		System.out.println(s.substring(3)); // index 3번부터 끝까지 잘라서 리턴
		
		// 6)
		System.out.println(s.substring(3, 5)); // a ~ b-1 리턴 index 3,4만 리턴
	}

}