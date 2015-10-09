package com.SWE510;

import java.util.Scanner;

/**
 * Michael Brashier. 08/Sept/2015
 * SWE 510 GMU Fall Semester 2015
 * Deitel Book "Java How To Program Tenth Edition Early Objects" Chapter 2
 * Exercise 2.24)
 * Write an application that reads five integers and determines and prints
 * the largest and smallest integers in the group.
 */
public class LargeSmall {


public static void main (String[] args) {/*methods start in lower case*/

    /**this instance of Scanner will be used to get user input*/
    Scanner input = new Scanner(System.in);

    /**Round 1 of 5: Prompt the user for input. Assign users first answer to both maxNumber and minNumber
     * for comparison to subsequent user input
     */

    System.out.println("Enter an integer: ");
    int userQuestion = input.nextInt();

    /**These two integers will store the highest and lowest ints
     that the user submits*/
    int maxNumber = userQuestion;
    int minNumber = userQuestion;

    /**Round 2: Prompt the user for input comparing input to
     * maxNumber and minNumber. Replace variables with user input as dictated
     */
    System.out.println("Enter an integer: ");
    userQuestion = input.nextInt();

    if ( userQuestion > maxNumber)
        maxNumber = userQuestion;

    if (userQuestion < minNumber)
        minNumber = userQuestion;

    /**Round 3: Prompt the user for input comparing input to
     * maxNumber and minNumber. Replace variables with user input as dictated
     */
    System.out.println("Enter an integer: ");
    userQuestion = input.nextInt();

    if ( userQuestion > maxNumber)
        maxNumber = userQuestion;

    if (userQuestion < minNumber)
        minNumber = userQuestion;

    /**Round 4: Prompt the user for input comparing input to
     * maxNumber and minNumber. Replace variables with user input as dictated
     */
    System.out.println("Enter an integer: ");
    userQuestion = input.nextInt();

    if ( userQuestion > maxNumber)
        maxNumber = userQuestion;

    if (userQuestion < minNumber)
        minNumber = userQuestion;

    /**Round 5: Prompt the user for input comparing input to
     * maxNumber and minNumber. Replace variables with user input as dictated
     */
    System.out.println("Enter an integer: ");
    userQuestion = input.nextInt();

    if ( userQuestion > maxNumber)
        maxNumber = userQuestion;

    if (userQuestion < minNumber)
        minNumber = userQuestion;

    /**Present max and min numbers back to user
     *
     */
    System.out.println("The largest integer of the group is " + maxNumber);
    System.out.println("The smallest integer of the group is " + minNumber);

}

}
