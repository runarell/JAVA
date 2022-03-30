package javaClass.pm;

public class Exam4_0 {

	public static void main(String[] args) {
		// 객체의 생성과 활용
		
/* 객체 생성
  클래스명 객체명 = new 생성자();
  
*/
	A a = new A();
	System.out.println( a.m );
	a.m = 5;	
	System.out.println( a.m );
	a.print();
	
	}

}// public class End

class A{		    // 클래스 A
	int m = 3;		// 필드값 은 3으로 초기화 되어 있다.
	void print(){   // print() 메서드
		int k = 5;  // 지역변수
		System.out.println("객체 생성 " + k);
	}
} // class A End
/*
 필드 field : 클래스의 포함된 변수, 객체의 속성값을 지정할 수 있다.
필드는 지역 변수와는 다른 개념! 지역변수 '메서드에 포함된 변수'
즉 필드와 지역변수는 구분해야 한다.
클래스의 중괄호 내의 선언 : '필드'
메서드의 중괄호 내의 선언 : '지역변수'
필드와 지역변수의 또다른 차이점! 초기값
필드는 직접 초기화 하기 않아도 강제로 초기화
지역변수는 직접 초기화 하지 않은면 오류 발생

 */



