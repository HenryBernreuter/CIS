package chapter2;
import java.util.Scanner;

public class Chapter2Assignment {
	public static void main(String[] args) {
		
		
		// Create Scanner
		Scanner input = new Scanner(System.in);
			
		// Create input of Most recent per share
		System.out.print("Enter Most recent per share dividend: ");
		float MostRecentPerShareDividend = input.nextFloat();
		System.out.println(MostRecentPerShareDividend);
		// Create input discount rate
		System.out.print("Enter Required return or Disount rate:");
		float DiscountRate = input.nextFloat()/100;
		System.out.println(DiscountRate);
		// Create  input rate of growth
		System.out.print("Enter Rate of Growth:");
		float RateOfGrowth = input.nextFloat()/100;
		System.out.println(RateOfGrowth);
		
		//  export value of one share of common stock
		System.out.print("The value of one share of common stock is:" +
				MostRecentPerShareDividend*(1 + RateOfGrowth)*(DiscountRate-RateOfGrowth));
	}

}
