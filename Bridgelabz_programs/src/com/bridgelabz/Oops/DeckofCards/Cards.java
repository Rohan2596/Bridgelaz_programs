package com.bridgelabz.Oops.DeckofCards;

import com.bridgelabz.Oops.JsonUtil;
/**
 * To shuffle the Cards and distributing among players specified
 * @author Rohan Kadam
 *
 */
class Cards extends DeckofCards{//Performing inheritances 
	public static void main(String args[]) {
		DeckofCards deck = new Cards();//

		deck.getCards();
		deck.shuffleCard();
		System.out.println("Enter the number of players");
        int n=JsonUtil.IntegerInput();
        System.out.println("Enter the numbers of Cards");
        int n1=JsonUtil.IntegerInput();
		String playerCards[][] = deck.distribute(n, n1);

		deck.displayCards(playerCards);

	}
}

