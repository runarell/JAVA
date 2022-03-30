package javaClass;


//class FoolException extends RuntimeException{
//	// 디폴트 생성자를 자동으로 만들어 준다.
//	// 상속을 받고 있으므로 자동으로 부모의 생성자를 호출 한다. super();
//}
public class Exam7 {

	public void sayNick(String nick) {
		try {
			if("fool".equals(nick)) {
				throw new FoolException();
			}
			System.out.println("당신의 별명은 "+nick+"입니다.");
		}catch(FoolException e){
			System.out.println("FoolException 발생");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exam7 sp = new Exam7();
		sp.sayNick("fool"); 	// 예외 발생됨 , 처리됨
		sp.sayNick("genious");	// 잘 실행
	}

}
