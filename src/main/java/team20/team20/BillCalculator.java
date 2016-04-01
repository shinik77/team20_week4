
public class BillCalculator {
	private double expectedBill;
	private int minutesUsed;
	private Customer customerInfo;

	BillCalculator(){
		this.expectedBill = 0;
		this.customerInfo = new Customer("In-gyu");
		this.minutesUsed = customerInfo.getMinutesUsed();
	}

	public double calculateExpectedBill(){


		expectedBill = customerInfo.getPlanInfo().getBasicMontlyRate();
		if(customerInfo.getNumberOfLines() >1)
		{
			if(customerInfo.getNumberOfLines() >= 4)
			{
				expectedBill = expectedBill+(2*customerInfo.getPlanInfo().getRatePerAdditionalLine())+(customerInfo.getPlanInfo().getLineCostOver4()*((customerInfo.getNumberOfLines())-3));
			}else{
				expectedBill = expectedBill+((customerInfo.getNumberOfLines()-1)*customerInfo.getPlanInfo().getRatePerAdditionalLine());
			}
		}
		if(this.minutesUsed > customerInfo.getPlanInfo().getIncludedMinutes())
		{
			expectedBill += (customerInfo.getPlanInfo().getRatePerAdditionalMinutes()*(this.minutesUsed-customerInfo.getPlanInfo().getIncludedMinutes()));
		}

		return expectedBill;
	}
	public Customer getCustomerInfo(){
		return this.customerInfo;
	}
	public int getMinutesUsed(){
		return this.minutesUsed;
	}
}
