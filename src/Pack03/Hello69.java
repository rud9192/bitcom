package Pack03;


public class Hello69 {
	
	public static void main(String[] args) {
		char data = 0xD5;
		// 선풍기
		// 에어컨
		// 전자렌지
		// 라디오
		// 티비
		// 드라이기
		// 컴퓨터
		// 냉장고
		
		char mask = 0x80;
		String arr[] = {"선풍기", "에어컨", "전자렌인지", "라디오", "티비", "드라이기", "컴퓨터", "냉장고"};
		int ans[] = new int[8];
		
		for (int i = 0; i < 8; i++) {
			ans[i] = data & mask;
			mask >>= 1;
			System.out.println(ans[i]);
		}
		
		for (int i = 0; i < 8; i++) {
//			if(ans[i] != 0) {
//				System.out.println(arr[i] + " on ");
//			}else {
//				System.out.println(arr[i] + " off ");
//			}
//			ans[i] != 0 ? " on " : " off ";
		}
		
//		ans[i] = 0 ? " on " : " off "
		
		
//		String ans = Integer.toBinaryString(data);
//		System.out.println(ans);
//		
//		int a = (data & 0x0010);
//		System.out.println(a);
	}

}
