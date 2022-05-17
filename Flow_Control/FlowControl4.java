package admin;

import java.util.Scanner;

public class FlowControl4 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Charcter:");
		char c=s.next().charAt(0);
		System.out.println("Enter the Second Character");
		char d=s.next().charAt(0);
		if(d<c) System.out.println(d+","+c);
		else System.out.println(c+","+d);
		s.close();
	}
}
