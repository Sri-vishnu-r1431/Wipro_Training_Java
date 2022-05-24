package admin;

import java.util.Vector;

public class ArrayList6 {

	public static void main(String[] args) {
		Vector<String> arr = new Vector<String>();
		arr.add("January");
		arr.add("February");
		arr.add("March");
		arr.add("April");
		arr.add("May");
		arr.add("June");
		arr.add("July");
		arr.add("August");
		arr.add("September");
		arr.add("October");
		arr.add("November");
		arr.add("December");
		for (String i : arr) {
			System.out.println(i);
		}


	}

}
