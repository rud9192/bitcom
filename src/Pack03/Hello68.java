package Pack03;

public class Hello68 {
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
		// ARGB
		int num = 0x3b12cd59; // 0011 -> 3, 1011 -> b, 0001 -> 1 ... 1001 -> 9
		// bin = 0011 1011 0001 0010 1100 1101 0101 1001
		String result0 = Integer.toBinaryString(num);
		System.out.println(hexaToBinary(num));
		System.out.println(hexaToBinary(0x00ff0000));
		System.out.println(hexaToBinary((num & 0x00ff0000) >> 16));
		int Red = (num & 0x00ff0000) >> 16;
		System.out.println(Red);
		
		int Green = (num & 0x0000ff00) >> 8;
		System.out.println(Green);
		
		int Blue = (num & 0x000000ff) >> 0;
		System.out.println(Blue);
		
		int result2 = (Red << 16) | (Green << 8) | Blue;
		System.out.println(hexaToBinary(result2));
//		System.out.println(result0);
//		System.out.println(num);
//		System.out.println("answer : " + hexaToBinary(num));
		
	}
}
