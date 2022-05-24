package admin;


import java.util.Iterator;
import java.util.TreeSet;

public class Country {
	TreeSet<String> h1=new TreeSet<String>();
	public TreeSet<String> addCountryName(String CountryName){
		h1.add(CountryName);
		return h1;
	}
	public String getCountry(String CountryName) {
		Iterator<String> it=h1.iterator();
		while(it.hasNext()) {
			if(it.next().equals(CountryName)) {
				return CountryName;
			}
		}
		return null;
	}
}
