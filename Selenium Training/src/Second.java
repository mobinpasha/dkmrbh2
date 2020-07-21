
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Second {


	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/HP ELITEBOOK/eclipse-workspace/Selenium Training/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.facebook.com/";
		driver.get(url);
		String pageTitle="Facebook";
		
		//get title
		if(driver.getTitle().contains(pageTitle))
		{
		System.out.println("This is correct");
		}
		else
		{
			System.out.println("This is wrong");
		}
		//Thread.sleep(5000);
		
		driver.quit();
	}
}

