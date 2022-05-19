package admin;

public class Project1 {
	public static void main(String[] args) {
		int[] empNo = { 1001, 1002, 1003, 1004, 1005, 1006, 1007 };
		String[] empName = { "Ashish", " Sushma", "Rahul", "Chatat", "Ranjan", "Suman", "Tanmay" };
		@SuppressWarnings("unused")
		String[] JoinDate = { "01/04/2009", "23/08/2012", "12/11/2008", "29/01/2013", "16/07/2005", "1/1/2000",
				"12/06/2006" };
		char[] DesignationCode = { 'e', 'c', 'k', 'r', 'm', 'e', 'c' };
		String[] Department = { "R & D", "PM ", "Acct", "Front Desk", "Engg", "Manufacturing", "PM" };
		int[] Basic = { 20000, 30000, 10000, 12000, 50000, 23000, 29000 };
		int[] HRA = { 8000, 12000, 8000, 6000, 20000, 9000, 12000 };
		int[] IT = { 3000, 9000, 1000, 2000, 20000, 4400, 10000 };
		if(args.length==0) {
			System.out.println("Enter a Employee Id");
		}
		else {
		int val = Integer.parseInt(args[0]);
		if (!(val <= 1009 && val >= 1001)) {
			System.out.println("There is no employee with empid: " + val);
		} else {
			String Designation="";
			val = val % 1000;
			val-=1;
			int DA = 0;
			switch (DesignationCode[val]) {
			case 'e':Designation="Engineer";
				DA = 20000;
				break;
			case 'c':Designation="Consultant";
				DA = 32000;
				break;
			case 'k':Designation="Clerk";
				DA = 12000;
				break;
			case 'r':Designation="Receptionist";
				DA = 15000;
				break;
			case 'm':Designation="Manager";
				DA = 40000;
				break;
			}
			int Salary = Basic[val] + HRA[val] - IT[val] + DA;
			String result = "Emp No.\t\t\tEmp Name\t\tDepartment\t\tDesignation\t\t\tSalary";
			String result1 = empNo[val] + "\t\t\t" +empName[val]+"\t\t\t"+ Department[val] + "\t\t" + Designation + "\t\t\t"
					+ Salary;
			System.out.println(result+"\n"+result1);
		}
		}
	}
}
