package admin;

import java.util.Scanner;

public class FlowControl8 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a character for color code:");
		char ch=s.next().charAt(0);
		switch(ch) {
		case 'R':System.out.println("Red");
		break;
		case 'B':System.out.println("Blue");
		break;
		case 'G':System.out.println("Green");
		break;
		case 'Y':System.out.println("Yellow");
		break;
		case 'O':System.out.println("Orange");
		break;
		case 'W':System.out.println("White");
		break;
		default:System.out.println("Invalid Code");
		break;
		}
		s.close();
	}
}
