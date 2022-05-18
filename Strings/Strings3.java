package admin;

import java.util.Scanner;

public class Strings3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		String res="";
		for(int i=0;i<str.length();i++) {
			res+=str.substring(0,2);
		}
		System.out.println(res);
		s.close();
	}
}
