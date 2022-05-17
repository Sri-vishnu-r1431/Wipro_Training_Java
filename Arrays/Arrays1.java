package admin;

import java.util.Scanner;

public class Arrays1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=s.nextInt();
		int [] arr=new int[size];
		int sum=0;
		System.out.println("Enter the array Elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
			sum+=arr[i];
		}
		System.out.println("The sum of the array is:"+sum);
		System.out.println("The average of the array is:"+sum/arr.length);
		s.close();
	}
}
