package testNGIntro;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


//setup

public class DataProviderIntro {
		
	@DataProvider(name = "address")
	public Object [][] method1() {
		return new Object [][] {
		 new Object[]{1},
//		 new Object[]{2},
//		new  Object[]{3},
//		new  Object[]{4},
	};
	}
  @Test(dataProvider="address")
  public void test1(int number) throws InterruptedException {
	//  System.out.println("object" +number);
	
  		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\HP ELITEBOOK\\\\eclipse-workspace\\\\Selenium Training\\\\driver\\\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		String url =("https://www.amazon.com/");
				driver.get(url);
		
		WebElement x1 = driver.findElement(By.id("twotabsearchtextbox"));
		x1.sendKeys("fan");
		
		WebElement a1 = driver.findElement(By.cssSelector("input[type='submit']"));
		a1.click();

		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		WebElement a2 = driver.findElement(By.xpath("//*[@id='search']/div[1]/div[2]/div/span[3]/div[2]/div[2]/div/span/div/div/div/div/div/div[1]"));
		//String prodpage=a2.getText();
		System.out.println("We are on Product Page");
		Assert.assertEquals(true, a2.isDisplayed());
		
		WebElement a3 = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[4]/div/span/div/div/div/div/div[2]/h2/a/span"));
		String pname = a3.getText();
				
		
		WebElement a4 = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[4]/div/span/div/div/div/div/div[4]/div/div/a/span/span[2]/span[2]"));
		String pprice = a4.getText();
			
		  System.out.println("Product "+pname +" 'Price': " +pprice);
		a4.click();
		
		WebElement a5 = driver.findElement(By.xpath("//*[@id=\'productTitle\']"));
		String pname1 = a5.getText();
		System.out.println(pname1);
  
		//WebElement a6 = driver.findElement(By.cssSelector(id="priceblock_ourprice" and class="a-size-medium a-color-price priceBlockBuyingPriceString"));
		
//		if(pname.equalsIgnoreCase(pname1))
//		{
		Assert.assertEquals(pname, pname1);	
//		}
		
//		Assert.assertEquals(pname1, "AmazonBasics Oscillating 3 Speed Tower Fan with Remote");	
		
		
		Thread.sleep(3000);
		driver.quit();		
  }
  
 	}

