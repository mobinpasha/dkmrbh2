package seleProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RdBtn {

	public static void main(String args []) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP ELITEBOOK\\eclipse-workspace\\Selenium Training\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		String url = ("https://facebook.com");
		driver.get(url);

List <WebElement> = driver.findElements(By.xpath("//"))
	}
}
