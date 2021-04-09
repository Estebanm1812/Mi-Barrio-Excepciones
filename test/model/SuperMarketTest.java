package model;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.SuperMarket;
import exceptions.MinorAgeException;
import exceptions.NotAllowedDayException;

class SuperMarketTest {

	private String document;
	
	private int penultimate;
	
	private int day;
	
	private String id;
	
	private SuperMarket market;
	
	private void setupScenary1() {
		
		document = "CC";
		penultimate = 4;
		day = 7;
		id = "23132141342";
		market = new SuperMarket();
	}
	private void setupScenary2() {
		
		document = "TI";
		penultimate = 4;
		day = 7;
		id = "23132141342";
		market = new SuperMarket();
	}
	private void setupScenary3() {
		
		document = "CC";
		penultimate = 3;
		day = 7;
		id = "2313214132";
		market = new SuperMarket();
	}
	@Test
	public void testLetJoin() {
		setupScenary1();
		try {
			
			market.letJoin(document, id, day, penultimate);
			assertTrue( "",market.letJoin(document, id, day, penultimate) );
		} catch(MinorAgeException mae){
			fail("Not MinorAgeException expected");
		}catch(NotAllowedDayException nade) {
			fail("not NotAlloweDayException expected");
		}
	}
	@Test
	public void testLetJoin2(){
		setupScenary2();
		boolean answer = false;
		try {
		answer = market.letJoin(document, id, day, penultimate);
			fail();
		}catch(MinorAgeException mae) {
			assertFalse(answer , "minors cant go inside");
		}catch(NotAllowedDayException nade) {
			
		}
	}
	@Test
	public void testLetJoin3(){
		setupScenary3();
		boolean answer = false;
		try {
			answer = market.letJoin(document, id, day, penultimate);
			fail();
		}catch(MinorAgeException mae) {
			
		}catch(NotAllowedDayException nade) {
			assertFalse(answer, "not allowed day to enter");
		}
		
	}
	
}



