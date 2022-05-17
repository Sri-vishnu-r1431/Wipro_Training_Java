package admin;

import java.util.Scanner;

public class Arrays3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Size of the arrays:");
		int size=s.nextInt();
		int [] arr=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println("Enter the value to be searched:");
		int key=s.nextInt();
		int idx=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) { idx=i; break;}
		}
		System.out.println(idx);
		s.close();
	}
}
