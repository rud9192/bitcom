package Pack03;

public class Hello67 {
	static String hexaToBinary(int n) {
		String result = Integer.toBinaryString(n);
		//System.out.println("1 : " + result.length());
		while(result.length() < 32) {
			result = "0" + result;
		}//System.out.println("2 : " + result);
		
		
		StringBuffer result1 = new StringBuffer(result);
		//System.out.println("3 : " + result1);
		
		for (int i = 0; i < 7; i++) {
			result1.insert((7-i)* 4, " ");
		}
		//System.out.println("4 : " + result1);
		
		return result1.toString();
	}
	
	public static void main(String[] args) {
		int num = 0x3b12cd59; // 0011 -> 3, 1011 -> b, 0001 -> 1 ... 1001 -> 9
		// bin = 0011 1011 0001 0010 1100 1101 0101 1001
		
		String result0 = Integer.toBinaryString(num);
		System.out.println(result0);
//		System.out.println(num);
		System.out.println("answer : " + hexaToBinary(num));
		
	}
}
