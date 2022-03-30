package javaClass;

public class Qize1 {

	public static void main(String[] args) {		
		Scoer aa = new Scoer();
//		aa.checkScore(85);
//		aa.checkScore(110);
		try {
			aa.checkScore(85);
			aa.checkScore(110);			
		}catch(MinusException | OverException e){
			System.out.println(e.getMessage());
		}
	}
}

class MinusException extends Exception{  // 일반 예외
	public MinusException(String s){ super(s); }	
}
class OverException extends Exception{  // 일반 예외
	public OverException(String s){ super(s); }	
}

class Scoer{
	
	void checkScore(int num) throws OverException, MinusException{	
		if (num > 100) {
			throw new OverException("예외발생:음수값 입력");			
		}else if( num < 0){
			throw new MinusException("예외발생:100점 초과");
		}else {			
			System.out.println("정상 값 입니다.");		
		}		
	}
}