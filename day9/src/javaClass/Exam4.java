package javaClass;

public class Exam4 {
	
	/*
final... 필드, 메서드 클래스 앞에 위치. 의미각 각각 다르다
final qustn : 변수를 선언할때만 지정할 수 있고 한번 대입된 값을 수정 불가
처음 대입한 값이 최종값. 변수를 상수로 사용시 이용
final은 일단 한번 값이 입력되고 나면 절대로 값을 수정할 수 없다.
생성자라
	class A1{  		// 선언과 종시에 값을 대입
		int a = 3;
		final int b= 5;
		A1(){}
	}
	class A2{		//선언과 값 대입 분리
		int a;
		final int b;
		A2(){
			a=3;
			b=5;	// 첫 대입 후 더이상 수정 불가
		}
	}	
	class A2{		//선언과 값 대입 분리
		int a = 3;
		final int b= 5;
		A2(){
			a=7; 	// a는 변수 
			b=5;	// 불가능 한번 값을 대입하면 바꿀수 없다.
		}
	}
	
	class B {
		void bcd(){
			int a = 3;
			final int b = 5;
			a = 7;
			b = 9; // 불가능
			b = 5; // 불가능
		}
	}
	
	final double c = 3.14;
	// 복사본을 하나 만들어 원보인 삭제된 후에도 그 값을 활용할 수 있는 
	// 있도록 하는것 final
	
	 */

	public static void main(String[] args) {
		A1 a1 = new A1();
		A2 a2 = new A2();
		A3 a3 = new A3();
	}
}

class A1{  		// 선언과 종시에 값을 대입
	int a = 3;
	final int b= 5;
	A1(){}
}
class A2{		//선언과 값 대입 분리
	int a;
	final int b;
	A2(){
		a=3;
		b=5;	// 첫 대입 후 더이상 수정 불가
	}
}	
class A3{		//선언과 값 대입 분리
	int a = 3;
	final int b= 5;
	A3(){
		a=7; 	// a는 변수 
//		b=9;	// 불가능 한번 값을 대입하면 바꿀수 없다.
	}
}
