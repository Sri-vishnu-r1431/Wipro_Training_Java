package admin;

public class FlowControl6 {
	public static void main(String[] args) {
		if (args.length <= 1) {
			System.out.println("Enter details");
		} else {
			String gender = args[0];
			int age = Integer.parseInt(args[1]);
			if (gender.equalsIgnoreCase("female") && age <= 58 && age >= 1) {
				System.out.println("The percentage of interest is 8.2%");
			} else if (gender.equalsIgnoreCase("female")) {
				System.out.println("The percentage of interest is 9.2%");
			} else if (gender.equalsIgnoreCase("male") && age <= 58 && age >= 1) {
				System.out.println("The percentage of interest is 8.4%");
			} else if (gender.equalsIgnoreCase("male")) {
				System.out.println("The percentage of interest is 10.5%");
			}
		}
	}
}
