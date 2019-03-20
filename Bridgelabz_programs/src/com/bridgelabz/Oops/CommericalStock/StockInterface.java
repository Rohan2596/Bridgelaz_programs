package com.bridgelabz.Oops.CommericalStock;

import java.util.List;
/**
 * Purpose:-Stock Interface
 * @author Rohan Kadam
 *
 */
public interface StockInterface {

	public double valueOf();
	public void buy(int amount, String symbol);
	public void sell(int amount, String symbol);
	public void save(String fileName,	List<Person> personList);
    public void printReport();
}
