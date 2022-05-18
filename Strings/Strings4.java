package admin;

import java.util.Scanner;

public class Strings4 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		if((str.length()&1)==0) {
			System.out.println(str.substring(0,str.length()/2));
		}
		else {
			System.out.println("null");
		}
		s.close();
	}
}
