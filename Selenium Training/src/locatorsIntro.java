import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsIntro {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:/Users/HP ELITEBOOK/eclipse-workspace/Selenium Training/driver/chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				//				String url = "https:/www.testandquiz.com/selenium/testing.html";
				String url = "https://www.kroger.com/";
				driver.get(url);
				
				
				
				//locate by id
				
			//	driver.findElement(By.id("fname"));
				
				//WebElement s = driver.findElement(By.id("fname")); 
				//s.sendKeys("Syed");
				//WebElement s1 = driver.findElement(By.className("className"));
				//WebElement s2 = driver.findElement(By.tagName("Script"));
				// WebElement s2 = driver.findElement(By.linkText("This is"));
				
				  driver.findElement(By.partialLinkText("kds-Link"));
				 //s.click();
				
				Thread.sleep(5000);
				driver.quit();
	}
}
