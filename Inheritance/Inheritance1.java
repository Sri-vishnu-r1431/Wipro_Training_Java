package admin;

public class Inheritance1 {
	public static void main(String[] args) {
		Animal an=new Animal();
		an.eat();
		an.sleep();
		Bird bird=new Bird();
		bird.eat();
		bird.fly();
		bird.sleep();
	}
}
class Animal{
	void eat() {
		System.out.println("Animal's eating");
	}
	void sleep() {
		System.out.println("Animal's sleeping");
	}
}
class Bird extends Animal{
	@Override
	void eat() {
		
		System.out.println("Bird's eating");
		
	}
	@Override
	void sleep() {
		
		System.out.println("Bird's sleeping");
	}
	void fly() {
		System.out.println("Bird's flying");
	}
}
