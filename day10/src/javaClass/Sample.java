package javaClass;

interface Predator{
	String getFood();
	
	default void printFood() {
		System.out.printf("my food is %s\n", getFood());
	}
	
	int LEG_CONT = 4;
	static int speed(){
		return LEG_CONT*30;
	}
}

class Animal{
	String name;
	void setName(String name) {
		this.name = name;
	}
}

class Tiger extends Animal implements Predator{
	@Override
	public String getFood() {
		return "apple";
	}
}
class Lion extends Animal implements Predator{
	@Override
	public String getFood() {
		return "banana";
	}
}
class Crocodile extends Animal implements Predator{
	@Override
	public String getFood() {
		return "strawbarry";
	}
}
class Leopard extends Animal implements Predator{
	@Override
	public String getFood() {
		return "orange";
	}
}

class ZooKeeper{
	void feed (Predator predator) {
		System.out.println( predator.getFood() );
	}

}

public class Sample {

	public static void main(String[] args) {
		ZooKeeper zooKeeper = new ZooKeeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		Crocodile crocodile = new Crocodile();
		Leopard leopard = new Leopard();
		
		Predator[] pred = {tiger, lion, crocodile, leopard};
		for(Predator p : pred) {
			zooKeeper.feed(p);
		}
	}

}
