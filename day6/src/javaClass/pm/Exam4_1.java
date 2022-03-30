package javaClass.pm;

public class Exam4_1 {

	public static void main(String[] args) {
		B a = new B();
		
		a.printFieldValue();
	}

}

class B{
	boolean m1;
	int m2;
	double m3;
	String m4;
	
	void printFieldValue() {
		// 필드는 강제 초기화 
		System.out.println(m1); 
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
	}
	void printLocalValue() {
		int k;
		// 지역변수를 초기화 하지 않았기 때문!
//		System.out.println(k1); // 에러 발생!!
		
		// 자바 문법은 서로 얽히고 설켜 하나를 설명하다보면 아직 배우지
		// 않은 내용을 설명 해야함. 지금은 잘 이해가 안되더라도
		// 다른 부분을 공부하는 과정에서 쉽게 이해할 수 있다.
	}
}