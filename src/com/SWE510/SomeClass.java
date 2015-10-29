package com.SWE510;

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
	private int isbn;
	private short bookLength;

	public String getBestQuote()
		{
		return bestQuote;
		}

	private String bestQuote;


	// constructor
	public SomeClass(String bookName, int isbn, short bookLength, String bestQuote)
		{
		this.bookName = bookName;
		this.isbn = isbn;
		this.bookLength = bookLength;
		this.bestQuote = bestQuote;
		}

	@Override
	public String toString()
		{
		return String.format("%s %s%nsocial security number: %s",
		                     getBookName(), getIsbn(), getBookLength());
		}
	public String getBookName()
		{
		return bookName;
		}

	public void setBookName(String bookName)
		{
		this.bookName = bookName;
		}

	public int getIsbn()
		{
		return isbn;
		}

	public void setIsbn(int isbn)
		{
		this.isbn = isbn;
		}

	public short getBookLength()
		{
		return bookLength;
		}

	public void setBookLength(short bookLength)
		{
		this.bookLength = bookLength;
		}
	}
