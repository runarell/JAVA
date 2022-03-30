package javaClass;

public class Exam7 {

	public static void main(String[] args) {
/*
	예외처리 문법은 크게 3가지
	try{
		//일반 예외, 실행 예외 발생 가능 코드 
	}catch(예외명 변수){
		// 예외가 발생했을 때 처리
	}finally{
		// 예외발생 여부와는 관계없이 항상 언제나 실행
	}
	
*/
		// 1. 단일 try catch
		try{
			System.out.println(3/0);     // ---> 예외 발생 --> 자바(예외 클래스 객체 생성)
			// 									| ArithmeticException excep = new ArithmeticException();
		}catch(ArithmeticException e){   //<----| 
			System.out.println("숫자는 0으로 나눌수 없습니다."); 
			System.out.println("프로그램 종료");
		}
/*
예외 처리 과정
실제 내부적으로 예외가 처리되는 과정을 자세히 알아보자
*/
		// 1. 단일 try catch
		try{
			System.out.println(3/0);     		
		}catch(ArithmeticException e){   
			System.out.println("숫자는 0으로 나눌수 없습니다."); 
		}finally{
			System.out.println("프로그램 종료");			
		}
		//2. 다중 try ~ catch
		// 1. 단일 try catch
		try{
			System.out.println(3/0);
			int num = Integer.parseInt("10A");
		}catch(ArithmeticException e){ 
			System.out.println("숫자는 0으로 나눌수 없습니다.");
		}catch(NumberFormatException e){ 
			System.out.println("숫자로 바꿀수 없습니다."); 
		}finally{
			System.out.println("프로그램 종료");			
		}
/*
다중 예외 처리 구문을 작성시 주의할 사항은 try()구문에서 예외가 발생하고 여러개의 catch() 구문이 있어도 실행되는
catch()구문은 항상 위에서부터 확인한다는 것이다.
이것은 마침 if/else if/else 구문에서 조건식을 위에서 부터 검사하는것과 같다.
*/
		//하나의 예외로 2개의 예외를 동시에 처리하 도록 처리
		try{
			System.out.println(3/0);
			int num = Integer.parseInt("10A");
		}catch( ArithmeticException | NumberFormatException e){ 
			System.out.println("예외가 발생했습니다.");
		}finally{
			System.out.println("프로그램 종료");			
		}
		// finally는 항상 실행 블럭/ 또다른 기능이 있는데 이는 리소스 해제하는것
		// 리소스 해제 : 더이상 사용하지 않는 자원을 반납하는 것
		// 예를 들면 파일을 열어서 사용을 한뒤에 닫아야 다른 프로그램이 이 파일을 사용할 수 있다.
		// finally{}는 리소스를 해제하는 역활로도 사용
		
		
		
		
	}

}
