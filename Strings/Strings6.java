package admin;

import java.util.Scanner;

public class Strings6 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		String str1=s.next();
		if(str.length()<str1.length()) {
		System.out.println(str+str1+str);
		}
		else {
			System.out.println(str1+str+str1);
		}
		s.close();
	}
}
