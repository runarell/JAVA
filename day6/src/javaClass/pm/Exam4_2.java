package javaClass.pm;

public class Exam4_2 {

	public static void main(String[] args) {
		// 메서드
		// 메서드는 클래스의 기능에 해당하는 요소
		// 사람 클래스 : 먹기, 자기, 공부하기
		// 자동차 클래스 : 엑셀, 브레이크, 후진
		// 메서드명 : 관례적으로 소문자로만 만든다.
		
		// 메서드의 기본형태
		// 제어자 반환타입 메서드명(인수){}
		// public static int sum(int a, int b){}
		//입력값으로 int형 a,b를 입력받아 int값을 반환
		
		// 반환 타입
		// 여러가지 형태의 반환 타입
		//1. input도 없고 return 도 없다.
		// void print(){
		// 		System.out.println("HI");
		// } //리턴타입이 void ( 리턴 없음, 인수없음 )  
		
		//2. input은 없고 return은 있다.
		// String print(){
		// 		return "HI";
		// }	
		
		//3. input은 있고 return은 없다.
		// void print( String name ){
		// 		System.out.println(name);
		// } 
		
		//4. input도 있고 return 도 있다.
		// int print( int a, int b ){
		//		return a+b;
		// } 
		
		// 메서드 호출 
		// 메서드를 사용하려면 먼저 객체를 생성해야 한다.
		// A a = new A();
		// a.method();
		
		C c = new C();
		
		c.print();
		
		int k = c.data();
		System.out.println(k);
		
		double l = c.sum(3, 5.6);
		System.out.println(l);
		
		c.printMonth(3);
		c.printMonth(13);
		
		
				
	}  // main End

} // class End


class C{
	// no intput no output  return이 없으면 out도 없다.
	void print() {
		System.out.println("안녕");
	}
	// no input yes output
	int data() {
		return 3;
	}
	// yes input yes output
	double sum(int a, double b) {
		return a + b;
	}
	// yes input no output
	void printMonth(int m) {
		if(m < 1 || m > 12) {
			System.out.print("월을 잘못 입력하셨습니다.");
			return;  // 메서드를 빠져 나가기 위한 return
		}
		System.out.println(m + "월입니다.");
	}
	
	
}





