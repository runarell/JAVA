package javaClass2;

public class Exam9 {

	public static void main(String[] args) {
		Runnable audioRunnable = new audioThread();
		Thread thread1 = new Thread(audioRunnable);
		thread1.start();
		
		Runnable videoRunnable = new videoThread();
		Thread thread2 = new Thread(videoRunnable);
		thread2.start();

	}

}

class videoThread implements Runnable{
	@Override
	public void run() {
		int[] intArray = {1,2,3,4,5}; //비디오 프레임
		for (int n : intArray) {
			System.out.print("비디오프래임"+ n);
			try{Thread.sleep(200);} catch(InterruptedException e){}
		}
	}
}
class audioThread implements Runnable{
	@Override
	public void run() {
		String[] strArray = {"하나","둘","삼","넷","오"};		
		try {Thread.sleep(10);} catch (InterruptedException e) {}
		for (String s : strArray) {
			System.out.println(" - 자막번호"+ s);
			try {Thread.sleep(200);} catch (InterruptedException e) {}
		}
	}
}
