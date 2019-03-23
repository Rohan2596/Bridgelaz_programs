package com.bridgelabz.Oops.AddressBook.Controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.Oops.JsonUtil;
import com.bridgelabz.Oops.AddressBook.services.AddressBookMethods;
import com.bridgelabz.Oops.AddressBook.services.IaddressBook;
/**
 * Purpose:-Contains Main Methods to performed various task
 * @author Rohan Kadam
 *Date:-20/03/2019
 */
public class AddressMain {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		IaddressBook implObj = new AddressBookMethods();
		implObj.loadFileName();
		do
		{
			System.out.println("1.Create");
			System.out.println("2.Open");
			System.out.println("3.Save");
			System.out.println("4.Close");
			System.out.println("5.Add a Person");
			System.out.println("6.Delete a Person");
			System.out.println("7.Edit a Person");
			System.out.println("8.Save as");
			System.out.println("9.Sort");
			System.out.println("10.Quit Program");
			System.out.println("Enter the Choice:=");
			int ch = JsonUtil.IntegerInput();
			switch(ch)
			{
				//Case 1 to create a File
				case 1:
						implObj.createFile();
						break;
				case 2:
						implObj.openfile();
						break;
				case 3:
						implObj.savefile();
						System.out.println("File is Saved!");
						break;
				case 4:
						implObj.closefile();
						break;	
				case 5 :
						System.out.println("Enter the File Name:=>");
						String fileName = JsonUtil.SingleStringInput();
						implObj.addPerson(fileName);
						implObj.sortbyName();
						break;
				case 6 :
						implObj.deletePerson();
						System.out.println("Person is Deleted!");
						break;
				case 7 :
							implObj.EditPerson();
							break;
				case 8 :
							implObj.SaveAs();
							break;
				case 9:
					System.out.println("1.SortbyName");
					System.out.println("2.SortbyZipCode");
					int ch1=JsonUtil.IntegerInput();
					switch(ch1) {
					case 1:
						implObj.sortbyName();
						System.out.println("PersonSorted");
						break;
					case 2:
						implObj.sortbyZipCode();
						System.out.println("PersonSorted");
						break;
					default:
						System.out.println("Invalid ");
					}
					break;
				case 10 :
					BufferedWriter bw = new BufferedWriter(new FileWriter(new File("maintainFileName.txt")));
					for(int i=0; i<AddressBookMethods.fileList.size(); i++) {
						bw.write(AddressBookMethods.fileList.get(i)+" ");
					}
						System.out.println("Program Quited!");
						return;
						
			}
		}while(true);
		
		
	}

}
