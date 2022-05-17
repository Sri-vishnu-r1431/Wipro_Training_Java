package admin;

import java.util.Scanner;

public class FlowControl12 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number");
		int a=s.nextInt();
		boolean flag=true;
		for(int i=2;i<=Math.sqrt(a);i++) {
			if(a%i==0) {
				flag=false;
				break;
			}
		}
		if(flag==true) {
			System.out.println("The given is Prime");
		}
		else {
			System.out.println("The given is not Prime");
		}
		s.close();
	}
}
