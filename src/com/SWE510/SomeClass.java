package com.SWE510;

import java.util.InputMismatchException;

/**
 * pre- and post-conditions are mandatory for all classes but Demo3
 * Shows a constructor passing information about constructor failure to an exception handler. Define class SomeClass,
 * which throws an exception in the constructor. Your program should try to create an object of type SomeClass and
 * catch the exception that is thrown from the constructor.
 * Created by mb on 10/29/15.
 */
public class SomeClass
	{

	private String bookName;
	private String isbn;
	private int bookLength;
	private BookQuote quote;


	/**
	 * constructor Pre-condition arguments passed in  must be the correct type. Booklenth must be greater than 0.
	 *
	 * @param bookName   the book name
	 * @param isbn       the isbn
	 * @param bookLength the book length
	 * @param quote      the quote
	 * @throws InputMismatchException the input mismatch exception
	 */
	public SomeClass(String bookName, String isbn, int bookLength, String quote) throws InputMismatchException

		{
		if (bookLength <= 0) {
			throw new InputMismatchException();
		}

		this.bookName = bookName;
		this.isbn = isbn;
		this.bookLength = bookLength;
		this.quote = new BookQuote(quote);
		}
	/**constructor post-condition: Method will provide a new object of type SomeClass that holds variables with
	 * getter and setter methods.
*/

	@Override
	public String toString()
		{
		return String.format("Book: %s%nISBN: %s%nPages: %s%nBest Quote: %n%s%n%n",
		                     bookName, isbn, bookLength,quote);
		}

	/**
	 * Gets book name.
	 *
	 * @return the book name
	 */
	public String getBookName()
		{
		return bookName;
		}


	/**
	 * Gets isbn.
	 *
	 * @return the isbn
	 */
	public String getIsbn()
		{
		return isbn;
		}


	/**
	 * Gets book length.
	 *
	 * @return the book length
	 */
	public int getBookLength()
		{
		return bookLength;
		}

	/**
	 * Sets book length.
	 *
	 * @param bookLength the book length
	 */
	public void setBookLength(int bookLength)
		{
		this.bookLength = bookLength;
		}

	/**
	 * Gets quote.
	 *
	 * @return the quote
	 */
	public BookQuote getQuote()
		{
		return this.quote;
		}

	/**
	 * Sets book name.
	 *
	 * @param bookName the book name
	 */
	public void setBookName(String bookName)
		{
		this.bookName = bookName;
		}

	/**
	 * Sets isbn.
	 *
	 * @param isbn the isbn
	 */
	public void setIsbn(String isbn)
		{
		this.isbn = isbn;
		}

	/**
	 * Sets quote.
	 *
	 * @param quote the quote
	 */
	public void setQuote(BookQuote quote)
		{
		this.quote = quote;
		}
	}

