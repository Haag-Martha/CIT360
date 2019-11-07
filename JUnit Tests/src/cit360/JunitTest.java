package cit360;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class JunitTest {
	//test to see if result matches (expected/actual)
	@Test
	void addingTest() {
		JUnit JUnit = new JUnit();
		int expected =12;
		int actual= JUnit.addNumbers(4, 8);
		assertEquals(expected, actual);
	}

	//make sure Array is what it should be (10 most populated cities in south Yorkshire)
	@Test
	void cityArray() {
		String[] expected= {"Sheffield","Doncaster","Rotherham","Barnsley","Bentley",
				"Wombwell","Chapeltown","Dinnington","Rawmarsh","Holyland"};
		String[] actual={"Sheffield","Doncaster","Rotherham","Barnsley","Bentely",
				"Wombwell","Chapeltown","Dinnington","Rawmarsh","Holyland"};
		assertArrayEquals(expected,actual);
	}
	
	//new instance of Junit boolean return must be false
	@Test
	void greaterThan() {
		JUnit JUnitboolean= new JUnit();
		assertFalse(JUnitboolean.greaterThan(3,4));
	}
	
	//create new instance of JunitHashMap, make sure keys have value
	@Test
	void cityPop() {
		JUnit JUnitHashMap= new JUnit();
		assertNotNull(JUnitHashMap.cityPop("Doncaster"));
	}
	
	//create new instance of fiveBest for the five best presidents
	//make sure each key references a different object
	@Test
	void fiveBest() {
		JUnit JUnitBest= new JUnit();
		assertNotSame(JUnitBest.fiveBest("George Washington"),JUnitBest.fiveBest("Abraham Lincloln"));
	}
	
	@Test
	void fiveWeirdest() {
		JUnit JUnitWeirdest= new JUnit();
		assertNotSame(JUnitWeirdest.fiveWeirdest("Luna"), JUnitWeirdest.fiveWeirdest("Lion"));
	}
	
	//JUnit less than boolean 
	@Test
	void lessThan() {
		JUnit JUnitlessThanboolean= new JUnit();
		assertTrue(JUnitlessThanboolean.lessThan(3,4));
	}
	
	//make sure two are the same
	void hello() {
		assertThat("Hello",is("Hello"));
	}
}