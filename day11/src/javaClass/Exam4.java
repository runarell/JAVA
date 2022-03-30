package javaClass;

public class Exam4 {

	/*
	// 예외 던지기
예외가 발생했을 때 그 위치에서 바로 얘외처리 할 수 있지만
호출한 지점으로 예외를 던질수도 있다. throws
예외 발생했을 때 2가지 해결책은 try-catch 를 이용하가나 예외를 던지는 것

예외 던지는 법
리턴타입 메서드명(변수) throws 예외클래스명{}
	// code
}

void abc(){
	try{
		bcd();
	}catch(예외 클래스  타입){
	
	}
}

void bcd() throws 예외 클래스 타입{
	// 예외 발생한 지점으로 던지기
}
	 */
	
	public static void main(String[] args) {
		A a = new A();
		a.abc();
	}

}
//class A {
//	void abc() {
//		bcd();
//	}
//	
//	void bcd() {
//		//예외처리
//		try {
//			System.out.println("start");
//			Thread.sleep(1000);
//			System.out.println("stop");
//		}catch(InterruptedException e) {
//			//예외처리 구문
//		}
//	}
//}
/*
2개의 메서드 abc() bcd() 가 있고 bcd()메서드의 내부에서 예외 발생 가능 코드
Tread.sleep()은 일반 예외가 발생할 수도 있기 때문에 메서드 사용을 위해서 반듯이 예외처리
하지만 bcd()가 예외처리 하는 것이 아닌 예외를 던질 수 있음
예외 처리 의무를 자신을 호출하는 메서드로 전가
따라서 abc()에서 예외처리 강요

이렇게 반듯이 예외처리 방식을 사용해야 하는 메서드 들이 있다.
*/
class A {
	void abc() {
		try {
			bcd();
		}catch(InterruptedException e) {
			//예외처리 구문
		}
	}
	
	void bcd() throws InterruptedException{	
			System.out.println("start");
			Thread.sleep(1000);
			System.out.println("stop");
	}
}

