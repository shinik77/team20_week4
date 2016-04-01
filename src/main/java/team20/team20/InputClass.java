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
