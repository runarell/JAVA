package javaClass.am;

import java.util.Arrays;

public class Exam4 {

	public static void main(String[] args) {
		// String - 자바에서 가장 많이 사용되는 자료
//		int a = 12;
//		String b = "swift";
//		String c = new String("swift");
		//같지만 약간의 차이가 있음
		
//		String str1 = new String("하이");
//		System.out.println(str1);
//		String str2 = "안녕";
//		System.out.println(str2);
		
		// 특징
		//1. 한번 정의된 문자열은 변경할 수 없다.
		// 만약 문자령의 내용을 변경하면 자바가 기존 문자열을 수정X 
		// 새로운 문자열을 생성하려 사용하게 되는 것!! 기존객체 버림
		//2. 문자열을 입력해서 객체를 생성할 때 문자열 끼리 객체를 공유한다.
		// 이것은 메모리의 효율성 때문이다.
		
//		String str1 = new String("안녕");
//		String str2 = str1;
//		
//		System.out.println(str1);
//		System.out.println(str2);
//		
//		str1 = "안녕하세요";
//		System.out.println(str1);
//		System.out.println(str2);
//		
//		int[] arr1 = new int[] {3,4,5};
//		int[] arr2 = arr1;
//		System.out.println(Arrays.toString(arr1));
//		System.out.println(Arrays.toString(arr2));
//		
//		arr1[0] = 6;
//		arr1[1] = 7;
//		arr1[2] = 8;
//		
//		System.out.println(Arrays.toString(arr1));
//		System.out.println(Arrays.toString(arr2));
		
		/*
		 str1          100번지
		  |-----------> "안녕"
		 
		 str1          100번지
		  |-----------> "안녕"
		 str2
		                   100번지         200번지
		 str1-----------------------> "안녕하세요"  
		 str2 -----------> "안녕"  
		*/		
		
//		String str1 = new String("안녕");
//		String str2 = "안녕";
//		String str3 = "안녕"; // new 키워드 없음
//		String str4 = new String("안녕");
//		
//		System.out.println(str1);
//		System.out.println(str2);
//		System.out.println(str3);
//		System.out.println(str4);
		
		/*
		 	메모리주소      100번지	200번지	300번지
			str1 ----> "안녕"
			str2 --------------> "안녕"  
			str3 --------------> "안녕"
			str4 ----------------------> "안녕"
			
			new로 생성 ->  새로운 객체 생성
			new로 생성X - > 기존에 생성된 문자열이 있으며 그 객체를 공유
		*/
		
		String str1 = new String("안녕");
		String str2 = "안녕";
		String str3 = "안녕";
		String str4 = new String("안녕");
		
		//메모리값 비교
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		System.out.println(str3 == str4);
		System.out.println(str1 == str2);
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		
//		문자열 비교시 == 로 비교 X
//		str1.equals(str2);
		
		
	}

}












