package model;

import java.util.ArrayList;

import exceptions.MinorAgeException;
import exceptions.NotAllowedDayException;

public class SuperMarket {

	public int tries;
	
	public ArrayList<Person> customers;
	
	public SuperMarket() {
		tries = 0;
		customers = new ArrayList<Person>();
	}
	public boolean letJoin(String document,String id, int day, int penultime)throws MinorAgeException, NotAllowedDayException {
		boolean joined = false;
		tries+=1;
		if(document.equals("TI")) {
		throw new MinorAgeException(id);
		}
		if( ((day%2==0)&&(penultime%2==0))||((day%2!=0)&&(penultime%2!=0))) {
		throw new NotAllowedDayException(day, penultime);	
		}
		Person c = new Person(document,id);
		customers.add(c);
		joined = true;
		return joined;
	}
	public int getTries() {
		return tries;
	}
}
