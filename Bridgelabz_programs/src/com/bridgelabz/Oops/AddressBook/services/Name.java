package com.bridgelabz.Oops.AddressBook.services;

import java.util.Comparator;


import com.bridgelabz.Oops.AddressBook.model.Person;

public class Name implements Comparator<Person>{



	@Override
	public int compare(Person n1, Person n2) {
		if (n1.getName().hashCode()< n2.getName().hashCode()) return -1; 
        if (n1.getName().hashCode() > n2.getName().hashCode()) return 1; 
        else return 0;
	}

}
