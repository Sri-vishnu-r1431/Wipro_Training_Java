package admin;

import java.util.Scanner;
import java.io.*;
public class IOStreams1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the File name:");
		String str=s.next();
		try {
			FileInputStream fi=new FileInputStream("D://"+str);
			System.out.println("Enter the Character to be counted:");
			char n=(s.next().trim().charAt(0));
			char copy=Character.toLowerCase(n);
			int i=0;
			int cnt=0;
			while((i=fi.read())!=-1) {
				if(Character.toLowerCase((char)i)==copy) {
					cnt++;
				}
			}
			System.out.println("File "+str+" has "+cnt+" instances of letter "+ n);
			fi.close();
				
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		 catch (IOException e) {
				
				e.printStackTrace();
			}
		s.close();
	}
}
