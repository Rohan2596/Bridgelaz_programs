package com.bridgelabz.Oops.DeckofCards;

public abstract class DeckOfCards {

	public abstract String[] getCards();
	
	public abstract void shuffleCard();
	
	public abstract String[][] distribute(int numOfPlayers, int numberOfCards);
	
	public abstract void displayCards(String[][] playerCards);
}
