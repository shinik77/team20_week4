package team20.team20;
public class BillCalculator {
	private double expectedBill;
	private int minutesUsed;
	private Customer customerInfo;
	private Plan customerPlan;
	private int numberOfLines;

	BillCalculator(){
		this.expectedBill = 0;
		this.customerInfo = new Customer("In-gyu");
		this.customerPlan = this.customerInfo.getPlanInfo();
		this.minutesUsed = customerInfo.getMinutesUsed();
		this.numberOfLines = customerInfo.getNumberOfLines();
	}

	public double calculateExpectedBill(){


		expectedBill = this.customerPlan.getBasicMontlyRate();
		if(this.numberOfLines >1)
		{
			if(this.numberOfLines >= 4)
			{
				expectedBill = expectedBill+(2*this.customerPlan.getRatePerAdditionalLine())+(this.customerPlan.lineCostOver4*((this.numberOfLines)-3));
			}else{
				expectedBill = expectedBill+((this.numberOfLines-1)*this.customerPlan.getRatePerAdditionalLine());
			}
		}
		if(this.minutesUsed > this.customerPlan.getIncludedMinutes())
		{
			expectedBill += (this.customerPlan.getRatePerAdditionalMinutes()*(this.minutesUsed-this.customerPlan.getIncludedMinutes()));
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
