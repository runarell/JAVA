package javaClass.pm;

public class Exam7_1 {

	public static void main(String[] args) {
		// 생성자 오버로딩 Constructor Overloading
		// 생성자의 모양에(개수, 자료형) 따라 객체를 생성하는 방법이 결정됨
		
		
		K k1 = new K();
		K k2 = new K(3);
		K k3 = new K(93, 5);
	}  //main End

}  // Exam7_1 End

class K {
	K(){ // 생성자는 클래스 명과 동일, 러턴이 없다.
		System.out.println("첫번째 생성자");
	}
	K(int a){
		System.out.println("두번째 생성자");
	}
	K(int a, int b){
		System.out.println("세번째 생성자");
	}
	
}
