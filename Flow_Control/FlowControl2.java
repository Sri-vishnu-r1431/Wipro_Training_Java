package admin;

import java.util.Scanner;

public class FlowControl2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number");
		int a=s.nextInt();
		if((a & 1)==1) System.out.println("The given Number is Odd");
		else System.out.println("The Given Number is Even");
		s.close();
	}
}
