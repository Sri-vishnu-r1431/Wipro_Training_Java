package admin;

public class TestEmployee {
	public static void main(String[] args) {
		Person p=new Person();
		p.setName("Vishnu");
		System.out.println(p.getName());
		Employee e=new Employee();
		e.setAnnualSalary(1000000);
		e.setNationalInsuranceNumber("asdasdasd");
		e.setYear(2007);
		System.out.println(e);
	}
}
