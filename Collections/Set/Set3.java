package admin;


import java.util.Iterator;
import java.util.TreeSet;

public class Set3 {

	public static void main(String[] args) {
	TreeSet<String> h1=new TreeSet<>();
	h1.add("Bob");
	h1.add("Nick");
	h1.add("John");
	h1.add("Ricky");
	h1.add("Richard");
	
	
	Iterator<String>it=h1.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	boolean res=false;
	String query="Rick";
	while (it.hasNext()) {
		if (it.next().equals(query)) {
			res = true;
			break;
		}
	}
	if (res) System.out.println(query + " exists");
	else System.out.println(query + " doesn't exist");
	Iterator<String> it1=h1.descendingIterator();
	while(it1.hasNext()) {
		System.out.println(it1.next());
	}

	}

}
