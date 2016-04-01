package team20.team20;

public class BillView {
	BillCalculator billCalculated = new BillCalculator();
	   
	private double expectedBill;
	private Customer customerInfo;
	private int minutesUsed;
	   
	   
	public BillView(){
	   
		expectedBill=billCalculated.calculateExpectedBill();
		customerInfo=billCalculated.getCustomerInfo();
		minutesUsed=billCalculated.getMinutesUsed();
	}

	protected void printAll(){
	      System.out.println("CustomerInfo : "+customerInfo+"\nminutesUsed : "+minutesUsed+"\nExpectedBill : "+expectedBill);
	}
}
