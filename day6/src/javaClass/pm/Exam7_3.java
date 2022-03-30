package javaClass.pm;

public class Exam7_3 {

	public static void main(String[] args) {
		// 명시적으로 this 키워드 를 붙여야 하는 경우
		X x = new X();
		x.init(2, 3);
		System.out.println(x.m);
		System.out.println(x.n);
		
		Y y = new Y();
		y.init(2, 3);
		System.out.println(y.m);
		System.out.println(y.n);
		
	}
}  // Exam7_3 End

class X{
	int m;     // 자동 초기값 0
	int n;     // 자동 초기값 0
	void init(int m, int n) {  // int m=2, int n=3
		m=m;
		n=n;
	}
}  // X end
class Y{
	int m;
	int n;
	void init(int m, int n) {
		this.m=m;    // y.m = 2
		this.n=n;    // y.n = 3
	}
}  // X end
