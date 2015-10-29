package com.SWE510;

import java.awt.print.Book;

/**pre- and post-conditions are mandatory for all classes but Demo3
 * Shows a constructor passing information about constructor failure to an exception handler. Define class SomeClass,
 *  which throws an exception in the constructor. Your program should try to create an object of type SomeClass and
 *  catch the exception that is thrown from the constructor.
 * Created by mb on 10/29/15.
 */
public class SomeClass
	{

	/*each method will have a pre-condition
		e.g. depositMoney() method would presumably money should be positive.
		 So, a precondition would be money > 0.
		 */
	private String bookName;
	private String isbn;
	private int bookLength;
	private BookQuote quote;


	// constructor
	public SomeClass(String bookName, String isbn, int bookLength, String quote)
		{
		this.bookName = bookName;
		this.isbn = isbn;
		this.bookLength = bookLength;
		this.quote = new BookQuote(quote);
		}

	@Override
	public String toString()
		{
		return String.format("Book: %s%nISBN: %s%nPages: %s%nBest Quote: %n%s%n%n",
		                     bookName, isbn, bookLength,quote);
		}

	public String getBookName()
		{
		return bookName;
		}



	public String getIsbn()
		{
		return isbn;
		}


	public int getBookLength()
		{
		return bookLength;
		}

	public void setBookLength(int bookLength)
		{
		this.bookLength = bookLength;
		}

	public BookQuote getQuote()
		{
		return this.quote;
		}
	}

