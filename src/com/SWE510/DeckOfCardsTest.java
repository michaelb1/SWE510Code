package com.SWE510;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Created by mb on 10/1/15.
 */
public class DeckOfCardsTest
	{
	//start app
	public static void main(String [] args)
		{
		DeckOfCards myDeckOfCards = new DeckOfCards();
		myDeckOfCards.shuffle(); //place cards in random order

		//print all 52 in the order they are dealt
		for (int i = 1; i <= 52; i++)
		{
			//deal and display a card
			System.out.printf("%-19s", myDeckOfCards.dealCard());

			if (i % 4 == 0) //output a new line after every fourth card
			{
				System.out.println();
			}
		}
		}
	}
