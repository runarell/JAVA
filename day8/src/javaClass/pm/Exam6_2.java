package javaClass.pm;

public class Exam6_2 {
/*
class A{
	void print1(){
		System.out.println("A클라스 print 1")
	}
	void print2(){
		System.out.println("A클라스 print 2")
	}
}
class B extends A{
	void print1(){  // 메서드 오버라이딩
		System.out.println("B클라스 print 1")
	}
	void print2(int a){  // 메서드 오버로딩
		System.out.println("B클라스 print 2")
	}
}

*/
	public static void main(String[] args) {
		P p = new P();
		p.print1();
		p.print2();
		
		System.out.println("===========");
		O o = new O();
		o.print1();
		o.print2();
		o.print2(3);
		
		P po = new O();
		po.print1();
		po.print2();
//		po.print2(2);  // 오류 
		
	}

}

class P{
	void print1(){
		System.out.println("P클라스 print 1");
	}
	void print2(){
		System.out.println("P클라스 print 2");
	}
}
class O extends P{
	@Override   // @ 에너테이션은 컴퓨터도 읽는 주석
	void print1(){  // 메서드 오버라이딩
		System.out.println("O클라스 print 1");
	}
	void print2(int a){  // 메서드 오버로딩
		System.out.println("O클라스 print 2");
	}
}