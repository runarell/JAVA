package javaClass.pm;

import am.A;

public class Exam7 {
	/*
	// 접근 제어자(지정자) modifier 는 클래스 필드 메서드 생성자 등에게
	// 특정 부여하는 문법 요소. 일종의 형용사로 생각할 수있다.
	// 사용 범위를 정의하는 역활
	// public > protected > default(아무 표시 없음) > private
	puvlic    : 같은 패키지 내의 모든 클래스 + 다른 패키지의 모든 클래스 에서 접근 가능
	protected : 같은 패키지 내의 모든 클래스 + 다른 패키지의 자식 클래스에서 접근가능
	default   : 같은 패키지 내의 모든 클래스
	private   :                       같은 클래스 에서만 사용 가능 
	*/
//	public    int a = 1;
//	protected int b = 2;
//			  int c = 3; // default
//	private   int d = 4;
	
	public static void mein(String[] args) {
		am.A a = new am.A();
		a.print();
	}  // main End
}// 
