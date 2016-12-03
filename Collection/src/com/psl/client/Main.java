package com.psl.client;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class Main {

	public static void main(String[] args) {
	
		
		
List<Person> person =new ArrayList<Person>();
person.add(new Person("fisrtname","lastname",Date.valueOf("2012-01-02")));
person.add(new Person("fisrtname2","lastname2",Date.valueOf("2013-1-06")));
person.add(new Person("fisrtname3","lastname3",Date.valueOf("2014-2-2")));

		for (Person person2 : person) {
			System.out.println(person2.getFirstName());
			System.out.println(person2.getDateOfBirth());
		}
		Iterator<Person> en=person.iterator();
		System.out.println("=======================");
	while ( en.hasNext()) {
		Person type =  en.next();
		System.out.println(type.getFirstName());
	}
	}

}
