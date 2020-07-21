package MavenIntro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class homePage {

	public void openPage() {
		System.setProperty("webdriver.driver.chromedriver", "\"C:\\\\Users\\\\HP ELITEBOOK\\\\eclipse-workspace\\\\Selenium Training\\\\driver\\\\chromedriver.exe\"");
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.amazon.com/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.quit();
	}
	
}
