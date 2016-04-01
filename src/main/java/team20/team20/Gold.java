package team20.team20

public class Gold extends Plan{

	private double RatePerAdditionalLine;
	private double RatePerAdditionalMinutes;
	private double includeMinutes;
	private double basicMontlyRate;


	public Gold(){
		RatePerAdditionalLine=14.50;
		RatePerAdditionalMinutes=0.45;
		includeMinutes=1000;
		basicMontlyRate=49.95;
	}

	protected double getBasicMontlyRate(){
		return basicMontlyRate;
	}

	protected double getIncludedMinutes(){
		return includeMinutes;
	}

	protected double getRatePerAdditionalMinutes(){
		return RatePerAdditionalMinutes;
	}

	protected double getRatePerAdditionalLine(){
		return RatePerAdditionalLine;
	}

}
