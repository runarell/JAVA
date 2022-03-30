package javaClass.pm;

public class Exam5 {

	public static void main(String[] args) {
		// Method overloading
		
//		printa();  // 인수가 없을 때
//		printb(3);  // 인수가 1개 int
//		printc(5.8); // 인수가 1개 double
//		printd(2,5); // 인수가 2개 일때
		
//		print(); // 하나의 이름으로 위의 모든기능 사용 가능
		
		
	}
	
//	public static void printa() {
//		System.out.println("데이터가 없습니다.");
//	}
//	public static void printb(int a) {
//		System.out.println(a);
//	}

	public static void print() {
		System.out.println("데이터가 없습니다.");
	}
	public static void print(int a) {
		System.out.println(a);
	}
	public static void print(double d) {
		System.out.println(d);
	}
	public static void print(int a, int d) {
		System.out.println(a+d);
	}

}
