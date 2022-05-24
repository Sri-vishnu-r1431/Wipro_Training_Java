package admin;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList3 {
	public static void printAll(ArrayList<String> arr) {
		Iterator<String> it=arr.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	public static void main(String[] args) {
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("College");
		arr.add("School");
		arr.add("Tree");
		arr.add("Sound");
		printAll(arr);
	}
}
