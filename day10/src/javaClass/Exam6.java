package javaClass;

import java.rmi.server.ExportException;

public class Exam6 {

	public static void main(String[] args) {
		// 예외
/*
예외는 연산, 숫자 포멧, 등과 같이 상황에 따라서 개발자가 해결할 수 있는 '오류'
(해결할 수 있는 - 오류 자체를 수정할 수 있다 X 오류시 차선책으로 선택을 하는 것 )

에러는 java에서 발생하는 오유로 개발자가 해결할 수 없는 '오류'

자바에서는 예외도 객체
자바 예외 최상위 클래스 Exception Class
	에러의 최상위 클래스 Error Class
	
이 두 클래스는 모두 Throwable 클래스를 상속 받고 있다
이 두 클래스는 모두 Throwable 클래스의 모든 기능을 포함
	
throwavle 클래스를 상속 받는 Exception 클래스는 다시
일반 예외 checked exception 클라스 / 실행 예외 unchecked exception 클라스 	
으로 나뉨

일반예외는 컴파일 전에 체크
실행예외는 실행 중에 체크

Exception 클래스에게서 직접상속밭은 예외 클래스 들이 처리하는 
일반 예외는 컴파일 전에 예외 발생 문법을 검사
반명 실행예외는 컴파일 전이 아니라 실행할 때 발생하는 예외로 
예외처리를 하지 않더라도 실행됨
따라서 실생중에 프로그램이 강제 종료 되는 이유는 대부분 실행 예외 때문

1. 일반 예외 일반 예외는 예외 처리를 하지 않으면 컴파일 자체 불가.
일반 예외 클래스를 알아보자.

InterruptedException - Thred.sleep(시간) 메서드는 일정 시간동안 해당 
쓰래드를 일시적으로 상태로 만드는 Thread 클래스의 메서드
이 메서드는 일반 예외가 발생할 수 있다. 때문에 반듯이 예외처리를 해야 한다.
예외처리를 생략하면 문법 오류가 발생해서 컴파일 자체가 불가능( 예외 강제 )
	classNotFoundException, 
	IOException,
	FileNotFoundException,
	CloneNotSupportedException

		// 1. InterruptedException
		// Thread.sleep(1000);
		
		// 2. ClassNotFoundException
		// Class cls = Class.forName("java.lang.Object");

실행 예외
일반예외는 예외처리를 하지 않으면 오류가 발생하여 실행 자체가 불가능
실행얘외는 일단 실행은 된다. 오류가 발생하지 않는다.

그렇기 때문에 예외 처리 없이 컴파일과 실행은 가능하지만 
실행중에 실행 예외가 발생하면 프로그램이 강제 종료됨

ArithmeticException
Arithmetic의 사전적 의미 '산술', '연산'
연산 자체가 불가능 할때 발생되는 실행 예외이다.
분모가 0일때 즉 0으로 나눌때 이다. 이런 계산을 하게되면 예외가 발생된다.
 		System.out.println(3/0);

ClassCastException
상속 관계에 있는 클래스 간의 업캐스팅은 항상 가능하지만 
다운캐스팅은 '가능 할수도', '불가능 할수도' 있다
ClassCastException 다운 캐스팅이 불가능한 상황에서 다운캐스팅을 시도할 때
발생된다. 
		A a = new A();
		B b = (B) a;

ArrayIndexOutOfBoundsException
배열의 인덱스를 잘못 사용할 때 발생
		int[] a = {1,2,3};
		System.out.println(a[3]);

자바에서는 예외 처리 구문이 있으면 적절한 예외가 처리 됬다고 판단 
프로그램 강제종료하지 않는다. 심지어 코드가 없어도 예외처리 된것으로 간주

*/		
		
		
		
		
		
//		try {
//			
//		}catch(Exception e) {
//			
//		}
		
	}

}

class A {}
class B extends A {}
