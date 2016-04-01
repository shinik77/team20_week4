package team20.team20;

public class BillCalculator {
	private double expectedBill=0;
	private int minutesUsed;
	private double bill=0;
	private Customer customerInfo;

	customerInfo = new Customer("Ingyu");
	public double calculateExpectedBill(){

		bill = customerInfo.getPlanInfo().getBasicMonthlyRate();
		if(customerInfo.getNumberOfLines() >1)
		{
			if(customerInfo.getNumberOfLines >= 4)
			{
				bill = bill+(2*customerInfo.getPlanInfo().getRatePerAdditionalLine())+(customerInfo.getPlanInfo().getlineCostOver4*((customerInfo.getNumberOfLines)-3));
			}
			bill = bill+(2*customerInfo.getPlanInfo().getRatePerAdditionalLine());
		}
		if(customerInfo.getMinutesUsed() > customerInfo.getPlanInfo().getIncludedMinutes())
		{
			bill += (customerInfo.getPlanInfo().getRatePerAdditionalMinutes()*(customerInfo.getMinutesUsed()-customerInfo.getPlanInfo().getIncludedMinutes());
		}
		
		return bill;
	}
	public Customer getCustomerInfo(){
		return customerInfo;
	}
	public int getMinutesUsed(){
		return minutesUsed;
	}
}
