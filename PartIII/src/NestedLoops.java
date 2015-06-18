/**
 * @author David Manouchehri
 *         Created on 6/9/15 at 2:49 PM.
 *         All content is under the MIT License unless otherwise specified.
 *         See LICENSE.txt for details.
 *
 *         Use nested looped to print out the following:
 *
 *         @
 *         @@
 *         @@@
 *         @@@@
 *         @@@@@
 *         @@@@@@
 *         @@@@@
 *         @@@@
 *         @@@
 *         @@
 *         @
 */
public class NestedLoops {
    public static void main(String[] args) {
        int length = 11;
        int width = length / 2 + 1;

        for(int i = 0; i < length; i++) {
            if(i < width)
                for(int j = 0; j < i; j++)
                    System.out.print("@");
            else
                for(int j = 1; j < (length - i); j++) /* I'm aware this is a bit messy, but I like     */
                    System.out.print("@");            /* being able to change the length/width easily. */
            System.out.print("@\n");
        }
    }
}
