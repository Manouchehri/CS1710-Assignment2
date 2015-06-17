/**
 * @author David Manouchehri
 *         Created on 6/9/15 at 2:47 PM.
 *         All content is under the MIT License unless otherwise specified.
 *         See LICENSE.txt for details.
 *
 *         Page 190, Question P4.15
 */

import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please set a set of floats. When you are done, enter any character to quit (e.g., \"h\" followed by the enter key.)");

        double sum = 0, sumSquares = 0;
        int count;
        for(count = 0; userInput.hasNextFloat(); count++) {
            double num = userInput.nextFloat();
            sum += num;
            sumSquares += Math.pow(num, 2);
        }

        double standardDeviation = Math.sqrt( (sumSquares - (Math.pow(sum, 2) / count) ) / (count - 1) );

        System.out.println("Count of values: " + count);
        System.out.println("Average: " + sum / count);
        System.out.println("Standard deviation: " + standardDeviation);
    }
}
