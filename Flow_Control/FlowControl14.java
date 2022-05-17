package admin;

import java.util.Scanner;

public class FlowControl14 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int a=s.nextInt();
		int sum=0;
		while(a>0) {
			sum+=(a%10);
			a=a/10;
		}
		System.out.println(sum);
		s.close();
	}
}
