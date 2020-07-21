package seleProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\HP ELITEBOOK\\eclipse-workspace\\Selenium Training\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String url = "www.facebook.com/";
		driver.get(url);
		
		driver.quit();
	}
}
