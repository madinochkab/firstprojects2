/**
 *   File Name: month.java<br>
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
 * month //ADDD (description of class)
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
public class month {
	public static void main(String[] args) {
		String input;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number 1-12");
		input = scanner.nextLine();
		int result = Integer.parseInt(input);

		switch (result) {
		case 1:
			System.out.println("this is Jan ");
			break;
		case 2:
			System.out.println("this is Feb ");
			break;
		case 3:
			System.out.println("this is mar ");
			break;
		case 4:
			System.out.println("this is APr ");
			break;
		case 5:
			System.out.println("this is may ");
			break;
		case 6:
			System.out.println("this is jun ");
			break;
		case 7:
			System.out.println("this is july ");
			break;
		case 8:
			System.out.println("this is aug ");
			break;
		case 9:
			System.out.println("this is sep ");
			break;
		case 10:
			System.out.println("this is oct ");
			break;
		case 11:
			System.out.println("this is nov ");
			break;
		case 12:
			System.out.println("this is dec ");
			break;
		default:
			System.out.println("this is not a month ");
			break;

		}
		scanner.close();

	}

}
