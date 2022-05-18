package admin;

import java.util.Scanner;

public class Strings8 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		int i=1;
		String fin="";
		if(str.charAt(0)!='*' && str.charAt(1)!='*') {
			fin+=str.substring(0,1);
		}
		
		while(i<str.length()-1) {
			if(str.charAt(i+1)!='*' && str.charAt(i-1)!='*' && str.charAt(i)!='*') {
				fin+=str.substring(i,i+1);
			}
			++i;
		}
		if(str.charAt(str.length()-2)!='*'&& str.charAt(str.length()-1)!='*') {
			fin+=str.substring(str.length()-1);
		}
		System.out.println(fin);
		s.close();
		
	}
}
