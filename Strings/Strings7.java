package admin;

import java.util.Scanner;

public class Strings7 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		if(str.charAt(0)=='x' && str.charAt(str.length()-1)=='x') {
			System.out.println(str.substring(1,str.length()-1));
		}
		else {
			System.out.println(str);
		}
		s.close();
	}
}	
