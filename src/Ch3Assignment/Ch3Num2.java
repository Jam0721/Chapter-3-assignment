package Ch3Assignment;

import java.util.Scanner;

public class Ch3Num2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the radius of your cylinder");
		double radius = input.nextDouble();
		System.out.println("What is the length of your cylinder");
		double length = input.nextDouble();
		double area = radius*radius*3.14;
		double volume = area*length;
		System.out.println(" This is the area of your cylinder " +area);
		System.out.println(" This is the volume of your cylinder " +volume); 
		
		
		
		
	}

}
