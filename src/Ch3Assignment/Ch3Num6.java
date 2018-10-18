package Ch3Assignment;

import java.util.Scanner;

public class Ch3Num6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Ammount of water in kilograms");
		double water = input.nextDouble();
		System.out.println("Initial tempature");
		double it = input.nextDouble();
		System.out.println("Final tempature");
		double ft = input.nextDouble();
		double energy = water*(ft-it)*4184;
		System.out.println(" The energy is " +energy);
		

	}

}
