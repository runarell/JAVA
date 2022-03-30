package javaClass.pm;

public class Exam4 {

	public static void main(String[] args) {
		// this() 자신의 class의 생성자 호출
		// this.val 자신의 class 변수 var 호출
/*		
	생성자가 this()를 사용하는 이유
	객체를 생성하는 것과 함께 생성자의 주요역활은 필드 초기화
	class A {
		int m1, m2, m3, m4;
		
		A(){
		m1=1; m2=2; m3=3; m4=4; 
		}
		
		A(int a){
			int m1, m2, m3, m4;
			m1=a; m2=2; m3=3; m4=4; 
		}
		A(int a, int b){
			int m1, m2, m3, m4;
			m1=a; m2=b; m3=3; m4=4; 
		}
	}
	
	클래스 A에는 4개의 필드와 3개의 생성자가 있다
	각 생성자는 필드값의 초기화 하는데 방법이 약간씩 차이가 있다.
	첫 생성자는 4개의 필드를 초기화 하고 두번때 필드는 첫번째 필드에만 입력받은 값을
	대입하고 나머지는 첫번째 생성자와 동일하게 초기화 했다.
	
	 각 생성자마다 중복되는 코드를 많이 포함함
	 만약 20개의 생성자면 20줄의 초기화 코드가 반복
	 
	 만약 두번때 생성자에세 첫번때 생성자를 호출한다면 
	 두번째 생성자는 1개의 필드만 초기화 하면됨
	 세번째도 두번째를 불러오면 1개만 초기화 하면됨
	 
	 this() 메서드는 생성자의 중복을 제거할 수 있다.

*/
		A a1 = new A();
		A a2 = new A(10);
		A a3 = new A(10, 20);
		
		a1.print();
		a2.print();
		a3.print();
		
		System.out.println("=====================");
		B b1 = new B();
		B b2 = new B(10);
		B b3 = new B(10, 20);
		
		b1.print();
		b2.print();
		b3.print();
		
	}
}

class A {
	int m1, m2, m3, m4;
	
	A(){
		m1=1; m2=2; m3=3; m4=4; 
	}
	
	A(int a){
		m1=a; m2=2; m3=3; m4=4; 
	}
	A(int a, int b){
		m1=a; m2=b; m3=3; m4=4; 
	}
	
	void print() {
		System.out.print(m1+" ");
		System.out.print(m2+" ");
		System.out.print(m3+" ");
		System.out.print(m4+"\n");
	}
}

class B {
	int m1, m2, m3, m4;
	
	B(){
		m1=1; m2=2; m3=3; m4=4; 
	}
	
	B(int a){
		this();
		m1=a; // m2=2; m3=3; m4=4; 중복 제거 
	}
	B(int a, int b){
		this(a);
		m2=b;  //  m1=a; m3=3; m4=4; 중복 제거
	}
	
	void print() {
		System.out.print(m1+" ");
		System.out.print(m2+" ");
		System.out.print(m3+" ");
		System.out.print(m4+"\n");
	}
}
