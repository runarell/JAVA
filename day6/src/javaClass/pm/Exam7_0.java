package javaClass.pm;

public class Exam7_0 {

	public static void main(String[] args) {
		// 생성자 constructor
		// 객체를 생성할 때 자동으로 호출되어 실행됨
		//1. 생성자 이름은 글래스 이름과 동일한 이름이어야 함
		//2. 생성자는 리턴 타입도 없고 리턴도 없다.
		
		// 지금까지 생성자를 만들이 않은 이유
		// 생성자를 재작하지 않으면 
		// 자바는 default constructor를 자동 생성
		// 생성자를 하나라도 생성하면 자동생성X 기본생성자를 직접 명시해줘야함
		
		H h = new H();
		I i = new I();
//		J j = new J();  // 애러!! 생성자의 int의 인자를 안넣었다!
		J j = new J(3);
		
		h.work();
		i.work();
		j.work();
	}
}  //main end

class H{
	
//	H(){  개발자가 직접 만들지 않아도 자바가 자동 생성
//		// 아무런 기능이 없는 디폴트 생성자 default constructor
//	}
	int m;
	void work() {
		System.out.println(m);
	}
}
class I{
	// 생성자
	I(){
		// 아무런 기능이 없는 디폴트 생성자 default constructor
	}
	int m;
	void work() {
		System.out.println(m);
	}
}
class J{
	int m;

	J(int a){  	// 직접 생성자를 만들어야 하는 경우
		this.m = a;
	}
	
	void work() {
		System.out.println(m);
	}
}



;
