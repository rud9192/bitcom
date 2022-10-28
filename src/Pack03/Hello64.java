package Pack03;

import java.util.LinkedList;

public class Hello64 {

	public static void main(String[] args) {
		//  <저장할 데이터 타입>
		// 클래스 타입만 가능하다.
//		LinkedList<Integer> mm = new LinkedList<Integer>();
		LinkedList<Integer> mm = new LinkedList<>(); // 뒤 Integer는 생략가능
		System.out.println(mm.size());
		// (C)reateUD
		mm.add(100);	
		for (int i = 0; i < 10; i++) {
			mm.add(i * 10 + i);
		}
		System.out.println(mm.size());
		
		// C(R)eadUD
		// 방법 1 : 활용성이 없다. 
		System.out.println(mm);
		
		// 방법 2 : 
		for (int i = 0; i < mm.size(); i++) {
			System.out.print(mm.get(i) + " ");
		}System.out.println();
		
		// 방법 3 : forEach :  (index 값을 같이 가져오려면 별도의 변수 생성하여 가져올 수 있다)
		for (Integer value : mm) {
			System.out.print(value + " ");
		}System.out.println();
		
		int[] ar = {1, 2, 3};
		for (int value : ar) {
			System.out.print(value + " ");
		}System.out.println();
		
		System.out.println(mm.get(5));
		
		// CR(U)pdateD
		mm.set(5, 2022); // index data를 수정
		System.out.println(mm);
		
		// CRU(D)elete
		mm.remove(4);
		System.out.println(mm);
		
		// C : create, insert, add
		// R : read, select
		// U : update, set
		// D : delete, remove, erase, clear
	}
}
