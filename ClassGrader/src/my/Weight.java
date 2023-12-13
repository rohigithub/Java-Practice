/*
 * Part 2: Weight Guru Challenge

    Create a Java program that tells whether your body to weight ratio is good or could be better.
    The java app should take in your weight and height from the console and calculate your body to weight ratio.
    You can use this article as a standardized guide for how to apply the logic.

 */

package my;
import java.util.*;

public class Weight {
	

	static String calculateBMI(double bmi) {
		
		if(bmi < 18.5) {
			return "Underweight";
		}
		else if(bmi < 25) {
			return "Good Normal";
		}
		else if(bmi < 30) {
			return "Bad Overweight";
		}
		else {
			return "Obese";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);

		System.out.println("Input Weight in kg: ");
		double weight=sc.nextDouble();
		
		System.out.println("Input Height in meters: ");
		double height=sc.nextDouble();
		
		double bmi = weight /(height * height);

		System.out.println("Body Mass Index (BMI):"+Math.ceil(bmi)+calculateBMI(bmi));
		

	}

}
