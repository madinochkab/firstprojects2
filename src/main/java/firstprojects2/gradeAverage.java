/**
 *   File Name: gradeAverage.java<br>
 *
 *   Siebenthal, Madina<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Mar 26, 2016
 *
 */

package firstprojects2;

import java.util.*;

/**
 * gradeAverage //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Siebenthal, Madina
 * @version 1.0.0
 * @since 1.0
 *
 */
public class gradeAverage {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// declaring and initiolazing input variable
		String input = null;
		// declaring and initiolazing starting count from 0
		int count = 0;
		// declaring and initiolazing starting result from 0
		int result = 0;
		// can use true , contine and break, but cleaner to use bolean
		boolean toContinue = true;
		// can use true in ()
		while (toContinue) {
			System.out.println("enter any number");
			// entering first number
			input = scanner.nextLine();
			// converting string to float number
			float numValue = Integer.parseInt(input);
			// gathering result, sum of entered
			result += numValue;
			// asking user if he wants to keep entering numbers
			System.out.println("Would you like to enter another number (Y/Yes or N/No):");
			// gathering user input
			input = scanner.nextLine();
			count++;
			// if user says no, break from the loop
			if (input.equalsIgnoreCase("N") || input.equalsIgnoreCase("No")) {
				toContinue = false;
			}

			// System.out.println("do you have any more numbers to add?");
		}
		// counting average
		float avg = result / count;
		System.out.println("your averagae is " + avg);
	}

}
