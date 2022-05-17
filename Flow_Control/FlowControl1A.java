package admin;

import java.util.Scanner;

public class FlowControl1A {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=s.nextInt();
		if(a==0) {
			System.out.println("The given Number is Zero");
		}
		else if(a<0) {
			System.out.println("The given Number is Negative");
		}
		else {
			System.out.println("The given Number is Positive");
		}
		s.close();
	}
}
