package admin;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeDB {
	ArrayList<Employee> ar=new ArrayList<Employee>();
	boolean addEmployee(Employee e) {
		return ar.add(e);
	}
	boolean deleteEmployee(int empID) {
		boolean isDeleted=false;
		Iterator<Employee> it=ar.iterator();
		while(it.hasNext()) {
			if(it.next().empid==empID) {
				it.remove();
				isDeleted=true;
			}
		}
		return isDeleted;
	}
	String paySlip(int empID) {
		float payslip=0;
		String res="No such Record";
		for(Employee e:ar) {
			if(e.getEmpid()==empID) {
				payslip=e.getSalary();
				res="The Employee's Payslip is:"+payslip+"EmpID is:"+empID;
				break;
			}
		}
		
		 
		return res;
	}
	public static void main(String[] args) {
		Employee e=new Employee(101,"Vishnu","vishnu@gmail.com","Male",40000);
		Employee e1=new Employee(102,"Pranesh","Pranesh@gmail.com","Male",40000);
		Employee e2=new Employee(103,"Vicky","Vicky@gmail.com","Male",40000);
		EmployeeDB emp=new EmployeeDB();
		emp.addEmployee(e);
		emp.addEmployee(e2);
		emp.addEmployee(e1);
		System.out.println(emp.deleteEmployee(103));
		e1.getEmployeeDetails();
		System.out.println(emp.paySlip(101));
		
	}
}

