package com.bridgelabz.Oops.AddressBook.services;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
/**
 * Purpose:-Creating of various interface which we going to use in our addresses book
 * @author Rohan Kadam
 *Date:-20/03/2019
 */
public interface IaddressBook {
public void createFile();
public void addPerson(String Name) throws JsonParseException, JsonMappingException, IOException;
public void search();
public void savefile();
public void closefile();
public void EditPerson() throws JsonParseException, JsonMappingException, IOException;
public void SaveAs() throws JsonParseException, JsonMappingException, IOException;
public void deletePerson() throws JsonParseException, JsonMappingException, IOException;
public void openfile() throws JsonParseException, JsonMappingException, IOException;
public void loadFileName();
public void sortbyName();
public void sortbyZipCode();
}
