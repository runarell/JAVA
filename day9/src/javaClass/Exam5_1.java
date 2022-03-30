package javaClass;

public class Exam5_1 {
	/*		
// abstract 추상
// abstract method   abstract class

 abstract method - 중괄호가 잆는 메서드
 abstract 리턴타입 메소드명();
 
Animal animal1 = new Cat();
animal1.cry();
Animal animal2 = new Dog();
animal2.cry();
 
// 추상 메서드를 만들려면 추상 클래스에 담아야함
// 추상 클래스도 클래스 임으로 상속가능
// 객체생성 불가
class Animal{
	void cry() {};  // 기능 구현 X
}
class Cat extends Animal{
	void cry() { System.out.println("야옹"); };
}
class Dog extends Animal{
	void cry() { System.out.println("멍멍"); };
}

추상메서드의 장점 
자식 메서드에서 오버라이딩 하는 과정
 
	 */
	public static void main(String[] args) {
		Animal animal1 = new Cat();
		animal1.cry();
		Animal animal2 = new Dog();
		animal2.cry();
	}

}

abstract class Animal{
	abstract void cry();  // 기능 구현 X
}
class Cat extends Animal{
	void cry() { System.out.println("야옹"); };
}
class Dog extends Animal{
	void cry() { System.out.println("멍멍"); };
}
