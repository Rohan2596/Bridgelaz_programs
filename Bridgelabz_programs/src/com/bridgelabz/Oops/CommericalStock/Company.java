package com.bridgelabz.Oops.CommericalStock;
/**
 * purpose:-Company Pojo class
 * @author admin1
 *
 */
public class Company {
	private String price;
	private String companyname;
	private String shareQuanity;
    
	 public Company()
	{
		
	}
	
	
	public String toString() {
		
		
      return "company [name=" + companyname+ ", sharePrice=" + price + ", shareStock=" +  shareQuanity + "]" ;
	}
	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}


	public String getCompanyname() {
		return companyname;
	}


	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}


	public String getShareQuanity() {
		return shareQuanity;
	}


	public void setShareQuanity(String shareQuanity) {
		this.shareQuanity = shareQuanity;
	}

	

}
