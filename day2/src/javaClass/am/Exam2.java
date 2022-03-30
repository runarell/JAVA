package javaClass.am;

import java.util.Calendar;

public class Exam2 {
	public static void main(String[] args) {
/*
 산술 연산자
 사술 연산자 + - * / %
 증감 연산자 ++ --
 비트 연산자 & (and) | (or)
 비교 연산자 > < >= <= == !=
 대입 연산자 = += -= *= /=
 삼항 연산자 (조건식) ? true : false;  ( if문을 대신해서 사용가능 )
*/
		
//		int a = 1;
//		a = a + 1; a += 1;
//		a++;  // 후위형
//		++a;  // 전위형
//		System.out.println(a);
		
//		int a = 3;     //  4
//		int b = ++a;   //  4 a값을 증가 시킨 후 값을 b에 대입
//		
//		System.out.println(a);	
//		System.out.println(b);
//		
//		int c = 3;     //  4
//		int d = a++;   //  3 c값을  d에 먼저 넣고  c를 증가 
//		
//		System.out.println(c);	
//		System.out.println(d);

		// 비트연산자
//		int a = 3|5;
//		int b = 3&5;
//		System.out.println(a);

		// 삼항연산자 : 3개의 피연산자가 있는 연산자
		// 조건식 ? true : false
//		int a = (false) ? 1:2;
//		System.out.println(a);
//		
//		int b = (a%2 == 0) ? 10:20;
//		System.out.println(b);
		
		// if문 형식 
//		int a = 2;
//		int b;
//		
//		if (a%2 == 0) {
//			b = 10;
//		}else {
//			b = 20;
//		}
//		System.out.println(b);
		
//		int value = 2;
//		System.out.println( (value%2 == 0 ? "짝수":"홀수") );
		
//		int score = 85;
//		char lank = (score >= 90) ? 'A': (score >= 80) ? 'B': (score >= 70) ? 'C': (score >= 60) ? 'D': 'F';
//		System.out.println(lank);
		

	    // hour에는 현재 시간이 24시간 단위로 들어있습니다. 
	    int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
	    String ampm;
	    System.out.println(hour);
	    
	    // 삼항 연산자를 이용해 ampm에 오전 또는 오후의 값을 가지도록 만들어보세요.
	    ampm = hour < 12 ? "오전" : "오후"; 
	    System.out.println("지금 시간은 "+hour+"시이고, "+ampm+"입니다.");

		
	}
}
