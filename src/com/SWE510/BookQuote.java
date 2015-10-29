package com.SWE510;

/**
 * Created by mb on 10/29/15.
 */
public class BookQuote

	{

	private String quote;
	private int page;
	private String bookTitle;


	//construct
	public BookQuote (String quote, int page, String bookTitle)
		{
		this.quote = quote;
		this.page = page;
		this.bookTitle = bookTitle;
		}

	public BookQuote(String quote, String bookTitle)
		{
		this.quote = quote;
		this.bookTitle = bookTitle;
		}


	public BookQuote(String quote)
		{
		this.quote = quote;
		}

	public String getQuote()
		{
		return quote;
		}


	public int getPage()
		{
		return page;
		}

	public void setPage(int page)
		{
		this.page = page;
		}

	public String getBookTitle()
		{
		return bookTitle;
		}



	@Override
	public String toString()
		{
		return "\"" + quote + "\"";
		}
	}
