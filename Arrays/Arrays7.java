package admin;

import java.util.Arrays;
import java.util.HashSet;

public class Arrays7 {
	public static void main(String[] args) {
		int [] arr= {12,34,12,45,67,89};
HashSet<Integer> s1=new HashSet<Integer>();
for(int i=0;i<arr.length;i++) {
	s1.add(arr[i]);
}
System.out.println(Arrays.toString(s1.toArray()));	
	}
}
