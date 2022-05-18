package admin;

import java.util.Scanner;

public class Strings5 {
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		System.out.println(str.substring(1,str.length()-1));
		s.close();
	}
}
