package javaClass.pm;

public class Exam6 {

	public static void main(String[] args) {
		// 가변길이 메서드
		// 메서드 오버로딩은 입력변수의 개수 혹은 자료형에 따라서 구분
		// 만약 입력 변수로 1~100사이 불특정 갯수로 입력이 들어오면?
		// 메서드도 100를 만들어야 할까?
		// 이것을 간단하게 할 수 있는 방법이 가변 길이 매개변수를 사용!!
				
//		sum(1);
//		sum(1,2);
//		sum(1,2,3);
		
		method1(1,2);
		method1(1,2,3);
		method1();
		
		method2("안녕","방가");
		method2("땡큐","베리", "감사");
		method2();
	}	
//	public static void sum(int a) {}
//	public static void sum(int a, int b) {	}
//	public static void sum(int a, int b, int c) {}
	
	public static void method1(int...values) {
		System.out.println("길이 : "+ values.length);		
		for(int e : values) {
			System.out.print(e + " ");
		}
		System.out.println("");
	}
	public static void method2(String... str) {
		System.out.println("길이 : "+ str.length);		
		for(String e : str) {
			System.out.print(e + " ");
		}
		System.out.println("");
	}
	
	
	
}
