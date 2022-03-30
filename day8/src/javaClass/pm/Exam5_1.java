package javaClass.pm;

public class Exam5_1 {
	// 메서드 오버라이딩 method overriding
	// 메서드 덮어쓰기
	// 부모 클래스에게 상속 받은 메서드와 동일한 이름의 메서드를 재 정의 하는것
	//1. 부모 클래스의 메서드와 타입, 갯수가 완전 동일해야함
	//2. 부모 클래스의 메서드보다 접근 지정자의 범위가 같거나 넓어야 한다.
	/*
class A {
	void print(){
		System.out.println("A클래스");
	}
}
class B extends A{
	void print(){
		System.out.println("B클래스");
	}
} 
  
오버라이딩을 덮어쓰기라고 표현했지만 사실 차이가 있음
덮어쓰기 이전 내용이 완전히 삭제되고 새로운 내용으로 바뀌는 개념
오버라이딩은 이전 print() 메서드 위에 새로운 메서드가 올라타는 개념
사실 부모의 print()를 강제로 호출 가능하다.

메서드 오버라이딩을 사용하는 이유

모든 객체를 부모타입 한가지로 선언하면 배열로 한번에 관리할 수 있는 장점이 있다.

  
	 */
	public static void main(String[] args) {
		Q q = new Q(); // Q자료형 Q생성자
		q.print();
		
		W w = new W(); // W자료형 W생성자
		w.print();
		
		Q qw = new W(); // Q자료형 W생성자
		qw.print();
	}
}

class Q {
	void print() {
		System.out.println("Q클래스");
	}
}
class W extends Q{
	void print() {
		System.out.println("W클래스");
	}	
}















