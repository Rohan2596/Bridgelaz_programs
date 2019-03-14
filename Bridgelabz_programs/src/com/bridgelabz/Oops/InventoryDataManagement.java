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
			
			int weightValue = Integer.parseInt(weight);
			int priceValue = Integer.parseInt(price);
			
			System.out.println(name + " " + weight + " " + price);
			result = weightValue * priceValue;
			System.out.println("Total price:" + result);

		}

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

