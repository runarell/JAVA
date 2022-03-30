package javaClass.pm;

public class Exam4 {
	// 상속 inhertence 다형성 polymorphism
	/*
	클래스는 객체지향에서 가장 기본적인 요소이다.
	객체 지향적 관점에서 가장 중요한 부분은 '상속' 이다.
	상속을 이해아는 것이 객체지향적인 프로그램에서 제일 중요하다.
	상속에 대한 이해를 통해 객체 타입변환, 매서드 오버라이팅 super 
	키워드 super() 메서드 등도 쉽데 이해할 수 있다.
	1. 상속의 개념 - 인간의 상속과 유사. 부모늬 자원을 자식이 마음대로 가져다 씀.

		학생     	직장인    -- 공통 요소 추출 -->   
	  	이름		이름							이름
	  	나이		나이							나이
	  	학번 		사번							먹기()
	  								   ---> 잠자기() <---
	  	먹기()	먹기()				학생				직장인
	  	잠자기()	잠자기()				학번				사번
	  	등교하기()출근하기()				등교하기()			출근하기()

	상속의 장점
	1. 코드의 중복성 제거
	2. 다형적 표현 가능

	사과[] apple = {사과1, 사과2};
	포도[] apple = {포도1, 포도2};
	키위[] apple = {키위1, 키위2};

	사과 포도 키위는 모두 과일이다. 따라서 '과일' 이라는 부모 클래스를 만들어 
	각각 상속 시키면 다형적 표현 가능
	과일[] fruits = {사과 포도 키위}
	*/
	public static void main(String[] args) {

	}
}

//class Humen{
//	String name;
//	int age;
//	void eat() {}
//	void sleep() {}
//}
//
//class Student extends Humen{
//	int studentID;
//	void goToSchool() {}
//}
//class Worker extends Humen{
//	int workerID;
//	void goToWork() {}
//}


