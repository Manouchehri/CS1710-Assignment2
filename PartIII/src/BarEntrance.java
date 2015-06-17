/**
 * @author David Manouchehri
 *         Created on 6/9/15 at 2:48 PM.
 *         All content is under the MIT License unless otherwise specified.
 *         See LICENSE.txt for details.
 *
 *         Page 194, Business P4.31
 */

import java.util.Scanner;

public class BarEntrance {
        public static void main(String[] args) {
            Scanner userInput = new Scanner(System.in);
            final int maxCap = 100;

            System.out.println("Enter the number of people arriving or leaving.");

            for(int currentCap = 0; userInput.hasNextInt();) {
                int attemptCap = currentCap + userInput.nextInt();
                if(attemptCap > maxCap) {
                    System.out.println("Oyster bar is at capacity.");
                    break; /* This could be removed to allow people to leave. */
                }
                else {
                    System.out.println("Current capacity: " + attemptCap);
                    currentCap = attemptCap;
                }
            }
        }
}
