package com.bridgelabz.Oops;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
/**
 * Purpose:- To print stock Report for particular companies 
 * @author Rohan Kadam
 *Date:-19/03/2019
 */
public class StockReport3 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String Path="/home/admin1/rohan/java/rohan/Bridgelabz_programs/src/com/bridgelabz/Oops/stock.json";
		//Creating file path object
		File file=new File(Path);
		ObjectMapper mapper=new ObjectMapper();
		try {
			//creating tree of properties
			JsonNode rootNode=mapper.readTree(file);
			JsonNode inventory=rootNode.get("Stock");
			//creating the node for sub properties
			System.out.println("======Stocks======");
			for(JsonNode node:inventory) {
				String name=node.path("Stock_Name").asText();
				int  share=node.path("Number_of_shares").asInt();
				int price=node.path("Share_Prize").asInt();

				System.out.println("Name:"+name+"\nPrice: "+price+"\nShare: "+share);
				System.out.println("total: "+price*share+" Rs"+"\n");	
			}
		}catch(IOException e) {
			System.out.println(" "+e.getMessage());
			e.printStackTrace();
		}
		

	}

}
