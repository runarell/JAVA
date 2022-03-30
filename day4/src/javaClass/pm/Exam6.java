package javaClass.pm;

import java.util.Arrays;

public class Exam6 {
	public static void main(String[] args) {
		/*
		배열의 특징
		먼저 기본 자료향과 참조 자료형에서 변수르 복사할때를 생각하자.
		대입 연산자 (=)를 이용 변수의 복사 과정을 이해해보자 
		변수의 복사 라는 말의 의미 : 변수에 포함된 메모리값
		그런데 기본 자료형과 참조 자료형의 저장되는 메모리 값의 의미가 다르다.
		따라서 둘 사이의 차이가 발생
		
		기본 자료형은 메모리에 실제 데이터 값을 저장한다.
		따라서 기본 자료형 변수르 복사하면 실데 값이 1개 더 복사됨
		이후 복사된 값을 아무리 변경해도 원본 값은 아무런 영향을 받지 않는다.
		*/
		
//		int a=3;
//		int b=a;
//		b=7;
//		System.out.println(a);
//		System.out.println(b);
		/*
		참조 자료형 
		참조 자료형은 실제 데이터 X 저장된 위치의 값
		따라서 참조 자료형 변수르 복사하면 실제 데이터 위치값이 복사됨
		*/
		
//		int[] a = {3,4,5};
//		int[] b = a;
//		b[0] = 7;
//		System.out.println( Arrays.toString(a));
//		System.out.println( Arrays.toString(b));
		
		/* 
		하나의 참조 변수르 이용해서 데이터를 수정하면 
		다른 참조 변수가 가르키는 데이터도 변함
		*/
		
		// 배열의 길이 
		// array.length
		//참조 변수
//		int[] a = new int[] {1,2,3,4,5,6,7,8};
//		System.out.println( a.length );
//		
//		for(int i=0;i<a.length; i++) {
//			System.out.println(a[i]);
//		}
//		
//		for(int e : a) {
//			System.out.println(e);
//		}
		
		//2차원 배열
		/*
		 가로와 세로 2차원으로 데이터를 저장하는 배열
		 배열의 선언을 보면 차원이 1개씩 늘어날 때 마다 대괄호가 1개씩 늘어난다.
		 자료형[][] 변수명, 자요형 변수명[][]; 자료형[] 변수명[];
		 배열의 위치 표현은 세로 방향으로 늘어나는 행row번호
		 가로 방향으로 숫자가 늘어나는 열column 번호로 구성
		 */
		
		//2차원 배열 생성 방법1
//		int[][] array1 = new int[3][4];
//		int[][] array2;
//		array2 = new int[3][4];
//		
//		//2차원 배열 생성 방법 2
//		int array3[][] = new int[3][4];
//		int array4[][];
//		array4 = new int[3][4];
//		
//		//2차원 배열 생성 방법 3
//		int[] array5[] = new int[3][4];
//		int[] array6[];
//		array6 = new int[3][4];

		int[][] array1 = new int[2][3];
		array1[0][0] = 1;
		array1[0][1] = 1;
		array1[0][2] = 1;
		array1[1][0] = 1;
		array1[1][1] = 1;
		array1[1][2] = 1;		
		
		int[][] a = {{1,2},{3,4,5}};
		
//		for(int i=0; i < a.length; i++) {
//			for(int j=0; j < a[i].length; j++) {
//				System.out.println(a[i][j]);
//			}
//		}
		
		for(int[] arr : a){
			for(int e : arr) {
				System.out.print(e + " ");
			}
			System.out.println("\n-------------");
		}
		
	}
}












