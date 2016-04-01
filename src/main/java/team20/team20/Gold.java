package team20.team20

public class Gold extends Plan{

	public Gold(){
		double RatePerAdditionalLine=14.50;
		double RatePerAdditionalMinutes=0.45;
		double includeMinutes=1000;
		double basicMontlyRate=49.95;
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
