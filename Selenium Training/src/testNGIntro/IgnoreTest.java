package testNGIntro;

import org.testng.annotations.Test;

public class IgnoreTest {

	
	  @Test (enabled = false)
	  public void firstIgnore() {
		  System.out.println("Test 1");
	  }
	  
	  @Test 
	  public void secondIgnore() {
		  System.out.println("Test 2");
		    }
	  @Test 
	  public void thirdIgnore() {
		  System.out.println("Test 3");
	  }
	  
	  @Test 
	  public void fourthIgnore() {
		  System.out.println("Test 3");
	  }
	}


