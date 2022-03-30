package am;

public class A {
	public    int a = 1;
	protected int b = 2;
			  int c = 3; // default
	private   int d = 4;
	
	public void print() {
		System.out.print(a);
		System.out.print(b);
		System.out.print(c);
		System.out.print(d+"\n");
	}
}

//class A{
//	public int m = 3;
//	public int n = 4;
//	public void print() {
//		System.out.println("임포트");
//	}
//	
//	public static void main(String[] args) {
//		B b = new B();
//		b.print();
//	}
//}
//class B{   // 외부 클라스 B는 public 선언 불가
//	int m=3;
//	int n=4;
//	void print() {
//		System.out.println(m+" "+n);
//	}
//}
