package seleProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorIntro {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP ELITEBOOK\\eclipse-workspace\\Selenium Training\\driver\\chromedriver.exe");
		
	WebDriver  driver = new ChromeDriver();
	
	
		String url = "https://www.testandquiz.com/selenium/testing.html";
		driver.get(url);
	
		WebElement a = driver.findElement(By.id("fname"));
		
		a.sendKeys("ASAK");
		Thread.sleep(5000);
		
		WebElement c = driver.findElement(By.cssSelector("input[id='fname']"));
		 c.clear();
		 c.sendKeys("id fname");
		 Thread.sleep(2000);
			WebElement d = driver.findElement(By.cssSelector("input[name='firstName']"));
			 d.clear();
			 d.sendKeys("firstName");
			 Thread.sleep(2000);
				WebElement e = driver.findElement(By.cssSelector("input[type*='xt']"));
				 e.clear();
				 e.sendKeys("contains xt");
				 
				 WebElement f = driver.findElement(By.cssSelector("input[type^='te']"));
				 f.clear();
				 f.sendKeys("starts with te");
				 Thread.sleep(2000);
				 
				 WebElement g = driver.findElement(By.cssSelector("input[name$='me']"));
				 g.clear();
				 g.sendKeys("ends with me");
				 Thread.sleep(2000);
				 
								 
				 
				
					WebElement h = driver.findElement(By.xpath("//*[@name='firstName']"));
							// h.clear();
							 //h.sendKeys("xpath absolute");
							
							 Thread.sleep(2000);
					
					WebElement j= driver.findElement(By.xpath("//*[@type='text' and @name='firstName']"));
					
		WebElement b= driver.findElement(By.linkText("This is a link"));
		b.click();
		
		//Thread.sleep(2000);
		
		 
		
		//driver.close();
		driver.quit();
}
}
