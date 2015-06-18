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
        final int expBSc = 34000;

        final int baseMSc = 35000;
        final int expMSc = 40000;

        final int basePhD = 45000;
        final int expPhD = 60000;

        final String degrees[] = {"BSC", "MSC", "PHD"};

        /* Collect all the user input. */
        String userInputs = "";
        for(; userInput.hasNext();) {
            String input = userInput.next();
            if(input.equalsIgnoreCase("done")) {
                userInputs += "\n";
                break;
            }
            userInputs += input + "\n";
        }
        userInput.close();

        String ID = "";
        int degree = 0, salary = 0;

        Scanner liner = new Scanner(userInputs);
        for (int i = 0; liner.hasNextLine(); i++) {
            String line = liner.nextLine().toUpperCase();

            if(i > 2) { /* If three lines have been read. */
                i = 0;
                System.out.printf("ID: %s + Expected Salary: $%.2f\n", ID, (double)salary);
            }

            if(i == 0)
                ID = line;
            else if(i == 1) {
                if(line.equalsIgnoreCase(degrees[0]))
                    degree = 0;
                else if(line.equalsIgnoreCase(degrees[1]))
                    degree = 1;
                else if(line.equalsIgnoreCase(degrees[2]))
                    degree = 2;
                else {
                    System.out.println("Unexpected input. Quitting.");
                    break;
                }
            }
            else if (i == 2)
                if(Integer.parseInt(line) < 5)
                    switch(degree) {
                        case 0:
                            salary = baseBSc;
                            break;
                        case 1:
                            salary = baseMSc;
                            break;
                        case 2:
                            salary = basePhD;
                    }
                else
                    switch(degree) {
                        case 0:
                            salary = expBSc;
                            break;
                        case 1:
                            salary = expMSc;
                            break;
                        case 2:
                            salary = expPhD;
                    }
        }
        liner.close();
    }
}
