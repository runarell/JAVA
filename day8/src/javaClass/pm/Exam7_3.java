package javaClass.pm;

class superA{
	superA(){
		System.out.println("A생성자");
	}
}
class superB extends superA{
	superB(){
		super();  // 생략 가능
		System.out.println("B생성자");
	}
}

class superC{
	superC(int a){
		System.out.println("C생성자");
	}
}
class superD extends superC{
/*
 자바가 자동으로 추가
 superD(){
 super();
 }
*/
	superD(){
		super(3);
	}
}


public class Exam7_3 {

	public static void main(String[] args) {
		// 
		
		superA sa = new superA();
		System.out.println();
		
		superB sb = new superB();
		System.out.println();
		superC sc = new superC(3);
		System.out.println();
		superD sd = new superD();
	}

}
