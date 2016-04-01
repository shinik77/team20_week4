package team20.team20;

public class Address {
	private String Country;
	private String City;
	private String StreetNo;

	public Address(String country, String city, String streetNo){
		Country = country;
		City = city;
		StreetNo = streetNo;
	}
	public String getCountry(){
		return Country;
	}
	public String getCity(){
		return City;
	}
	public String getStreetNo(){
		return StreetNo;
	}
}
