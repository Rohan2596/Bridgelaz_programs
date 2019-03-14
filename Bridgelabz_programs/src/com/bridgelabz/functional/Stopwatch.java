package com.bridgelabz.functional;
/**
 * Purpose:-Stop watch
 * @author Rohan Kadam
 *
 */
public class Stopwatch 
{

	public static void main(String[] args) throws InterruptedException {

long start=System.currentTimeMillis();
System.out.println("Enter the seconds to stop:-");
int n=Utility.inputInt();
Thread.sleep(n*1000);
long end=System.currentTimeMillis();
double elapsed=(end-start);
System.out.println("elasped Time:"+elapsed);
	}

}
