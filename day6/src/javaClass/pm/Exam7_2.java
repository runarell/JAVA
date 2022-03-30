package javaClass.pm;

public class Exam7_2 {

	public static void main(String[] args) {
		// this 키워드 ( 파이썬 self)
		// 모든 메서드에는 자신이 포함된 클래스의 객체를 가르키는 this가 있음
		// this는 생략이 가능. 묵시적으로 사용됨
		// this. 생략해도 항상 자바 자동으로 추가해 주므로 전혀 신경쓸 필요가 
		// 없어 보이기도 한다. 하지만 this를 명시적으로 붙여야 할 경우가 있다.
		
		
		Z z = new Z();
		z.work();
		System.out.println(z.m);
		System.out.println(z.n);
		
	}  //main End
}  //Exam7_2 End

class Z{
	int m;
	int n;
	void init(int a, int b) {
		int c;
		c = 3;
		this.m = a;  // this 키워드를 생략하면 자동으로 추가
		this.n = b;  // this 키워드를 생략하면 자동으로 추가
	}  // init End
	
	void work() {
		this.init(2, 3);  // this 키워드를 생략하면 자동으로 추가
	}
	
} // Z end