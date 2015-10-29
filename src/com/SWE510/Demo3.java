package com.SWE510;
import java.util.InputMismatchException;
import java.util.Scanner;
/**Shows a constructor passing information about constructor failure to an exception handler. Define class SomeClass,
 *  which throws an exception in the constructor. Your program should try to create an object of type SomeClass and
 *  catch the exception that is thrown from the constructor.
 * Created by mb on 10/29/15.
 */
public class Demo3
	{
	public static void main (String[] args)
		{
		//Scanner scanner = new Scanner(System.in);

		SomeClass validObject = new SomeClass("The Goldfinch", "9780316055444", 775, "It used to be a perfectly " +
				                                                                             "ordinary day but now it sticks up on the calendar like a rusty nail.");

		System.out.print(validObject);
		boolean goLoop = true;
		//create invalid object and catch the exeption it throws from the constructor.
		do {
			try {

				SomeClass invalidObject = new SomeClass("We, the drowned", "0", 0, "Nobody sailed into a raging " +
						                                                                     "gale with all" +
						                                                           " sails " +
						                                                          "set. You didn't confront a storm head-on."
						                                                          + " You adjusted the sails and found a balance.");
				goLoop = false;
				System.out.print(invalidObject);

			}
			catch (InputMismatchException inputMismatchException) {
				System.out.println(inputMismatchException);
			}
		}
		while (goLoop);



		//SomeClass[] allBooks = new SomeClass{validObject, invalidObject};
		/*SomeClass userObject = new SomeClass();

		System.out.print("Please enter your favorite book. e.g. " + validObject.getBookName() + "\n");
		userObject.setBookName(scanner.next());
		System.out.print("Please enter the ISBN. e.g. " + validObject.getIsbn() + "\n");
		userObject.setIsbn(scanner.next());
		System.out.print("Please enter the number of pages in " + userObject.getBookName() + "\n");
		userObject.setBookLength(scanner.nextInt());
		System.out.print("Please enter your favorite quote from the book. e.g. " + validObject.getQuote() + "\n");
		userObject.setQuote(scanner.next());*/


		}
	}
