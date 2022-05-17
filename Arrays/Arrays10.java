package admin;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays10 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int [] arr=new int[s.nextInt()];
		int [] arr1=new int[arr.length];
		int k=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
			if((arr[i] & 1)==0) {
				arr1[k++]=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++) {
			if((arr[i] & 1)==1) {
				arr1[k++]=arr[i];
			}
		}
		System.out.println(Arrays.toString(arr1));
		s.close();
	}
}	
