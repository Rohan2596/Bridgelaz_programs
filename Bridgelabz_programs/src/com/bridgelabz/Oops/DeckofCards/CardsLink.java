package com.bridgelabz.Oops.DeckofCards;

import com.bridgelabz.Oops.JsonUtil;

public class CardsLink  extends DeckofCardsWithLink{

	public static void main(String[] args) {
		DeckofCardsWithLink deck = new CardsLink();

		deck.getcards();
		deck.shuffleCard();
		System.out.println("Enter the number of players");
        int n=JsonUtil.IntegerInput();
        System.out.println("Enter the numbers of Cards");
        int n1=JsonUtil.IntegerInput();
		String playerCards[][] = deck.distribute(n, n1);

		deck.displayCards(playerCards);
	}

}
