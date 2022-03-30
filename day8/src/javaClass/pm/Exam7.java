package javaClass.pm;

public class Exam7 {
	// super 키워드 super() 메서드
	
	/*
this키워드 this()는 클래스 내부 특정 구성요소(생성자, 객체) 호출시 사용
생략시 자동 추가해 주기도 함.
이와 달리 super는 모두 부모 클래스와 관련됨. 
상속관계에서 사용함.

	 */
	public static void main(String[] args) {
		J j = new J();
		j.bcd();
		H h = new J();
//		h.bcd(); // 사용불가 
	}
}

class H{
	void abc() {
		System.out.println("H클라스의 abc()");
	}
}

class J extends H{
	void abc() {
		System.out.println("J클라스의 abc()");
	}
	void bcd() {
		abc();			//자신의(this) abc() 콜
		super.abc();	//부모의 abc() 콜
	}
}