package javaClass;

public class Exam5 {

	public static void main(String[] args) {
		// final 메서드 final class
/*
final 변수는 저장된 값이 최종값의 의미
메서드 class 도 각 각 최종의 의미
final method : 상속시 부모의 메서드를 오버라이딩 하면 자식에서 메서드 기능이 변경
 final메서드는 자식 클래스에서 해당 메서드를 오버라이딩 불가
*/
	}
}

class A {
	void abc() {}
	
	final void bcd() {}
}

class B extends A{
	void abc() {// 부모의 메서드 오버라이딩
	}
//	void bcd() {}  // final 오버라이딩 불가!
}
class AA {
	void abc(){}
}
class BB extends AA{
	void abc(){}
}
