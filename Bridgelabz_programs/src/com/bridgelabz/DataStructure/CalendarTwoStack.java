package com.bridgelabz.DataStructure;

/**
 * To print 2d Array Calendar using Two stack method
 * 
 * @author Rohan Kadam
 *
 */
public class CalendarTwoStack {
	static int arr[][] = new int[6][7];

	/**
	 * Method for getting day of week
	 */
	public static int day(int month, int year) {
		int day = 1;
		int y = year - (14 - month) / 12;
		int x = y + y / 4 - y / 100 + y / 400;
		int m = month + 12 * ((14 - month) / 12) - 2;
		int d = ((day + x + (31 * m) / 12) % 7);
		return d;
	}

	/**
	 * Method for finding leap year
	 * 
	 * @param year:- Leap year
	 * @return:-boolean condition
	 */
	public static boolean isLeapyear(int year) {
		if ((year % 4 == 0) && (year % 100 != 0))
			return true;
		if (year % 400 == 0)
			return true;
		return true;
	}

	public static void main(String[] args) {
		/**
		 * Two stack object for printing Calendar
		 */
		StackWithLink Stack = new StackWithLink();
		StackWithLink Stack1 = new StackWithLink();
		int dayinmonth = 0;
		System.out.println("Enter the year ");
		int year = DSUtility.inputInt();
		System.out.println("Enter the month:-");
		int month = DSUtility.inputInt();
		int days = day(month, year);

		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			dayinmonth = 31;

		} else if (month == 4 || month == 6 || month == 9 || month == 12) {
			dayinmonth = 30;
		} else if (month == 2) {
			if (isLeapyear(year) == true) {
				dayinmonth = 28;
			} else {
				dayinmonth = 29;
			}
		}
		int count = 1;
		for (int i = 0; i < 6; i++) {
			for (int j = days; j < 7; j++) {
				if (count <= dayinmonth) {
					arr[i][j] = count;
//				System.out.println(arr[i][j]);
					Stack.push(arr[i][j]);
					count++;

				} else {
					break;
				}

//			System.out.println(arr[i][j]);
			}
			days = 0;

		}

		for (int i = 1; i <= dayinmonth; i++) {
			Stack1.push(Stack.pop());
		}
		System.out.println("sun\tMon\tTue\twed\tThu\tFri\tSat");
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				if (arr[i][j] == 0) {
					System.out.print("\t");
				} else if (arr[i][j] > 9) {
					int val = (int) Stack1.pop();
					System.out.print(+val + "\t");
				} else {
					int val = (int) Stack1.pop();
					System.out.print(+val + "\t");
				}
			}
			System.out.println();
		}

	}
}
