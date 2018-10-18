package Ch3Assignment;

import java.util.Scanner;

public class Ch3Num4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter in how many pounds");
		double pounds = input.nextDouble();
		double kilograms = pounds*0.454;
		System.out.println(" This is how many kilograms " +kilograms);
		
		

	}

}
