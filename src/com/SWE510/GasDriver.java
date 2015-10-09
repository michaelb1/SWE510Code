package com.SWE510;

/**
 * Michael Brashier. 15/Sept/2015
 * SWE 510 GMU Fall Semester 2015
 * HW-2 Implement a Java Class called Gas and GasDriver
 * to calulate miles per gallon based on user input
 */

import java.util.Scanner;


/**
 * The type Gas driver.
 */
public class GasDriver
{
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args)
        {

            /*instantiate new scanner object UserInput
            to user to ask how many miles and galllons
             */
            Scanner userInput = new Scanner(System.in);

            //create a new object of Gas type to calculate mpg
            Gas newGas = new Gas();

            double miles;
            double gallons;

            /**do loop to run through the process at least once with a nested if statement to catch if
             * the user adds a -1 to end the program. If not, the loop continues to run. The loops gets the miles, gallons,
             * and sends it to the methods of new Gas object.
             */
            do
            {

                System.out.println("Enter total miles for trip. To end program enter \"-1\".");

                miles = userInput.nextDouble();

                /**if the user enters a -1 the program ends with a goodbye message
                 */
                if (miles == -1)
                {
                    System.out.println("Goodbye!");
                    System.exit(0);
                }

                /**If the user does not enter a -1 the loop continues by passing user intput
                 * to the setMiles method then asking for gallons used and sending that data to
                 * the setGals method.
                 */
                else
                    newGas.setMiles(miles);

                System.out.println("Enter total gallons used long this trip");
                gallons = userInput.nextDouble();

                newGas.setGals(gallons);

                /**outputs a string to tell the user what their miles per gallon are
                 * by calling the getMPG method
                 */
                System.out.println("You averaged " + newGas.getMPG() + " miles per gallon.\n");

            }
            while (miles >= 0);
        }
}


