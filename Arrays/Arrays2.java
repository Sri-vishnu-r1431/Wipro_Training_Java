package admin;

import java.util.Scanner;

public class Arrays2 {
	public static void main(String []args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Size of the array:");
		int size=s.nextInt();
		int [] arr=new int[size];
		System.out.println("Enter the elements of the Array");
		int min_val=Integer.MAX_VALUE,max_val=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
			if(min_val>arr[i]) min_val=arr[i];
			if(max_val<arr[i]) max_val=arr[i];
		}
		System.out.println("The maximum value of the given values:"+max_val);
		System.out.println("The minimum value of the given values:"+min_val);
		
		s.close();
	}
}	
