package seleProject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertIntro {

	public static void main(String args []) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP ELITEBOOK\\eclipse-workspace\\Selenium Training\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		String url = "https://www.testandquiz.com/selenium/testing.html";
		driver.get(url);
		
		WebElement a = driver.findElement(By.xpath("/html/body/div/div[11]/div/p/button"));

		WebElement a = driver.findElement(By.xpath()))))
		Alert a1 = driver.switchTo().alert();

		a1.accept();
		
		//a.click();
		
		Thread.sleep(3000);

		driver.quit();
	}
}
