package javaClass.pm;

import java.util.Arrays;

public class Exam5 {

	public static void main(String[] args) {
		
		// 배열 생성 방법 세가지 총정리
		// 방법 1 
//		int[] array1 = new int[3];
//		array1[0] = 3;
//		array1[1] = 4;
//		array1[2] = 5;
//		
//		System.out.println(array1[0] + "" + array1[1] + "" + array1[2] + "");
//		System.out.println("==============================");
//
//		// 방법 2
//		int[] array2;
//		array2 = new int[3];
//		
//		array2[0] = 3;
//		array2[1] = 4;
//		array2[2] = 5;
//		
//		System.out.println(array2[0] + "" + array2[1] + "" + array2[2] + "");
//		System.out.println("==============================");
//
//		//방법 2
//		int[] array3;
//		array3 = new int[] {3,4,5};
//		System.out.println(array3[0] + "" + array3[1] + "" + array3[2] + "");
//		System.out.println("==============================");
//		
//		int[] array4 = new int[] {3,4,5}; // 배열 선언과 객체 대입을 분리
//		System.out.println(array4[0] + "" + array4[1] + "" + array4[2] + "");
//		System.out.println("==============================");
//		
//		// 방법 3
//		int[] array5 = {3,4,5}; // 강제 초기화
//		System.out.println(array5[0] + "" + array5[1] + "" + array5[2] + "");
//		System.out.println("==============================");
		
		// 배열에서의 초기화 값 정리
		// int, long, short. char, byte - 0
		// boolean - false
		// float, double - 0.0
		// String, 클래스..... null
		
		int value1;
//		System.out.println(value1); // 오류! 초기값 없음
		int[] value2;
//		System.out.println(value2); // 오류 초기값 없음
		
		int value3 = 0;  // 0으로 초기화 하여 오류 미발생
		System.out.println(value3);
		
		int[] value4 = null; // null 로 초기화 하여 오류 미발생
		System.out.println(value4);
		
		boolean[] array1 = new boolean[3];
		System.out.println(array1[0]);
		System.out.println(array1[1]);
		System.out.println(array1[2]);
		
		
		for(int i=0; i>array1.length; i++) {
			System.out.println(array1[i]);
		}
		for(boolean n: array1) {
			System.out.println(n);
		}
		
		int[] array2 = new int[3];
		for (int e : array2) {
			System.out.println(e);
		}
	
		String[] array3 = new String[3];
		for(String s:array3) {
			System.out.println(s);
		}
		
		char[] array4 = new char[3];
		for(char c :array4) {
			System.out.println(c);
		}
		
		//배열 전체를 출력하는 간단한 방법
		// Arrays.toString(배열명)을 이용하면 배열의 모든 원소를 한번에 모두 출력
		System.out.println( Arrays.toString(array1) );
		System.out.println( Arrays.toString(array2) );
		System.out.println( Arrays.toString(array3) );
		System.out.println( Arrays.toString(array4) );
		
		//배열의 특징
		
		
	
	
	
	}

}
