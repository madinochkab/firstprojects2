/**
 *   File Name: exercise.java<br>
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
 * exercise //ADDD (description of class)
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
public class exercise {
	public static void main(String[] args) {
		String input;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		input = scanner.nextLine();
		int result = Integer.parseInt(input);

		if (result > 10) {
			System.out.println("number is greater than 10 and = " + result);
		} else {
			System.out.println("number is smaller than 10 and = " + result);
		}
		scanner.close();
	}

}
