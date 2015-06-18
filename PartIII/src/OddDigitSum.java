/**
 * @author David Manouchehri
 *         Created on 6/9/15 at 2:44 PM.
 *         All content is under the MIT License unless otherwise specified.
 *         See LICENSE.txt for details.
 *
 *         Page 188, Question P4.1, part e
 *         Expected input would be >= 0 (int)
 */

import java.util.Scanner;

public class OddDigitSum {
    public static void main(String[] args) {
        int sums = 0;

        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int nums = userInput.nextInt();

        if(nums < 0)
            System.out.println("Error, number cannot be negative.");

        /* If the input number is zero, no need to do any math. */

        while(nums > 0) {
            int digit = nums % 10; /* Could be inline too, but it's easier to read this way. */
            if(digit % 2 != 0) /* Only add if it's an odd number. */
                sums += digit;
            nums /= 10; /* Move onto the next digit regardless. */
        }

        System.out.print("The sums of all odd numbers is " + sums);
    }
}
