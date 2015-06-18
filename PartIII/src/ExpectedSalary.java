/**
 * @author David Manouchehri
 *         Created on 6/17/15 at 6:56 PM.
 *         All content is under the MIT License unless otherwise specified.
 *         See LICENSE.txt for details.
 */

import java.util.Scanner;

public class ExpectedSalary {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        final int baseBSc = 28000;
        final int expBSc = 6000;

        final int baseMSc = 35000;
        final int expMSc = 5000;

        final int basePhD = 45000;
        final int expPhD = 15000;

        String degrees[] = {"BSc", "MSc", "PhD"};

        /* Collect all the user input. */
        String userInputs = "";
        for(; userInput.hasNext();) {
            String input = userInput.next();
            if(input.equalsIgnoreCase("done"))
                break;
            userInputs += input;
        }

        Scanner scanner = new Scanner(userInputs);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }
        scanner.close();
    }
}
