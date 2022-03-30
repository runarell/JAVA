package javaClass1;
class Apple{}
class Pencil{}

class Goods1{
	private Apple apple = new Apple();
	public Apple get() {
		return apple;
	}
	public void set(Apple apple) {
		this.apple = apple;
	}
}
class Goods2{	
	private Pencil pencil = new Pencil();
	public Pencil get() {
		return pencil;
	}
	public void set(Pencil pencil) {
		this.pencil = pencil;
	}
}
public class Exam4 {

	public static void main(String[] args) {
/*
Generic 제네릭

 자바에서는 다양한 종휴 클래스와 인터체이스를 제공한다. 
 이런한 클래스와 인터페이스를 내부 맴버에서 활용하는 클래스를 작성할 때는
 제공되는 클래스나 인터페이스의 다양성만큼 많은 가지 수의 클래스를 생성해야 한다.
 또한 동일한 이름의 메서드가 다양한 타입의 입력 매개변수를 가질수 있도록 하려면 
 고려하는 입력 매개변수 타입의 수만큼 오버로딩을 수행해야 한다.
 그래서 이런한 비효율성을 한번에 해결하는데 필요한 요소가 바로 '제네릭' 이다.
 
 1. 제너릭을 사용하지 않고 여러 객체를 저장한는 클래스를 작성
 

 
*/
		Goods1 goods1 = new Goods1();
		goods1.set(new Apple());
		Apple apple = goods1.get();
		
		Goods2 goods2 = new Goods2();
		goods2.set(new Pencil());
		Pencil pencil = goods2.get();
		
		
	}
}





