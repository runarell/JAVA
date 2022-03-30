package javaClass.am;

public class Exam1 {

	public static void main(String[] args) {
/*
 	제어문 - 반복문 - while
 	
 	중괄호 안의 실행 구문을 반복적으로 실행하는 반복 제어문으로 
 	조건을  만족하는 동안 반복을 지속
 		while(조건){
 			실행문
 		}
 */
//		int num = 0, sum = 0;
//		while(sum<100) {
//			sum+=num;
//			num++;
//		}
//		System.out.println((num-1)+"까지의 합 = "+sum);
//		int a=0;
//		while(a<10) {
//			System.out.println(a+" ");
//			a++;
//		}
//		System.out.println();
		
//		for(int i = 0; i<10; i++) {
//			System.out.println(i+" ");
//		}
//		System.out.println();
		
		// while 무한루프 식
//		int c = 0;
//		while(true) {
//			if(c >10) break;
//			System.out.println(c);
//			c++;
//		}
/*
 	do~while
 	while문과 비슷
 	차이점 : 조건식의 검사, 반복실행의 순서의 차이
 	* while은 실행구문이 한번도 안될수 있다!
 	* do while은 반드시 한번은 실행구문이 실행됨!
 	do{
 		실행구문
 		증감식
 	}while(조건식);
 */
//		int a;
//		
//		a = 0;
//		while(a < 0) {
//			System.out.println(a);
//			a++;
//		}
//		
//		a = 0;
//		do {
//			System.out.println(a);
//			a++;
//		}while(a<0);
		
//		int a;
//		// while
//		a=0;
//		while(a<10) {
//			System.out.print(a + " ");
//			a++;
//		}
//		System.out.println("\n====================");
//		
//		a = 0;
//		do {
//			System.out.print(a + " ");
//			a++;
//		}while(a<10);
		
		// 제어문의 중복
		// 제어문은 다른 제어문을 포함할 수 있다.
		
//		for(int i=0;i<3;i++) {
//			for(int j=0;j<5; j++) {
//				System.out.println(i+" "+j);
//			}
//		}

		int i=0,j;
		while(i < 3) {
			j=0;
			while(j<5) {
				System.out.println(i+" "+j);
				j++;
			}
			i++;
		}
		
		
//		for (int i=1; i<10; i++) {
//		for(int j=1; j<10; j++) {
//			System.out.print(i+"X"+j+"="+(i*j)+"  ");
//			if(j%5==0) {
//				System.out.println("\n");
//			}
//		}
//		System.out.println("\n");
//	}
		
	}

}
