package admin;

public class Overriding2 {
	public static void main(String[] args) {
		Triangle tr=new Triangle();
		Circle ci=new Circle();
		Square sq=new Square();
		ci.draw();
		ci.erase();
		sq.draw();
		sq.erase();
		tr.draw();
		tr.erase();
	}
}
class Shape{
	void draw() {
		System.out.println("Drawing shape");
	}
	void erase() {
		System.out.println("Erasing shape");
	}
}
class Triangle extends Shape{
	void draw() {
		System.out.println("Drawing triangle");
	}
	void erase() {
		System.out.println("Erasing Triangle");
	}
}
class Square extends Shape{
	void draw() {
		System.out.println("Drawing Square");
	}
	void erase() {
		System.out.println("Erasing square");
	}
}
class Circle extends Shape{
	void draw() {
		System.out.println("Drawing Circle");
	}
	void erase() {
		System.out.println("Erasing Circle");
	}
}