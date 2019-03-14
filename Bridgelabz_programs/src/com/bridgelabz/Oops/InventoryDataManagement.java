package com.bridgelabz.Oops;

import java.io.FileReader;
import java.io.IOException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class InventoryDataManagement {
	public static void details(JSONObject obj, String Invent) {
		JSONArray objRoot = (JSONArray) obj.get(Invent);
		int result = 0;
		for (int i = 0; i < objRoot.size(); i++) {
			String weight = "";
			String price = "";

			JSONObject objRoot1 = (JSONObject) objRoot.get(i);
			String name = (String) objRoot1.get("name");
			
			weight = (String) objRoot1.get("weight");
			price = (String) objRoot1.get("price");
			
			int weightValue = Integer.valueOf(weight);
			int priceValue = Integer.valueOf(price);
			
			System.out.println(name + " " + weight + " " + price);
			result = weightValue * priceValue;
			
			System.out.println("Total price:" + result);

		}
		// System.out.println((weight*price));
	}

	public static void main(String[] args)
			throws JsonParseException, JsonMappingException, IOException, org.json.simple.parser.ParseException {
		String path = "/home/admin1/java/java/Bridgelabz_programs/src/com/bridgelabz/Oops/abc.json";
		JSONParser parser = new JSONParser();
		JSONObject obj = (JSONObject) parser.parse(new FileReader(path));
		System.out.println("Enter the inventory you want");
		String Invent = JsonUtil.SingleStringInput();
		details(obj, Invent);

	}
}

//
//
//public static void main(String[] args) throws IOException, ParseException
//{
//	String path = "/home/admin1/eclipse-workspace/nikhiljain/abc.json";
//	JSONParser parser = new JSONParser();
//	JSONObject obj = (JSONObject) parser.parse(new FileReader(path));
//	String inventory = UtilityMethods.stringInput("enter the inventory you want to search for: ");
//	System.out.println();
//	getDetails(obj, inventory);
//}
//
//public static void getDetails(JSONObject obj, String inventory) 
//{
//	JSONArray jArray = (JSONArray) obj.get(inventory);
//	Iterator<?> it = jArray.iterator();
//
//	String str = "";
//	long result = 0;
//	long quantity = 0;
//	System.out.println("Inventory searched: " + inventory + "\n");
//	System.out.println(inventory.toUpperCase() + " Type\t\t\tPrice(in Rs.) \t\tWeight(in Kg.)\n");
//	while(it.hasNext())
//	{
//		JSONObject food = (JSONObject) it.next(); 
//		String name = (String) food.get("name");
//		long price = (long) food.get("price");
//		long weight = (long) food.get("weight");
//		
//		String foodName = "Name : " + name;
//		String foodPrice = "Price : " + price;
//		String foodWeight = "Weight : " + weight;
//		str = str + foodName + "\t\t" + foodPrice + "\t\t" + foodWeight + "\n";
//		
//		result = result + price * weight;
//		quantity = quantity + weight;
//	}
//	
//	System.out.println(str);
//	System.out.println("Total Weight:\t" + quantity + " Kg.");
//	System.out.println("Total Price:\t" + result + " Rs.\n");
//}
//}