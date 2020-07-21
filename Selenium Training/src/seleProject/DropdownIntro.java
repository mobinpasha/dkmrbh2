package seleProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownIntro {
	
	public static void main(String args []) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP ELITEBOOK\\eclipse-workspace\\Selenium Training\\driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
	
		String url=("https://www.facebook.com/");
		driver.get(url);
		
		WebElement dd = driver.findElement(By.id("month"));
		
		//cast web element into the select datatype
		
		//Select span= new Select(dd);
//**Select by Index
		//span.selectByIndex(8);
		
		//WebElement ee = driver.findElement(By.id("month"));
		
		//Select span = new Select(ee);
		
//**select by value
		//span.selectByValue("8");

//**select by Visible Text
		WebElement ff = driver.findElement(By.id("month"));
		
		Select span = new Select(ff);
	span.selectByVisibleText("Aug");
		Thread.sleep(3000);
		driver.quit();
		
		
	

	}
	

}
