package team20.team20

public class BillView(){

	BillCalculateExpectedBill billCalculated = new BillCalculateExpectedBill();
	

	public BillView(){
	
		private double expectedBill=billCalculated.calculateExpectedBill();
		private Customer customerInfo=billCalculated.getCustomerInfo();
		private int minutesUsed=billCalculated.getMinutesUsed();

	}

	protected void printAll(){
		
		System.out.println("CustomerInfo : "+customerInfo+"\nminutesUsed : "+minutesUsed+"\nExpectedBill : "+expectedBill);
	}
}


