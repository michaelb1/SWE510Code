package com.SWE510;

import java.security.SecureRandom;

/**
 * Created by mb on 10/1/15.
 */
public class DeckOfCards
	{
	private Card[] deck;
	private int currentCard;
	private static final int NUMBER_OF_CARDS = 52;
	private static final SecureRandom randomNumbers = new SecureRandom();

	/**
	 * constructor fills deck of cards
	 */
	public DeckOfCards()
		{
		String[] faces = { "Ace", "Duece", "Three", "four", "five", "six", "seven",
				                 "eight", "nine", "ten", "jack", "queen", "king"};

		String[] suits = { "hearts", "Diamonds", "Clubs", "Spades"};

		deck = new Card[NUMBER_OF_CARDS];//create array of card objects

		currentCard = 0;//first card dealt will be deck[0]

		//populate deck with card objects
		for (int count = 0; count < deck.length; count++)
			{
				deck[count]= new Card(faces[count % 13], suits[count / 13]);
			}

		}

	/**
	 * Shuffle.
	 */
//shuffle deck of cards with one pass algorith
	public void shuffle()
		{
		//next call to method dealCard should start at deck[0] again
		currentCard = 0;

		//for each Card, pick another random Card (0-51) and swap them
		for (int first = 0; first < deck.length; first++)
		{
			//select random between 0-51
			int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

			//swap current Card with randomly selected card
			Card temp = deck[first];
			deck[first] = deck[second];
			deck[second] = temp;
		}
		}

	/**
	 * Deal card card.
	 *
	 * @return the card
	 */
//deal one card
	public Card dealCard()
		{
		//determine if cards remain to be dealt
		if(currentCard < deck.length)
		{
			return deck[currentCard++];//return current card in array
		}
		else
			return null;
		}
	}
