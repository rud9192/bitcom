package Pack01;

public class te {

	public static void main(String[] args) {
		long beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기
        
		
		for (int i = 0; i < 20000; i++) {
			for (int j = 0; j < 35; j++) {
				i +=i;
			}
		}
		//실험할 코드 추가
		        
		long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
		long secDiffTime = (afterTime - beforeTime)/1000; //두 시간에 차 계산
		System.out.println("시간차이(m) : "+secDiffTime);
	}

}
