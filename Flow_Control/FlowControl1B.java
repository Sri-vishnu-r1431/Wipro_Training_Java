package admin;

import java.util.Scanner;

public class FlowControl1B {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the First Number:");
		int a=s.nextInt();
		System.out.println("Enter the second Number:");
		int b=s.nextInt();
		if(a%10==b%10) System.out.println("true");
		else System.out.println("false");
		s.close();
	}
}
