package admin;

import java.util.Scanner;

public class Arrays8 {
 public static void main(String[] args) {
	 Scanner  s=new Scanner(System.in);
	 System.out.println("Enter the size of the array:");
	 int size=s.nextInt();
	 int[] arr=new int[size];
	 System.out.println("Enter the array Elements:");
	 int sum=0,sum1=0;
	 for(int i=0;i<arr.length;i++) {
		 arr[i]=s.nextInt();
		 sum+=arr[i];
	 }
	 boolean flag=false;
	 for(int i=0;i<arr.length;i++) {
		 if(arr[i]==6) {
			flag=true;
		 }
		 if(flag) sum1+=arr[i];
		 if(arr[i]==7) {
			 flag=false;
		 }
		 
	 }
	 if(flag) sum1=0;
	 System.out.println(sum1>0?sum-sum1:sum);
	 s.close();
 }
}
