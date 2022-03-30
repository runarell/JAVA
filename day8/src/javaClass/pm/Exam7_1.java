package javaClass.pm;

public class Exam7_1 {

/*
부모 클래시에도 init() 메서드가 있고 500줄정도의 코드가 있음
자식은 오버라이딩으로 한개의 코드를 추가하고 싶을때
오버라이딩으로 500줄 모두 작성해야함
But!! super를 사용하면 자식클래스에서 부모클래스의 메서드를 호출하면
자식에서는 1줄만 추가해 주면 된다!! // 중복 제거

*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class U {
	void init() {
		// ... 500줄
	}
}

class I extends U{
	void init() { // overriding
	//... 500줄
	// 화면출력 메서드

	}
}
class K extends U{
	void init() { // overriding
		super.init(); // 부모의 init을 호출!!(500줄이 1줄로!!)		
	}
}

