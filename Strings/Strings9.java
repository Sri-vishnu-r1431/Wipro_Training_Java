package admin;

import java.util.Scanner;

public class Strings9 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String s1=s.next();
		String s2=s.next();
		String fin="";
		for(int i=0;i<Math.min(s1.length(), s2.length());i++) {
			fin+=(s1.substring(i,i+1)+s2.substring(i,i+1));
		}
		if(fin.length()<s1.length()) {
			for(int i=fin.length();i<s1.length();i++) {
				fin+=s1.substring(i,i+1);
			}
		}
		if(fin.length()<s2.length()) {
			for(int i=fin.length();i<s2.length();i++) {
				fin+=s2.substring(i,i+1);
			}
		}
		System.out.println(fin);
		s.close();
	}
}
