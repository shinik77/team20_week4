
public class BillView {

	BillCalculator billCalculated;

	private double expectedBill;
	private Customer customerInfo;
	private int minutesUsed;


	public BillView(){
		this.billCalculated = new BillCalculator();
		this.expectedBill = billCalculated.calculateExpectedBill();
		this.customerInfo = billCalculated.getCustomerInfo();
		this.minutesUsed = billCalculated.getMinutesUsed();
	}

	public void printAll(){
		System.out.print("\nCustomerInfo : \nName : "+this.customerInfo.getCustomerName()+
		"\nCountry : "+this.customerInfo.getAddressInfo().getCountry()+
		"\nCity : "+this.customerInfo.getAddressInfo().getCity()+
		"\nStreet no : "+this.customerInfo.getAddressInfo().getStreetNo()+
		"\n\nMinutes used : "+this.minutesUsed+"\nExpected Total Bill : ");
		System.out.printf("%5.2f\n", this.expectedBill);
	}
}
