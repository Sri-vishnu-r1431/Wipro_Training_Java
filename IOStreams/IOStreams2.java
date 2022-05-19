package admin;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class IOStreams2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the input file:");
		String input=s.next();
		System.out.println("Enter the Output File:");
		String output=s.next();
		try {
		FileInputStream fi=new FileInputStream("D://"+input);
		FileOutputStream fo=new FileOutputStream("D://"+output);
		int i=0;
		while((i=fi.read())!=-1) {
			fo.write(i);
		}
		System.out.println("File is copied.");
		fi.close();
		fo.close();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		s.close();
	}
}
