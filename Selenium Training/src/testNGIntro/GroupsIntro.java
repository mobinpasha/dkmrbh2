package testNGIntro;

import org.testng.annotations.Test;

public class GroupsIntro {

	@Test (groups = {"a"})
	  public void firstGroup() {
		  System.out.println("Test 1");
	  }
	  
	  @Test (groups = {"a"})
	  public void secondGroup() {
		  System.out.println("Test 2");
	}
	  @Test (groups = {"b"})
	  public void thirdGroup() {
		  System.out.println("Test 3");
	  }
	  
	  @Test (groups = {"b"})
	  public void fourthGroup() {
		  System.out.println("Test 4");
	  }
}
