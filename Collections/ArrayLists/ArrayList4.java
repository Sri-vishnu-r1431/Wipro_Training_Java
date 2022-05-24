package admin;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList4 {
	public static void main(String[] args) {
		ArrayList<Number> arr=new ArrayList<Number>();
		arr.add(10);
		arr.add(0.05F);
		arr.add(3.1451232D);
		arr.add(12321);
		Iterator<Number> it=arr.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
