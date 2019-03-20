package com.bridgelabz.Oops.CommericalStock;

public class Person {
//	private int id;
	private String name;
	private String shareQuantity;
	private String amount;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getShareQuantity() {
		return shareQuantity;
	}
	public void setShareQuantity(String shareQuantity) {
		this.shareQuantity = shareQuantity;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	

 public	Person(){}
//	public Person(String name,String amount,String ShareQuantity)
//	{
//		this.getName();
//		this.getShareQuantity();
//		this.getAmount();
//	}
	public String toString() {
		
      return  "Person [name=" + name + "," + "ShareQuantity=" + shareQuantity + "," + "cash=" + amount + "]";
	}
	
}
