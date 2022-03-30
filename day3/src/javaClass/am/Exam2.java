package javaClass.am;

public class Exam2 {
	public static void main(String[] args) {
		// Break 제어 키워드
		
		// break는 if구문을 제외한 {}를 탈출하는 데어 키워드 이다.
		// 일반적으로 반복문에서 특정 조건에 반복문을 탈출하는 경우 사용
		
//		for(int i=0;i<10;i++) {
//			if(i == 5) break;
//			System.out.println(i);
//		} // break 로 탈출하게 되는 중괄호
		
		// 꼭 기억! break로 탈출하면 if 제외 가장 가까운 {}만 탈출
		// 이중 반복문이면 안쪽만 탈출
		
		
		// 모든 반복문을 탈출하는 법
		// 이상한법
//		for(int i=0;i<10;i++) {
//			for(int j=0;j<10;j++) {
//				if(j == 3) i=100; break;
//				System.out.println(i+" "+j);
//			}
//		}
		// 세련된 법
//		out: //위치 지정 레이블
//		for(int i=0;i<10;i++) {
//			for(int j=0;j<10;j++) {
//				if(j == 3) break out;
//				System.out.println(i+" "+j);
//			}
//		}
		// break out은 out레이블이 위치해 있는 바깥쪽 for문 
		// 완전히 탈출하라는 의미가 된다.
	
		// continue 제어 키워드
		// 반복과정에서 특정 구문을 실행하지 않고 건너 뛰는 용도로 사용된다.
		
	 	for (int i=0;i<10;i++) {
	 		if(i%2 != 0) continue;
	 		System.out.print(i + " ");
	 	}
	

		
	}
}
