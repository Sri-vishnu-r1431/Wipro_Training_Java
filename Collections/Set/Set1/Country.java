package admin;

import java.util.HashSet;
import java.util.Iterator;

public class Country {
	HashSet<String> h1=new HashSet<String>();
	public HashSet<String> addCountryName(String CountryName){
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
