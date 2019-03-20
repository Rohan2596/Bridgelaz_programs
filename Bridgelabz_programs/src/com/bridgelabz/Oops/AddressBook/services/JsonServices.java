package com.bridgelabz.Oops.AddressBook.services;
import java.io.File;
import java.util.List;
import org.codehaus.jackson.map.ObjectMapper;
public class JsonServices {
	public static void writeObjectToJson(List list, String fileName)
	{
		Object[] arr = list.toArray(); 
		ObjectMapper om = new ObjectMapper();
		try 
		{
			//om.writeValue(new FileWriter(fileName,true), arr);
			om.writeValue(new File(fileName), arr);
		}
		catch(Exception e) 
		{
			e.printStackTrace();
}}}
