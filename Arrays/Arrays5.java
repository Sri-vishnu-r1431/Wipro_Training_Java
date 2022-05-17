package admin;

import java.util.Scanner;

public class Arrays5 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=s.nextInt();
		int [] arr=new int[size];
		System.out.println("Enter the elements of the array:");
		int Min_val=Integer.MAX_VALUE,Max_val=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
			if(arr[i]>Max_val) Max_val=arr[i];
			if(arr[i]<Min_val) Min_val=arr[i];
		}
		int curr=Integer.MIN_VALUE,curr_min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<Max_val && arr[i]>curr) {
				curr=arr[i];
			}
			if(arr[i]>Min_val && arr[i]<curr_min) {
				curr_min=arr[i];
			}
		}
		System.out.println("The Maximum values are:"+Max_val+ " "+curr);
		System.out.println("The Minimum values are:"+Min_val+ " "+curr_min);
		s.close();
	}
}
