
package com.bridgelabz.Oops.DeckofCards;

import java.util.Random;
/**
 * Purpose:-To shuffle cards from deck of cards and distribute according
 * @author Rohan Kadam
 *Date:-18/03/2019
 */
public class Cards  extends DeckOfCards{
	private String[] suits = { "He arts", "Clubs", "Diamonds", "Spades" };
	private String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
	private static String[] cards = new String[52];
//assigning suits and hearts to single array  
	@Override
	public String[] getCards() {
		int i = 0;
		for (String suit : suits) {
			for (String card : ranks) {
				cards[i] = card + "-" + suit;
				i++;
			}
		}
		return cards;
	}
//Shuffling cards 
	@Override
	public void shuffleCard() {
		Random random = new Random();
		for (int i = 0; i < cards.length; i++) {
			int index = random.nextInt(52);
			String temp = cards[index];
			cards[index] = cards[i];
			cards[i] = temp;
		}
	}
//Distributing Cards according to numofplayers and numberofcards
	@Override
	public String[][] distribute(int numOfPlayers, int numberOfCards) {
		String playerCards[][] = new String[numOfPlayers][numberOfCards];
		int k = 0;
		for (int i = 0; i < numOfPlayers; i++) {

			for (int j = 0; j < numberOfCards; j++) {
				playerCards[i][j] = cards[k];
				k++;
			}
		}
		return playerCards;
	}
//Displaying cards accordinly
	@Override
	public void displayCards(String[][] playerCards) {
		int i = 1;
		for (String[] playerCard : playerCards) {
			System.out.println();
			System.out.println("player :" + (i++) + " cards : ");

			for (String card : playerCard) {
				System.out.print(card + "  ");
			}
			System.out.println();

		}
	}

	
}
