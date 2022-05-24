package admin;

import java.util.HashSet;
import java.util.Iterator;

public class Set2 {
	public static void main(String[] args) {
		HashSet<String> h1=new HashSet<String>();
		h1.add("Vishwesh");
		h1.add("Suriya");
		h1.add("Karthick");
		Iterator<String> it=h1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
