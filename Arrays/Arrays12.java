package admin;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays12 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int []arr=new int[3];
		int []arr1=new int[3];
		int [] arr2=new int[2];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=s.nextInt();
		}
		arr2[0]=arr[1];
		arr2[1]=arr1[1];
		System.out.println(Arrays.toString(arr2));
		s.close();
	}
}

