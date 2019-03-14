package com.bridgelabz.Oops;

import java.io.IOException;
import java.util.Scanner;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonUtil {
private static ObjectMapper mapper;
static {
	mapper=new ObjectMapper();
}
public static String convertJavaToJson(Object object) {
	String jsonResult="";
	
	 try {
		jsonResult=mapper.writeValueAsString(object);
	} catch (JsonGenerationException e) {
		System.out.println("Exception occured while converting Java Object into Json"+e.getMessage());
		
	} catch (JsonMappingException e) {
		System.out.println("Exception occured while converting Java Object into Json"+e.getMessage());
	} catch (IOException e) {
		System.out.println("Exception occured while converting Java Object into Json"+e.getMessage());
	}
	return jsonResult;
}
public static <T>  T covertJsontoJava(String jsonString,Class<T> cls) {
	T result =null;
	try {
		result=mapper.readValue(jsonString, cls);
	} catch (JsonParseException e) {
		System.out.println("Exception Occured while converting the json to java"+e.getMessage());
		
	} catch (JsonMappingException e) {
		System.out.println("Exception Occured while converting the json to java"+e.getMessage());
	} catch (IOException e) {
		System.out.println("Exception Occured while converting the json to java"+e.getMessage());
	}
return result;
}
public static String SingleStringInput() {
	Scanner scanner =new Scanner(System.in);
//    System.out.println("Enter the Single String Input");
	String string = scanner.nextLine();
	return string ;
}
public static int IntegerInput() {
	Scanner scanner =new Scanner(System.in);
    System.out.println("Enter the Single String Input");
	int Integer = scanner.nextInt();
	return Integer ;
}
public static double doubleInput() {
	Scanner scanner =new Scanner(System.in);
    System.out.println("Enter the Single String Input");
	double DoubleInput = scanner.nextDouble();
	return DoubleInput;
}

}
