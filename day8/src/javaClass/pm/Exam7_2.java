package javaClass.pm;

public class Exam7_2 {

	public static void main(String[] args) {
	/*
	모든 생성자의 첫줄에는 반듯시 this() 또는 super()가 있어야함
	없으면 자동으로 자바가 삽입
	상속 관계일 때 생성자를 호출하면 항상 부모클래스의 생성자가 호출됨
	자식이 클래스로  
	*/	
		X x = new X();
		
	}  //main end
}  //Exam7_2 end


class V{
	V(){
		System.out.println("V생성자");
	}
}
class X extends V{
	X(){
//		super();  // 주석이되도 실행됨!!
		System.out.println("X생성자");
	}
}
// 자식이 생성되려면 자식인 생성됨
