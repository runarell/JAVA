package javaClass;
public class Exam7{
	public static void main(String[] args) {
		Thread smvideoThread = new videoThread();
		Thread smaudioThread = new audioThread();
		smvideoThread.start();
		smaudioThread.start();
	}
}

class videoThread extends Thread{
	@Override
	public void run() {
		int[] intArray = {1,2,3,4,5}; //비디오 프레임
		for (int n : intArray) {
			System.out.print("비디오프래임"+ n);
			try{sleep(200);} catch(InterruptedException e){}
		}
	}
}
class audioThread extends Thread{
	@Override
	public void run() {
		String[] strArray = {"하나","둘","삼","넷","오"};		
		try {sleep(10);} catch (InterruptedException e) {}
		for (String s : strArray) {
			System.out.println(" - 자막번호"+ s);
			try {sleep(200);} catch (InterruptedException e) {}
		}
	}
}


