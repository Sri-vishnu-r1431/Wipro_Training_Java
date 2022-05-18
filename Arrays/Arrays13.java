package admin;


import java.util.Scanner;

public class Arrays13 {
	public static void main(String [] args) {
		
		if(args.length==0) {System.out.println("Please enter 4 integers");}
		else {
		int [][]arr=new int[2][2];
		int k=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=Integer.parseInt(args[k++]);
			}
		}
		System.out.println("The Given array is:");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("The reverse of the array is:");
		for(int i=arr.length-1;i>=0;i--) {
			for(int j=arr.length-1;j>=0;j--) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		s.close();
		}
	}
}
