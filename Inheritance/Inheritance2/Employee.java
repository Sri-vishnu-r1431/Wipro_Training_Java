package admin;

public class Employee extends Person {
	double annualSalary;
	int year;
	String nationalInsuranceNumber;
	public double getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getNationalInsuranceNumber() {
		return nationalInsuranceNumber;
	}
	public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
		this.nationalInsuranceNumber = nationalInsuranceNumber;
	}
	@Override
	public String toString() {
		return " Year: "+year+" National Insurance number: "+nationalInsuranceNumber
				+" Annual Salary: "+annualSalary;
	}
	
}
