package team20.team20;

public class BillCalculator {
	private double expectedBill=0;
	private int minutesUsed;
<<<<<<< HEAD

	private Customer customerInfo;

	customerInfo = new Customer("Ingyu");
	public double calculateExpectedexpectedBill(){

		expectedBill = customerInfo.getPlanInfo().getBasicMonthlyRate();
		if(customerInfo.getNumberOfLines() >1)
		{
			if(customerInfo.getNumberOfLines >= 4)
			{
				expectedBill = expectedBill+(2*customerInfo.getPlanInfo().getRatePerAdditionalLine())+(customerInfo.getPlanInfo().getlineCostOver4*((customerInfo.getNumberOfLines)-3));
=======
	private Customer customerInfo = new Customer("Ingyu");
	
	public double calculateExpectedBill(){

		expectedBill = customerInfo.getPlanInfo().getBasicMontlyRate();
		if(customerInfo.getNumberOfLines() >1)
		{
			if(customerInfo.getNumberOfLines() >= 4)
			{
				expectedBill = expectedBill+(2*customerInfo.getPlanInfo().getRatePerAdditionalLine())+(customerInfo.getPlanInfo().getLineCostOver4()*((customerInfo.getNumberOfLines())-3));
>>>>>>> 2d37213b57742714dcad97ed0bb46ba963e4b828
			}
			expectedBill = expectedBill+(2*customerInfo.getPlanInfo().getRatePerAdditionalLine());
		}
		if(customerInfo.getMinutesUsed() > customerInfo.getPlanInfo().getIncludedMinutes())
		{
<<<<<<< HEAD
			expectedBill += (customerInfo.getPlanInfo().getRatePerAdditionalMinutes()*(customerInfo.getMinutesUsed()-customerInfo.getPlanInfo().getIncludedMinutes());
=======
			expectedBill += (customerInfo.getPlanInfo().getRatePerAdditionalMinutes()*(customerInfo.getMinutesUsed()-customerInfo.getPlanInfo().getIncludedMinutes()));
>>>>>>> 2d37213b57742714dcad97ed0bb46ba963e4b828
		}
		
		return expectedBill;
	}
	public Customer getCustomerInfo(){
		return customerInfo;
	}
	public int getMinutesUsed(){
		return minutesUsed;
	}
<<<<<<< HEAD
}
=======
}
>>>>>>> 2d37213b57742714dcad97ed0bb46ba963e4b828
