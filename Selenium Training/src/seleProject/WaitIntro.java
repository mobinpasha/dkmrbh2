package seleProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitIntro {

	public static void main(String args []) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP ELITEBOOK\\eclipse-workspace\\Selenium Training\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String url="https://mu.ac.in/";
		driver.get(url);
		driver.findElement(By.linkText("HOME")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//WebElement a = driver.findElement(By.linkText("ABOUT US")).click();
		
		driver.findElement(By.linkText("ABOUT US")).click();
		
		driver.close();
	}
}

