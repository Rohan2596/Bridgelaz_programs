package com.bridgelabz.Oops;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
/*
 * Purpose:- DataMangement of Various grains
 * Author:-Rohan Kadam
 * Date:-20/03/2019
 * 
 */
public class DataManagement {
	
	private static String path="/home/admin1/rohan/java/rohan/Bridgelabz_programs/src/com/bridgelabz/Oops/abc.json";
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
//			String Path="/home/admin1/rohan/java/rohan/Bridgelabz_programs/src/com/bridgelabz/Oops/abc.json";
			File file=new File(path);
			
			//Printing for various INVENTORY OF GRAINS
			//Object Mapper
			ObjectMapper mapper=new ObjectMapper();
			try {
				JsonNode rootNode=mapper.readTree(file);
				JsonNode inventory=rootNode.get("Rice");
				System.out.println("=====RICE=====");
				for(JsonNode node:inventory)
				{
					//System.out.println(""+node);
					String name=node.path("name").asText();
					int price=node.path("price").asInt();
					int weight=node.path("weight").asInt();
					
					System.out.println("Name:"+name+"\nPrice: "+price+"\nWeight: "+weight);
					System.out.println("total: "+price*weight+" Rs"+"\n");
				}
				JsonNode inventory1=rootNode.get("Pulses");
				
				System.out.println("====PULSES====");
				for(JsonNode node:inventory1)
				{
					//System.out.println(""+node);
					String name=node.path("name").asText();
					int price=node.path("price").asInt();
					int weight=node.path("weight").asInt();
					
					System.out.println("Name:"+name+"\nPrice: "+price+"\nWeight: "+weight);
					System.out.println("total: "+price*weight+" Rs"+"\n");
				}
				
				JsonNode inventory2=rootNode.get("Wheat");
				System.out.println("====WHEAT====");
				for(JsonNode node:inventory2)
				{
					//System.out.println(""+node);
					String name=node.path("name").asText();
					int price=node.path("price").asInt();
					int weight=node.path("weight").asInt();
					
					System.out.println("Name:"+name+"\nPrice: "+price+"\nWeight: "+weight);
					System.out.println("total: "+price*weight+" Rs"+"\n");
				}
			
			} catch (IOException e) {
				System.out.println(""+e.getMessage());		
				e.printStackTrace();
			}
		
	}
}

