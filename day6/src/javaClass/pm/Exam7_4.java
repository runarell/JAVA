package javaClass.pm;

public class Exam7_4 {

	public static void main(String[] args) {
		// this() 메서드 ( this 키워드와 완전 다름)
		// this() 메서드는 this 키워드롸 빗슷해 보이지만 의미가 다르다.
		// this() 메서드는 자신이 속한 클래스 내부의 다른 생성자를 호출시 사용
		// 1. 생성자의 내부에서만 사용.
		// 2. 생성자의 첫줄 위치한다.
		// 두 조건 다 충족되지 않으면 오류!
		
		T t1 = new T();
		System.out.println();
		T t2 = new T(3);   // 생성자 오버로딩
		
	}  // main End
}  // Exam7_4 End

class T{
	T(){
		System.out.println("첫번째 생성자");
	}
	T(int a){  // 생성자 오버로딩
		this();  // 생성자 내부에서 첫번째 생성자 호출
		System.out.println("두번째 생성자");
	}
	
	
}  // T End