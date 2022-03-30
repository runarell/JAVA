package javaClass.pm;

public class Exam7_2 {
	// static 제어자
	/*
static 은 필드, 메서드, 이너클래스 에서 사용하는 제어자 이다.
지금까지 클래스의 맴버를 다른 클래스에서 사용하기 위해 객체를 생성하고 사용함
객체를 사용할수 있는 상태가 되는 맴버를 인스턴스 멤버 instance member 라고 한다
다시 말하면 인스턴스 맨버는 맴버 앞에 static 이 붙지 않은 것을 말한다
static 이 붙은 맴버들은 정적 맴버 static member 라고 부른다

static 의 특징 객체 생성 없이 '클래스명.정적맨버명'으로 접근가능
static 도 객체 생성 후 에도 사용가능 

반드시 기억!! static의 특징 'static'은 객체들 간의 공유 변수의 성질을 가짐
static은 모든 객체가 공유하는 변수!!

정적 필드에서는 공유 qustn

	 */
	public static void main(String[] args) {
		Q q1 = new Q();
		Q q2 = new Q();
		
//		System.out.println(q1.m);
//		System.out.println(q1.n);
//		System.out.println("============");
//		System.out.println(Q.n);
//		System.out.println(Q.m); // 접근 불가
		
		q1.n = 7;
		q2.n = 8;
		Q.n = 9;
		System.out.println(q1.n);
		System.out.println(q2.n);
		System.out.println(Q.n);
	}
}

class Q {
	int m=3;
	static int n =5; // 정적 맴버
}