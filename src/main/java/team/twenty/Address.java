package team.twenty;
public class Address {
	private String country;
	private String city;
	private String streetNo;

	public Address(String country, String city, String streetNo){
		this.country = country;
		this.city = city;
		this.streetNo = streetNo;
	}
	public String getCountry(){
		return this.country;
	}
	public String getCity(){
		return this.city;
	}
	public String getStreetNo(){
		return this.streetNo;
	}
}
