package Ch3Assignment;

import java.util.Scanner;

public class Ch3Num5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter starting velocity in meters/seconds");
		double v0 = input.nextDouble();
		System.out.println("Enter ending velocity in meters/seconds");
		double v1 = input.nextDouble();
		System.out.println("Enter the time taken in seconds");
		double t = input.nextDouble();
		double average_acc = (v1-v0)/t;
		System.out.println(" The average acceleration is " +average_acc);
		
		
		
		
	}

}
