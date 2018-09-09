package chapter2;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Chapter2Assignment {
	public static void main(String[] args) {
		
		
		// Create Scanner
		Scanner input = new Scanner(System.in);
			
		// Create input of Most recent per share
		System.out.print("Enter Most recent per share dividend: ");
		double MostRecentPerShareDividend = input.nextDouble();
		System.out.println(MostRecentPerShareDividend);
		// Create input discount rate
		System.out.print("Enter Required return or Disount rate:");
		double DiscountRate = input.nextDouble()/100;
		System.out.println(DiscountRate);
		// Create  input rate of growth
		System.out.print("Enter Rate of Growth:");
		double RateOfGrowth = input.nextDouble()/100;
		System.out.println(RateOfGrowth);
		DecimalFormat df = new DecimalFormat("###.##");
		double value = MostRecentPerShareDividend*(1 + RateOfGrowth)*(DiscountRate-RateOfGrowth)*100;
		//  export value of one share of common stock
		System.out.print("The value of one share of common stock is:" + "$"+ df.format(value));
	}

}
