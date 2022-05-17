package admin;

import java.util.Scanner;

public class FlowControl5 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a character:");
		char ch=s.next().charAt(0);
		if(Character.isAlphabetic(ch)) {
			System.out.println("The entered is a Alphabet");
		}
		else if(Character.isDigit(ch)) {
			System.out.println("The entered character is a Digit");
		}
		else {
			System.out.println("The entered is a Special Character");
		}
		s.close();
	}
}
