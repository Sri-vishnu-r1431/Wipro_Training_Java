package admin;

import java.util.Scanner;

public class Strings2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String[] s_arr=s.nextLine().split(",");
		String s1=s_arr[0];
		String s2=s_arr[1];
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		if(s1.substring(s1.length()-1).equals(s2.substring(0,1))) {
			s1+=s2.substring(1);
		}
		else {
			s1+=s2;
		}
		System.out.println("The output string is:"+s1);
		
		s.close();
	}
}
