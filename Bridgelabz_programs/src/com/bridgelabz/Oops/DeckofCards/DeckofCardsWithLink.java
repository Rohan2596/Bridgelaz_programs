package com.bridgelabz.Oops.DeckofCards;

import java.util.Random;

import com.bridgelabz.DataStructure.Queue;
import com.bridgelabz.Oops.JsonUtil;
import com.bridgelabz.Oops.QueueWithlink;
/**
 * Purpose:-Shuffling of cards and then sorting using Linkedlist Queue
 * @author admin1
 *
 */
public class DeckofCardsWithLink {
	QueueWithlink<String> queue=new QueueWithlink<String>();
private String[] suits= {"Hearts", "Clubs", "Diamonds", "Spades"};
private String[] ranks= {"2", "3", "4", "5", "6", "7", "8", "9", "Jack", "Queen", "King", "Ace"  };
private static String [] cards=new String[52];
public String[] getcards() {
int i=0;
for(String suit:suits) {
	for(String card:ranks) {
		cards[i]=suit+card;
		i++;
	}
}
	return cards;	
}
public void shuffleCard() {
	Random random=new Random();
	for(int i=0;i<cards.length;i++) {
		int index=random.nextInt(52);
		String temp=cards[index];
		cards[index]=cards[index];
		cards[i]=temp;
	}
	
}
public String[][] distribute(int numOfPlayers, int numberOfCards) {
	String playerCards[][] = new String[numOfPlayers][numberOfCards];
	int k = 0;
	for (int i = 0; i < numOfPlayers; i++) {

		for (int j = 0; j < numberOfCards; j++) {
			playerCards[i][j] = cards[k];
			queue.engueu(playerCards[i][j]);
			k++;
		}
	
	}
	
	return playerCards;

}

public void displayCards(String[][] playerCards) {
	int i = 1;
	for (String[] playerCard : playerCards) {
		System.out.println();
		System.out.println("player :" + (i++) + " cards : ");

		for (int j = 0; j < playerCard.length; j++) {
			
			String val =  queue.dequeu();
			System.out.print(val + "  ");
		}
		System.out.println();

	}
}

}
