package javaClass.pm;

public class Exam4 {
	public static void main(String[] args) {
		
		// 번잡하게 
//		int a = 85;
//		if (a >= 70 && a < 80) {
//			System.out.println("C학점");
//		}else if(a >= 80 && a < 90) {
//			System.out.println("B학점");			
//		}else if(a >= 90) {
//			System.out.println("A학점");			
//		}else if(a >= 60 && a < 70) {
//			System.out.println("D학점");			
//		}else{
//			System.out.println("F학점");						
//		}
		

//		int a = 85;
		// 자바에서는 각각 분리해야함 
//		if (70 <= a < 80) {  //오류 
//			System.out.println("C학점");
//		}
		
		// 비트연산자 & 논리연산자&&
//		if (a >= 70 & a < 85) {
//			System.out.println("C학점");
//		}
		
		// 효율성
		// & | 를 사용하면 두 조건을 모두 확인하여 결정
		// && || 를 사용시 두조건을 사용하지 않고 하나만 으로도 결정됨
		// 비트와 논리 연산자는 매우 비슷하지만 피연산자로 boolean 만
		// 올수 있고 연산 결과 또한 블리언 타입만 지닌다.
		// 논리 and 는 두값이 참 일경우 참
		// 논리 or 는 둘중 하나만 참이면 참

//		int a = 1;
//		int b = 2;
//		if (a < 3 | b < 3) {
//			System.out.println("둘다 3 미만입니다.");
//		}else {
//			System.out.println("둘다 3 미만이 아닙니다.");
//		}

		// switch 구문
		// switch 는 변수값에 따라서 특정 case 롤 이동해서 구문을 
		// 길행하는 선택 제어문이다. 
		
//		int a = 2;
//		switch(a) {
//		case 1:
//			System.out.println("A");
//			break;
//		case 2:
//			System.out.println("B");
//			break;
//		case 3:
//			System.out.println("C");
//			break;
//		default:
//			System.out.println("0");
//		}
	}
}







