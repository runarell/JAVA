package javaClass2;

public class Exam10 {

	public static void main(String[] args) {
		Thread curThread = Thread.currentThread();
		System.out.println( "현재 쓰래드의 이름"+curThread.getName() );
		System.out.println( "현재 쓰래드의 이름"+curThread.activeCount() );
	
		
	}
}
