package com.bridgelabz.functional;

import java.util.Random;

import com.bridgelabz.Algorithm.AlgoUtility;

public class TictacToe_f14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] board={0,1,2,3,4,5,6,7,8};
		/**
		 * Getting Two inputs one from Computer and other from Us
		 */
		while(true) {
			 int ip=AlgoUtility.inputInt();
			 if(board[ip]!='X' && board[ip]!='O') {
				 board[ip]='X';
			if (TicTacToe.checkall('X')==true){
				System.out.println("_____Xwins_____");
		break;
			}	 
				
			 while(true) {
			 Random rand=TicTacToe.random();
			 int oppent=rand.nextInt(8);
			 if(board[oppent]!='X' && board[oppent]!='O' ) {
				 board[oppent]='O';
				 if (TicTacToe.checkall('O')==true){
						System.out.println("_____Owins_____");
					break;
				 }break;
				 }
		 }
			 }else {
				 System.out.println("THE SPOT IS TAKEN");}
			 }TicTacToe.show(board);

		}

}
