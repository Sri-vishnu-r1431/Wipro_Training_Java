package admin;

public class Set1 {
	public static void main(String[] args) {
		Country country=new Country();
		country.addCountryName("INDIA");
		country.addCountryName("USA");
		country.addCountryName("UK");
		country.addCountryName("RUSSIA");
		System.out.println("INDIA: " + country.getCountry("INDIA"));
		System.out.println("GERMANY:"+country.getCountry("GERMANY"));
	}
}
