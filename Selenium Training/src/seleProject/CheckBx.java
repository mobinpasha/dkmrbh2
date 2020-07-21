package seleProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.util.LazyList;

public class CheckBx {

	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP ELITEBOOK\\eclipse-workspace\\Selenium Training\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String url=("https://www.testandquiz.com/selenium/testing.html");
		driver.get(url);
		

		WebElement chbx = driver.findElement(By.className("Automation"));
		
		chbx.click();
		Thread.sleep(3000);
		
		WebElement chbx1 = driver.findElement(By.xpath("//input[@value='Performance']"));
				
		chbx1.click();
		Thread.sleep(3000);
		
		String url1=("https:/facebook.com");
		driver.get(url1);	
		
		List<WebElement>  chbx2 = driver.findElements(By.xpath("//input[@type='radio']"));
		
		System.out.println(chbx2.size());
			
					for (int i = 0; i <  v                chbx2.size(); i++)
					{
					System.out.println(chbx2.get(i));
					
					 chbx2.get(i).click();
					}
					Thread.sleep(3000);
		driver.quit();
					
	}
}
