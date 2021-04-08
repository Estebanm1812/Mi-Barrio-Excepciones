package model;

import java.util.ArrayList;
import java.util.List;

import exceptions.MinorAgeException;
import exceptions.NotAllowedDayException;

public class SuperMarket {

	public int tries;
	
	public ArrayList<Person> customers;
	
	public SuperMarket() {
		tries = 0;
		customers = new ArrayList<>();
	}
	public void letJoin(String document,String id, int day, int penultime)throws MinorAgeException, NotAllowedDayException {
		tries+=1;
		if(document.equals("TI")) {
		throw new MinorAgeException(id);
		}
		if( ((day%2!=0)&&(penultime%2==0))||((day%2==0)&&(penultime%2!=0))) {
		throw new NotAllowedDayException(day, penultime);	
		}
		Person c = new Person(document,id);
		customers.add(c);
		
	}
}
