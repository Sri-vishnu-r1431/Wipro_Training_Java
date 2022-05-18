package admin;

public class ClassesAndObejcts2 {
	public static void main(String[] args) {
		System.out.println(Calculator.powerDouble(10, 5));
		System.out.println(Calculator.powerInt(5,9));
	}
}
class Calculator{
	static int powerInt(int num1,int num2) {
		return (int) Math.pow(num1, num2);
	}
	static double powerDouble(double num1,int num2) {
	return Math.pow(num1,num2);
	}
}
