package com.SWE510;

/**Shows a constructor passing information about constructor failure to an exception handler. Define class SomeClass,
 *  which throws an exception in the constructor. Your program should try to create an object of type SomeClass and
 *  catch the exception that is thrown from the constructor.
 * Created by mb on 10/29/15.
 */
public class Demo3
	{
	public static void main (String[] args)
		{
		SomeClass bookObject;
		bookObject = new SomeClass("The Goldfinch", "9780316055444", 775, "It used to be a perfectly ordinary day but now it sticks up on the calendar like a rusty nail.");

		System.out.print(bookObject);
		//System.out.printf("from main using bookObject.getQuote" + bookObject.getQuote() + "\n");

		}
	}
