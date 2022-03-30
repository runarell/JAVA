package javaClass.pm;

public class Exam6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal animal = new Animal();
		Bird bird = new Bird();
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		animal.cry();
		bird.cry();
		cat.cry();
		dog.cry();
		System.out.println("=============");
		
		Animal animal2 = new Animal();
		Animal bird2 = new Bird();
		Animal cat2 = new Cat();
		Animal dog2 = new Dog();
		
		animal.cry();
		bird.cry();
		cat.cry();
		dog.cry();
		System.out.println("=============");
		
		Animal[] animals = {animal2, bird2, cat2, dog2};
		
		for(Animal ani : animals) {
			ani.cry();
		}
		
	}
}

class Animal{
	void cry() {}
}

class Bird extends Animal{
	void cry() {
		System.out.println("짹짹");
	}
}
class Cat extends Animal{
	void cry() {
		System.out.println("야옹");
	}
}
class Dog extends Animal{
	void cry() {
		System.out.println("멍멍");
	}	
}