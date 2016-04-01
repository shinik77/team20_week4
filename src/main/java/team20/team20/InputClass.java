package team20.team20

import java.util.*;

public class InputClass(){

	private Scanner scan;
	private String planType;
	private double numberOfLines;
	private double usedAmount;

	public InputClass(){

		scan=new Scanner();

		
		planType=scan.nextLine();
		usedAmount=scan.nextDouble();
		numberOfLines=scan.nextDouble();
	}

	public String getPlanType(){
		return planType;
	}

	public double getUsedAmount(){
		return usedAmount;
	}

	public double getNumberOfLines(){
		return numberOfLines;
	}
}

