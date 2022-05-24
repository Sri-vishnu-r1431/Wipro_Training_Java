package admin;

import java.util.Iterator;
import java.util.Vector;

public class ArrayList7 {
	public static void main(String[] args) {
		Vector<Employee>ar=new Vector<Employee>();
		ar.add(new Employee(101,"Vishnu","vishnu@gmail.com","Male",40000));
		ar.add(new Employee(102,"Pranesh","Pranesh@gmail.com","Male",40000));
		ar.add(new Employee(103,"Vicky","Vicky@gmail.com","Male",40000));
		Iterator<Employee> it=ar.iterator();
		while(it.hasNext()) {
			it.next().getEmployeeDetails();
		}
	}
}
