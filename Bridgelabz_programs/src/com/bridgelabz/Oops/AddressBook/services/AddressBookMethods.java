package com.bridgelabz.Oops.AddressBook.services;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.Oops.JsonUtil;
import com.bridgelabz.Oops.AddressBook.model.Person;
/**
 * Purpose:-AddressMethods such as add,delete,create file etc.
 * @author Rohan Kadam
 *Date:-20/03/2019
 */
public  class AddressBookMethods implements IaddressBook{
	int personListIndex = 0;
	ObjectMapper objectMapper = new ObjectMapper();
	public static List<String> fileList = new ArrayList<>();
	List<Person> personArrayList = new ArrayList<>();
	ObjectMapper mapper= new ObjectMapper();
	public void loadFileName() {
		try {
		BufferedReader br = new BufferedReader(new FileReader(new File("maintainFileName.txt")));
		String temp;
		while((temp = br.readLine()) != null) {
			String tm[] = temp.split(" ");
			for(int i=0; i<tm.length; i++) {
				fileList.add(tm[i]);
			}
		}
		System.out.println(fileList);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void createFile() {
		System.out.println("Enter the File Name:=>");
		String fileName = JsonUtil.SingleStringInput();
		String path = fileName + ".json";
		try {
			File file = new File(path);
			boolean created = file.createNewFile();
			if (created) {
				System.out.println("File has been created successfully");
			} else {
				System.out.println("File already present at the specified location");
			}
		} catch (IOException e) {
			System.out.println("Exception Occurred:");
			e.printStackTrace();
		}
		fileList.add(fileName);
	}
	
public  void addPerson(String fileName) throws JsonParseException, JsonMappingException, IOException {
		
			File personFileObject = new File(fileName + ".json");
			if (personFileObject.length() == 0) {
				Person p = new Person();
				System.out.println("Enter the Name:=>");
				p.setName(JsonUtil.SingleStringInput());
				// setting address of a person
				System.out.println("Enter the Address:=>");
				p.setAddress(JsonUtil.SingleStringInput());
				// setting phone number of a person
				System.out.println("Enter the phone Number:=>");
				p.setPhNumber(JsonUtil.SingleStringInput());
				System.out.println("Person details:=>");
				System.out.println(p);
				// ArrayList personArrayList = new ArrayList();
				personArrayList.add(p);
				// JsonUtil.writeObjectToJson(personArrayList, fileName+".json");
				System.out.println(personArrayList);
			} 
			else 
			{
				List<Person> personFileList = objectMapper.readValue(personFileObject, new TypeReference<List<Person>>() {});
//				personArrayList.add((Person) personFileList);
				personArrayList.addAll(personFileList);
				Person p = new Person();
				System.out.println("Enter the Name:=>");
				p.setName(JsonUtil.SingleStringInput());
				// setting address of a person
				System.out.println("Enter the Address:=>");
				p.setAddress(JsonUtil.SingleStringInput());
				// setting phone number of a person
				System.out.println("Enter the phone Number:=>");
				p.setPhNumber(JsonUtil.SingleStringInput());
				System.out.println("Person details:=>");
				System.out.println(p);
				personArrayList.add(p);
				System.out.println(personArrayList);
			}
		}
	
public void savefile() {
	System.out.println("Saving the file");
	System.out.println("Saving the Person");
	System.out.println("Enter the File name to Save:=>");
	String fileName = JsonUtil.SingleStringInput();
	System.out.println(personArrayList);
    JsonServices.writeObjectToJson(personArrayList, fileName + ".json");
    personArrayList.clear();
}
@Override

public void openfile() throws JsonParseException, JsonMappingException, IOException {
	System.out.println("Opening the file");
	
	System.out.println(fileList);
	System.out.println("Enter File Name to open:=>");
	String fileName = JsonUtil.SingleStringInput();
	fileName = fileName + ".json";
	File personFileObject = new File(fileName);
	List<Person> fileList = objectMapper.readValue(personFileObject, new TypeReference<List<Person>>() {});
	System.out.println("File is Opened!");
	System.out.println(fileList.size() + " Persons are There!");
	for (int i = 0; i < fileList.size(); i++) {
		System.out.println(fileList.get(i));
	}
}


public void closefile() {
	System.out.println("Closing the file");
}
public void EditPerson() throws JsonParseException, JsonMappingException, IOException {
	System.out.println("Editting Person ");
	System.out.println("Enter File Name From Which person has to be Edited:=>");
	String fileName = JsonUtil.SingleStringInput();
	fileName = fileName+".json";
	File personFileObject = new File(fileName);
	if(personFileObject.length()==0)
	{
		System.out.println("File is Empty!");
	}
	else
	{
		System.out.println("Enter Name of Person to be Edited");
		String name = JsonUtil.SingleStringInput();
		List<Person> personFileList = objectMapper.readValue(personFileObject, new TypeReference<List<Person>>() {});
		personArrayList.addAll(personFileList);
		System.out.println(personArrayList);
		for(int i=0;i<personArrayList.size();i++)
		{
			if(name.equals(((Person) personArrayList.get(i)).getName()))
			{	
				System.out.println("1.Name");
				System.out.println("2.Address");
				System.out.println("3.Phone Number");
				System.out.println("Enter Choice What You Have to Edit?");
				int ch = JsonUtil.IntegerInput();
				switch(ch)
				{
					case 1:
							System.out.println("Enter Name to Replace:=>");
							String nameToReplace = JsonUtil.SingleStringInput();
							personArrayList.get(i).setName(nameToReplace);
							break;
					case 2:
							System.out.println("Enter Address to Replace:=>");
							String addressToReplace = JsonUtil.SingleStringInput();
							personArrayList.get(i).setAddress(addressToReplace);
							break;
					case 3:
							System.out.println("Enter Address to Replace:=>");
							String phNumberToReplace = JsonUtil.SingleStringInput();
							personArrayList.get(i).setPhNumber(phNumberToReplace);
							break;
				}
				break;
			}	
			else
			{
				System.out.println("Person Not Found!");
			}
		}
		
	}	

}

public void SaveAs() throws JsonParseException, JsonMappingException, IOException {
	System.out.println("Enter the File Name:=>");
	String fileName = JsonUtil.SingleStringInput();
	String path = fileName + ".txt";
	boolean created =false;
	try
	{
		File personTextFileObject = new File(path);
		created =  personTextFileObject.createNewFile();
	} 
	catch (IOException e)
	{
		System.out.println("Exception Occurred:");
		e.printStackTrace();
	}
	if (created)
		try {
			{
				fileList.add(fileName);
				File personJsonFileObject = new File(fileName+".json");
				List<Person> personFileList = objectMapper.readValue(personJsonFileObject,new TypeReference<List<Person>>() {});
				JsonServices.writeObjectToJson(personFileList, path);
				System.out.println("File has been created successfully");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	else {
		System.out.println("File already present at the specified location");
	}
	

}



@Override
public void deletePerson() throws JsonParseException, JsonMappingException, IOException {
	System.out.println("Enter the Person to delete");
	String fileName=JsonUtil.SingleStringInput();
	String path=fileName+".json";
	File personObject=new File(path);
	if(personObject.length()==0) {
		System.out.println("file is empty");
	}
	else {
		personArrayList.clear();
		personArrayList=objectMapper.readValue(personObject,new TypeReference<List<Person>>() {});
		System.out.println("Enter the patient to delete");
		String name=JsonUtil.SingleStringInput();
		for(int i=0;i<personArrayList.size();i++) {
			if(name.equals(((Person)personArrayList.get(i)).getName())) {
				
				personArrayList.remove(i);
				break;
			}
		}
	JsonServices.writeObjectToJson(personArrayList, fileName+".json");
	
	}
}


}
	
	

