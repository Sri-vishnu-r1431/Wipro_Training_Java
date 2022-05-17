package admin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Arrays9 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Array Size:");
		int size=s.nextInt();
		int [] arr=new int[size];
		System.out.println("Enter array Elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		ArrayList<Integer> arr1=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=10) {
				arr1.add(arr[i]);
			}
		}
		for(int i=arr1.size();i<arr.length;i++) {
			arr1.add(0);
		}
		System.out.println(Arrays.toString(arr1.toArray()));
		s.close();
	}
}
