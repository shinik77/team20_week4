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

package team20.team20;
import java.util.*;

public class InputClass {
	   private Scanner scan;
	   private String planType;
	   private int numberOfLines;
	   private int usedAmount;

	   public InputClass(){
	      scan=new Scanner(System.in);

	      
	      planType=scan.nextLine();
	      usedAmount=scan.nextInt();
	      numberOfLines=scan.nextInt();
	   }

	   public String getPlanType(){
	      return planType;
	   }

	   public int getUsedAmount(){
	      return usedAmount;
	   }

	   public int getNumberOfLines(){
	      return numberOfLines;
	   }
}

