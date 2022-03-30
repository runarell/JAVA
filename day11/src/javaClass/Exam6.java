package javaClass;

public class Exam6 {
	/*
	예외를 강제로 발생 시키기 Throw 
	예를 들면 int age = -1; 실제는 예외가 아님, 
	하지만 이경우 나이는 -1일 수가 없음. 강제로 에러(예외)로 인식 시킬 필요가 있음

	이럴 경우 해결 방법은 예외 클래스를 직접 정의 하는 것
	사용자 정의 예외 클래스를 만들어 보면 다른 예외 들의 동작 메커니즘도 자연스럽게 이해가능

	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b = new B();
		b.bcd1();
		b.bcd2();

	}  // main end
}  // Exam6 end

class MyException extends Exception{  // 일반 예외
	public MyException(){ super(); }
	public MyException(String s){
		super(s);
	}	
	
}
class MyRTException extends RuntimeException{ // 실행 예외
	public MyRTException(){ super(); }
	public MyRTException(String s){
		super(s);
	}	
}

class B {
	MyException me1 = new MyException();
	MyException me2 = new MyException("예외 메시지: MyException");
	
	MyRTException mer1 = new MyRTException();
	MyRTException mer2 = new MyRTException("예외 메시지: MyException");

	void abc1(int num) {
		try {
			if(num>70) {
				System.out.println("정상");
			}else {
				throw me1;
			}
		} catch(MyException e) {
			System.out.println("예외 처리1");
		}
	}
	void bcd1() {
		abc1(65);
	}
	
	void abc2(int num) throws MyException{
		if (num>70) {
			System.out.println("정상");
		}else {
			throw me1; // 강제 예외 발생
		}
		
	}
	
	void bcd2() {
		try {
			abc2(65);
		}catch(MyException e) {
			System.out.println("예외 처리 2");
		}
	}
}