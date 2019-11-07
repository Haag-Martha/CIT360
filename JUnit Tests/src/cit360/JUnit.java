package cit360;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author martha
 *
 */

public class JUnit {

	//pass ints to the method and return sum
	public int addNumbers(int number1, int number2) {
		return number1+number2;	
	}
	
	//crate arraylist of 10 of the most populous cities in south yorkshire
	public List cityArray(){
	List<String> southYorkshire = new ArrayList<>();	
		return southYorkshire;
	}
	
	//method boolean for Junit
	public boolean greaterThan(int number1,int number2) {
		if (number1>number2){
			return true; 
		}else {
			return false;
		}
	}
	
	//hashmap of cities in south yorkshire and population (city as key)
	public String cityPop(final String key) {
		Map<String, String> cityPop = new HashMap<>();
		cityPop.put("Sheffield","518,090");
		cityPop.put("Doncaster","109,805");
		cityPop.put("Rotherham","109,691");
		cityPop.put("Barnsley","91,927");
		cityPop.put("Bentley","27,145");
		cityPop.put("Wombwell","23,335");
		cityPop.put("Chapeltown","23,056");
		cityPop.put("Dinnington","19,860");
		cityPop.put("Rawmarsh","18,498");
		cityPop.put("Holyland","17,710");
				
		return cityPop.get(key);
	}
	
	//create hashmap of the 5 best presidents of the US, the key will be their rank
	public String fiveBest(final String key) {
		Map<String,String> fiveBest=new HashMap<>();
		fiveBest.put("1","George Washington");
		fiveBest.put("2","Abraham Lincoln");
		fiveBest.put("3","Thomas Jefferson");
		fiveBest.put("4","Theodore Roosevelt");
		fiveBest.put("5","Franklin D. Roosevelt");
	
		return fiveBest.get(key);
	}
	
	//create hashmap of the 5 weirdest baby names in the US of 2019, key is their rank
	public String fiveWeirdest(final String key) {
		Map<String,String> fiveWeirdest=new HashMap<>();
		fiveWeirdest.put("1","Luna");
		fiveWeirdest.put("2","Lion");
		fiveWeirdest.put("3","Peridot");
		fiveWeirdest.put("4","Fawn");
		fiveWeirdest.put("5","Tanith");
	
		return fiveWeirdest.get(key);
	}

	
	//boolean again
	public boolean lessThan(int number1,int number2) {
		if (number1<number2){
			return true; 
		}else {
			return false;
		}
	}
	
}

