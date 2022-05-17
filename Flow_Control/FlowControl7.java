package admin;

import java.util.Scanner;

public class FlowControl7 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a character:");
		char ch=s.next().charAt(0);
		if(Character.isUpperCase(ch)) {
			System.out.println(ch+"->"+Character.toLowerCase(ch));
		}
		else if(Character.isLowerCase(ch)) {
			System.out.println(ch+"->"+Character.toUpperCase(ch));
		}
		s.close();
	}
}
