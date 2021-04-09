package test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import exceptions.MinorAgeException;
import exceptions.NotAllowedDayException;
import model.SuperMarket;

public class SuperMarketTest {

	private String document;
	
	private int penultimate;
	
	private int day;
	
	private String id;
	
	private SuperMarket market;
	
	private void setupScenary1() {
		
		document = "CC";
		penultimate = 3;
		day = 7;
		id = "2313214132";
	}
	private void setupScenary2() {
		
		document = "TI";
		penultimate = 4;
		day = 7;
		id = "2313214132";
	}
	private void setupScenary3() {
		
		document = "TI";
		penultimate = 3;
		day = 7;
		id = "2313214132";
	}
	@Test
	public void testLetJoin() {
		setupScenary1();
		try {
			
			boolean answer = market.letJoin(document, id, day, penultimate);
			assertTrue ( "",market.letJoin(document, id, day, penultimate) );
		} catch(MinorAgeException mae){
			fail("Not MinorAgeException expected");
		}catch(NotAllowedDayException nade) {
			fail("not NotAlloweDayException expected");
		}
	}
	
}
