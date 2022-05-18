package admin;

public class Overriding1 {	
	public static void main(String[] args) {
		Orange orange=new Orange();
		orange.eat();
		Apple apple=new Apple();
		apple.eat();
	}
}
class Fruit{
	String taste,name,size;

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	public void eat()  {
		System.out.println("Name: "+name+" Taste: "+taste);
	}
}
class Apple extends Fruit{
	@Override
	public void eat() {
		System.out.println("Apple Taste");
	}
}
class Orange extends Fruit{
	@Override
	public void eat() {
		System.out.println("orange Taste");
	}
}
