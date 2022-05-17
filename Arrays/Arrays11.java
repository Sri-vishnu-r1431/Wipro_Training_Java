package admin;

import java.util.Scanner;

public class Arrays11 {
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of the array:");
		int [] arr=new int[s.nextInt()];
		boolean flag=true;
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
			if(arr[i]!=4 && arr[i]!=1) flag=false;
		}
		if(!flag) System.out.println("False");
		else System.out.println("True");
		s.close();
	}
}
