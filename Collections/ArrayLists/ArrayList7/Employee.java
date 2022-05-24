package admin;

public class Employee {
	int empid;
	String empName;
	String email;
	String gender;
	float salary;
	public int getEmpid() {
		return empid;
	}
	public float getSalary() {
		return salary;
	}
	Employee(int empid,String empName,String email,String gender,float salary){
		this.empid=empid;
		this.empName=empName;
		this.email=email;
		this.gender=gender;
		this.salary=salary;
		
	}
	void getEmployeeDetails() {
		System.out.println("Employee Id:"+empid+"Employee Name:"+empName+
				"Email:"+email+"Gender:"+gender+"Salary:"+salary);
	}
}
