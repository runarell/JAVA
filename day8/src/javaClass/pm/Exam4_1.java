package javaClass.pm;

public class Exam4_1 {
	// 객체의 다형적 표현

	public static void main(String[] args) {
		Human h = new Human();
		h.name = "홍길동";
		h.age = 14;
		h.eat();
		h.sleep();
		
		Student s = new Student();
		s.name = "선춘향";
		s.age = 16;
		s.studentID = 31312;
		s.eat();
		s.sleep();
	}
}

class Human{
	String name;
	int age;
	void eat() { System.out.println("먹다");}
	void sleep() {System.out.println("자다");}
}

class Student extends Human{
	int studentID;
	void goToSchool() {System.out.println("등교");}
}
class Worker extends Human{
	int workerID;
	void goToWork() {System.out.println("출근");}
}
