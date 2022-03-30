package javaClass;

class FoolException extends RuntimeException{
	// 디폴트 생성자를 자동으로 만들어 준다.
	// 상속을 받고 있으므로 자동으로 부모의 생성자를 호출 한다. super();
}


public class Exam6_1 {

	public void sayNick(String nick) {
		if("fool".equals(nick)) {
			throw new FoolException();
		}
		System.out.println("당신의 별명은 "+nick+"입니다.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exam6_1 sp = new Exam6_1();
		sp.sayNick("fool");
		sp.sayNick("genious");
	}

}
