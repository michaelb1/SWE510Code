package com.SWE510;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Shows a constructor passing information about constructor failure to an exception handler. Define class SomeClass,
 * which throws an exception in the constructor. Your program should try to create an object of type SomeClass and
 * catch the exception that is thrown from the constructor.
 * Created by mb on 10/29/15.
 */
public class Demo3
	{

	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args)
		{
		Scanner scanner = new Scanner(System.in);

		SomeClass validObject = new SomeClass("The Goldfinch", "9780316055444", 775, "It used to be a perfectly " +
				                                                                             "ordinary day but now it sticks up on the calendar like a rusty nail.");

		boolean goLoop = true;
//a lot to interate thoough collecting user input to contruct a new object and catch exceptions.
		do {
			System.out.print("Please enter your favorite book. e.g. " + validObject.getBookName() + "\n");
			String bName = scanner.nextLine();
			System.out.printf("\n");

			System.out.print("Please enter the ISBN. e.g. " + validObject.getIsbn() + "\n");
			String isbn = scanner.nextLine();

			System.out.print("Please enter your favorite quote from the book. \ne.g. " + validObject.getQuote() +
					                 "\n");
			String quote = scanner.nextLine();


			System.out.print("Please enter the number of pages in " + "\"" + bName + "\"" + ".\n");
			int bLength = scanner.nextInt();

			//pass variables to constructor. Catch exception thrown by constructor.
			try {
				SomeClass userObject = new SomeClass(bName, isbn, bLength, quote);
				System.out.print("Your book :\n" + userObject);
				goLoop = false;

			}

			catch (InputMismatchException inputMismatchException) {
				System.out.println("A book has to have more than 0 pages.");

			}


		}
		while (goLoop);


		}
	}