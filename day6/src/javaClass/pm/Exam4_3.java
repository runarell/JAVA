package javaClass.pm;

public class Exam4_3 {

	public static void main(String[] args) {
		//class 내부에서 method 호출하기
		// class 내부에 있는 method 끼리는 객체를 생성하지 않고도 서로 호출가능
		// 필드 역시 class 내부의 모든 method 안에서 객체를 성성하지 않고 사용 가능
		// 다만! method 앞에 static 이 붙어 있을 경우만 호출 가능
		
		print();
		
		int a = twice(3);
		System.out.println(a);
		
		double b= sum(a, 5.8);
	}
	
	public static void print() {
		System.out.println("안녕");
	}
	
	public static int twice(int k) {
		return k*2;
	}
	
	public static double sum (int a, double b) {
		return a+b;
	}

}
