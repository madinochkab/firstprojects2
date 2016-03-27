/**
 *   File Name: EvenNumbers.java<br>
 *
 *   Siebenthal, Madina<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Mar 26, 2016
 *
 */

package firstprojects2;

//print out even numbers from 1 to 100
/**
 * EvenNumbers //ADDD (description of class)
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
public class EvenNumbers {
	public static void main(String[] args) {
		for (int i = 0; i <= 100; i++) {
			int remain = i % 2;
			if (remain == 0) {
				System.out.println(i);
			}
		}

	}

}
