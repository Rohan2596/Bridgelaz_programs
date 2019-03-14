package com.bridgelabz.DataStructure;
/**
 * Purpose:-Banking Counter for Using Queue 
 * @author Rohan Kadam
 *
 */
public class BankingCounter {
	static int frist = 0;
	static int last = 0;
	public static final int MAXSIZE = 100;
	public static int bankBalance = 1000;
	public static int size = 0;

	public static void enQueue(int range) {
		last = last + range;
		System.out.println("Persons are added in queue are:" + range);

	}

	public static void deposit(int amount) {
		System.out.println("Amount deposited is:" + amount);

		bankBalance += amount;
		size--;
		Print();
	}
/**
 * Withdraw Amount
 * @param amount:-Amount
 */
	public static void withdraw(int amount) {

		if (amount < bankBalance) {
			System.out.println("Amount withdrawn is ::" + amount);
			bankBalance -= amount;
			Print();
		}

		else {
			System.out.println("Sorry! Insufficient Fund");
		}
	}
/**
 * Deqeue Method
 */
	public static void Dequeu() {

		if (last < frist) {
			System.out.println("Queue is Empty");
		} else {

			System.out.println("Enter 1. to deposite");
			System.out.println("Enter 2. to withdraw");
			int Transcation = DSUtility.inputInt();
			if (Transcation == 1) {
				System.out.println("Enter the amount ");
				int amount = DSUtility.inputInt();
				deposit(amount);

			} else if (Transcation == 2) {
				System.out.println("Enter the amount to be withdrawn:");
				int amount = DSUtility.inputInt();
				withdraw(amount);
			}
			frist++;
		}

	}
/**
 * Print method for printing 
 */
	public static void Print() {
		System.out.println("Bank Balance::" + bankBalance);
	}

	public static void size() {
		System.out.println("Size of Queue is::" + (last - frist));

	}

	public static void main(String[] args) {

		int options = 0;

		do {

			System.out.println();
			System.out.println("***************Cash Counter**************");
			System.out.println("1.persons in the bank queue:");
			System.out.println("2.perfoming transaction Withdraw/deposite");
			System.out.println("3.checking number of people in the queue ");
			System.out.println("4.Exit");
			System.out.println();
			System.out.println("Enter your choice: ");

			options = DSUtility.inputInt();
			switch (options) {
			case 1:
				System.out.println("Enter the persons to be added to queue");
				enQueue(DSUtility.inputInt());
				Print();
				break;
			case 2:

				Dequeu();

				System.out.println(" Your Avail Balance is: ");
				Print();
				break;
			case 3:
				size();

			case 4:
				System.exit(0);
			default:
				System.out.println("You entered wrong choice");
				break;

			}
		} while (options < 5 || options <= 0);

	}
}