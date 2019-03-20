package com.bridgelabz.Oops.CommericalStock;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.Oops.JsonUtil;
import com.bridgelabz.Oops.QueueWithlink;
/*
 * Purpose:-To Buy And sell shareShock form company to person
 * Admin:-Rohan Kadam
 */
public class StockQueue {
	//buy shares
	public static int buyShares(int personCashAmount, int priceOfShares, int numberOfShares) {

		int total = priceOfShares * numberOfShares;
		System.out.println("Person has to pay Rs." + total);
		return (personCashAmount - total);
	}

	// sell shares
	public static int sellShares(int personCashAmount, int priceOfShares, int numberOfShares) {
		int total = priceOfShares * numberOfShares;
		System.out.println("Total amount available is." + (total + personCashAmount));
		LocalDate date = LocalDate.now(); 
	    System.out.println("the current date is "+ date); 
		return (personCashAmount + total);
		}
public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
	QueueWithlink<String> queue=new QueueWithlink<String>();//Queue
	Person person = new Person();
	Company company = new Company();
	ObjectMapper mapper = new ObjectMapper();
	File perFileObj = new File("/home/admin1/rohan/java/rohan/Bridgelabz_programs/person.json");// id,name,ShareQuantity,amount
	File compFileObj = new File("/home/admin1/rohan/java/rohan/Bridgelabz_programs/company.json");// price,company
																									// name,shareQuantity
	List<Person> personList = mapper.readValue(perFileObj, new TypeReference<List<Person>>() {});
	person = personList.get(0);
	System.out.println(person.toString());
	System.out.println(person);
	List<Company> companyList = mapper.readValue(compFileObj, new TypeReference<List<Company>>() {
	});
	company = companyList.get(0);
	String str="";
	for(int i=0;i<companyList.size();i++)
	{
		 str=companyList.get(i).toString();
		queue.engueu(str);
		}

	
	System.out.println("1.Buy Shares");
	System.out.println("2.sell Shares");
	System.out.println("Enter the choice:=");
	int ch = StockUtil.IntegerInput();
	if (ch == 1) {
		System.out.println("Enter the index of person");
		int index=StockUtil.IntegerInput();
		person = personList.get(index);
		System.out.println(person.toString());
		System.out.println("Enter the index of company");
		int index1=StockUtil.IntegerInput();
		company = companyList.get(index1);
		System.out.println(company.toString());
		
		System.out.println("How many shares want to buy?");
		int numberOfShares = StockUtil.IntegerInput();
		if (numberOfShares > Integer.parseInt(company.getShareQuanity())) {
			System.out.println(numberOfShares + " are not available in stock");
		} else {

			int amnt = buyShares(Integer.parseInt(person.getAmount()), Integer.parseInt(company.getPrice()),
					numberOfShares);
			String cash = Integer.toString(amnt);
			int availableShare = Integer.parseInt(company.getShareQuanity());
			availableShare = availableShare - numberOfShares;
			person.setAmount(cash);
			String shareStock = Integer.toString(availableShare);
			company.setShareQuanity(shareStock);
			int availableShare1 = Integer.parseInt(person.getShareQuantity());
			availableShare1 = availableShare1 + numberOfShares;

			String shareStock1 = Integer.toString(availableShare1);
			person.setShareQuantity(shareStock1);
		}
	} else if (ch == 2) {
		System.out.println("Enter the index of person");
		int index=StockUtil.IntegerInput();
		person = personList.get(index);
		System.out.println(person.toString());
		System.out.println("Enter the index of company");
		int index1=StockUtil.IntegerInput();
		company = companyList.get(index1);
		System.out.println(company.toString());
		System.out.println("How many shares want to sell?");
		int numberOfShares = JsonUtil.IntegerInput();
		if (numberOfShares > Integer.parseInt(person.getShareQuantity())) {
			System.out.println(numberOfShares + " are not available in stock");
		} else {
			int amnt = sellShares(Integer.parseInt(person.getAmount()), Integer.parseInt(company.getPrice()),
					numberOfShares);
			String cash = Integer.toString(amnt);
			int availableShare = Integer.parseInt(person.getShareQuantity());
			availableShare = availableShare - numberOfShares;
			person.setAmount(cash);
			String shareStock = Integer.toString(availableShare);
			person.setShareQuantity(shareStock);
			int availableShare1 = Integer.parseInt(company.getShareQuanity());
			availableShare1 = availableShare1 + numberOfShares;
			company.setPrice(cash);
			String shareStock1 = Integer.toString(availableShare1);
			company.setShareQuanity(shareStock1);
		}
	}

	StockUtil.writeObjectToJson(personList, "person.json");
	System.out.println(personList);
	StockUtil.writeObjectToJson(companyList, "company.json");
	System.out.println(companyList);


}
}
