
import java.util.*;

public class InputClass {
	private Scanner scan;
	private String planType;
	private int numberOfLines;
	private int usedAmount;

	public InputClass(){
		scan=new Scanner(System.in);

		System.out.println("Input Plan Type : ");
		planType = scan.nextLine();

		System.out.println("Input Used Amount :");
		usedAmount = scan.nextInt();

		System.out.println("Input Number Of Lines :");
		numberOfLines = scan.nextInt();
	}

	public String getPlanType(){
		return this.planType;
	}

	public int getUsedAmount(){
		return usedAmount;
	}

	public int getNumberOfLines(){
		return numberOfLines;
	}
}
