package com.bridgelabz.DataStructure;
/**
 * 
 * To  print 2d Array Calendra using Queue logic
 * @author Rohan Kadam
 *
 * @param <T>
 */
public class CalendraQueue<T> {
static	int arr[][]=new int[6][7];
/**
 * To find the day of week
 * @param month
 * @param year
 * @return
 */

	public static int day(int month, int year) {
		int day = 1;
		int y = year - (14 - month) / 12;
		int x = y + y / 4 - y / 100 + y / 400;
		int m = month + 12 * ((14 - month) / 12) - 2;
		int d = ((day + x + (31 * m) / 12) % 7);
		return d;
	}
/*
 * Method to print year leap year
 */
   public static boolean isLeapyear(int year)
   {
    	 if ((year % 4 == 0) && (year % 100 != 0)) return true;
   if  (year % 400 == 0)  return true;
   return true;
   }


public static void main(String[] args) {
	QueueWithlink Queue = new QueueWithlink();
 int dayinmonth = 0;
	 int year = DSUtility.inputInt();
    int month = DSUtility.inputInt();
    int days=day(month,year);
    
	if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
		dayinmonth = 31;

	}else if(month==4||month==6||month==9||month==12)
	{
	 dayinmonth = 30;
	}else if(month==2)
	{
		if (isLeapyear(year) == true) {
			dayinmonth = 28;
		} else {
		dayinmonth = 29;
		}
	}
int count=1;
	for (int i =0; i < 6; i++) 
	{
		for (int j = days; j < 7; j++) 
		{
			if (count <= dayinmonth) 
			{ 
				arr[i][j]=count;
//				System.out.println(arr[i][j]);
				Queue.engueu(arr[i][j]);
				count++;
				
			} 
			else 
			{
				break;
			}
			
//			System.out.println(arr[i][j]);
		}days=0;	
		
		
}
	
	System.out.println("sun\tMon\tTue\twed\tThu\tFri\tSat");
	for (int i = 0; i < 6; i++) 
	{
		for (int j = 0; j < 7; j++) 
		{
			if (arr[i][j] == 0) 
			{
				System.out.print("\t");
			} 
			else if (arr[i][j] > 9) 
			{
				int val = (int) Queue.dequeu();
				System.out.print(val + "\t");
			} 
			else 
			{
				int val = (int) Queue.dequeu();
				System.out.print(val + "\t");
			}
		}
		System.out.println();
	}

}}
