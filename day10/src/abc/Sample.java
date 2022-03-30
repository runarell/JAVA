//package abc;
//
//interface Barkable{
//	void bark();
//}
//
//abstract Predator extends Animal{
//	abstract String getFood();
//}
//
//class Animal{
//	String name;
//	void setName(String name) {
//		this.name = name;
//	}
//}
//
//class Tiger extends Animal implements Barkable{
//
//	@Override
//	public void bark() {
//		System.out.println("어흥");
//	}
//}
//class Lion extends Animal implements Barkable{
//
//	@Override
//	public void bark() {
//		System.out.println("으르렁");
//	}
//}
//class Crocodile extends Animal implements Predator{
//	@Override
//	public String getFood() {
//		return "strawbarry";
//	}
//}
//class Leopard extends Animal implements Predator{
//	@Override
//	public String getFood() {
//		return "orange";
//	}
//}
//
//class ZooKeeper{
//	void feed (Predator predator) {
//		System.out.println( predator.getFood() );
//	}
//
//}
//
//class Bouncer{
//	void barkAnimal(Barkable animal) {
//		animal.bark();
//	}
//}
//
//
//
//public class Sample {
//
//	public static void main(String[] args) {
//		ZooKeeper zooKeeper = new ZooKeeper();
//		Tiger tiger = new Tiger();
//		Lion lion = new Lion();
//		Bouncer bouncer = new Bouncer();
//		bouncer.barkAnimal(tiger);
//		bouncer.barkAnimal(lion);
//		
//
//	}
//
//}
//
