package team20.team20;

public class BillCalculator {
	private double expectedBill=0;
	private int minutesUsed;
	private Customer customerInfo = new Customer("Ingyu");
	
	public double calculateExpectedBill(){

		expectedBill = customerInfo.getPlanInfo().getBasicMontlyRate();
		if(customerInfo.getNumberOfLines() >1)
		{
			if(customerInfo.getNumberOfLines() >= 4)
			{
				expectedBill = expectedBill+(2*customerInfo.getPlanInfo().getRatePerAdditionalLine())+(customerInfo.getPlanInfo().getLineCostOver4()*((customerInfo.getNumberOfLines())-3));
			}
			expectedBill = expectedBill+(2*customerInfo.getPlanInfo().getRatePerAdditionalLine());
		}
		if(customerInfo.getMinutesUsed() > customerInfo.getPlanInfo().getIncludedMinutes())
		{
			expectedBill += (customerInfo.getPlanInfo().getRatePerAdditionalMinutes()*(customerInfo.getMinutesUsed()-customerInfo.getPlanInfo().getIncludedMinutes()));
		}
		
		return expectedBill;
	}
	public Customer getCustomerInfo(){
		return customerInfo;
	}
	public int getMinutesUsed(){
		return minutesUsed;
	}
}