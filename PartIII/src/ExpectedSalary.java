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

        System.out.println("Please enter all applicants followed by `done`: ");

        /* Collect all the user input. */
        String userInputs = "";
        while(userInput.hasNext()) {
            String input = userInput.next();
            if(input.equalsIgnoreCase("done")) {
                userInputs += "\n";
                break;
            }
            userInputs += input + "\n";
        }
        userInput.close(); /* Might as well close it if I'm not using it. */

        /* The assignment document doesn't really make clear
           how reliable the input is going to be, so I've
           tried to make it a bit fault tolerant. */

        String ID = "";
        int degree = 0, salary = 0;

        Scanner liner = new Scanner(userInputs);
        for (int i = 0; liner.hasNextLine(); i++) {
            String line = liner.nextLine().toUpperCase(); /* Might as well throw everything into upper case. */

            if(i > 2) { /* If three lines have been read, assume it's onto the next applicant. */
                i = 0;
                System.out.printf("ID: %s + Expected Salary: $%.2f\n", ID, (double)salary);
                /* I could also just fake it and write .00 instead of casting it, but
                   supporting decimals isn't going to hurt. */
            }

            if(i == 0)
                ID = line; /* I have no way of knowing what's considered a valid ID,
                              so I have to accept everything. */
            else if(i == 1) {
                if(line.equalsIgnoreCase(degrees[0])) /* I shouldn't have to ignore the case since everything */
                    degree = 0;                       /* is already upper case, but it's just a safe way of   */
                                                      /* double checking things.                              */
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
                    switch(degree) {  /* Another way of doing this would be add the difference. */
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
        liner.close(); /* If I was going to modify the string again, it would need to be closed. */
    }
}
