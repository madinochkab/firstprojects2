/**
 *   File Name: grade.java<br>
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
 * grade //ADDD (description of class)
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
public class grade {
	public static void main(String[] args) {
		String input;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your grade value 1-100 ");
		input = scanner.nextLine();
		int result = Integer.parseInt(input);
		if (result > 97) {
			System.out.println("you letter is A+ for a value of " + input);
		} else if (result >= 94 && result <= 97) {
			System.out.println("you letter is A for a value of " + input);
		} else if (result <= 94 && result >= 91) {
			System.out.println("you letter is A- for a value of " + input);
		} else if (result <= 90 && result >= 87) {
			System.out.println("you letter is B+ for a value of " + input);
		} else if (result <= 87 && result >= 84) {
			System.out.println("you letter is B for a value of " + input);
		} else if (result <= 84 && result >= 80) {
			System.out.println("you letter is B- for a value of " + input);
		} else if (result <= 80 && result >= 77) {
			System.out.println("you letter is C for a value of " + input);
		} else if (result <= 76) {
			System.out.println("you letter is D for a value of " + input);
		}

	}

}
