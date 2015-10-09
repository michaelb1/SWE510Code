package com.SWE510;

/**
 * Created by mb on 10/1/15.
 */
public class Card
	{
	private final String face; //face of card
	private final String suit;  //suit of card

	//two-argument constructor initialize cards face and suit
	public Card(String cardFace, String cardSuit)
		{
		this.face = cardFace;//initialize cards face
		this.suit = cardSuit;//initialize cards suit
		}

	//return String representation of card. This overrides toString I think.
	public String toString()
		{
		return face + " of " + suit;
		}

	}
