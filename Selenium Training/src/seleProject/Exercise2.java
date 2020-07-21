package seleProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise2 {

	public static void main(String args []) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP ELITEBOOK\\eclipse-workspace\\Selenium Training\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.amazon.com/";
		
		driver.get(url);
		
		WebElement a = driver.findElement(By.cssSelector("input[id ='twotabsearchtextbox']"));
		
		a.sendKeys("fan");
	
		WebElement a1 = driver.findElement(By.cssSelector("input[type='submit']"));
		a1.click();
		
		
//		WebElement a2 = driver.findElement(By.id("a-autoid-0-announce"));
//		a2.click();

//		List <WebElement> pricerange = driver.findElements(By.xpath("//*[@id=\"a-popover-4\"]/div/div"));
//
//		for (WebElement x: pricerange) {
//		
//		String pr = x.getText();
//		System.out.println(pr);
//		if (pr.equalsIgnoreCase("Price: High to Low"))
//		{
//			x.click();
//		}
		//*[@id="brandsRefinements"]/ul
		//*[@id="p_89/Lasko"]
		//*[@id="p_89/Honeywell"]/span/a/div/label/input
		//*[@id="brandsRefinements"]
		//html/body/div[1]/div[2]/div[1]/div[1]/div/div[3]/span/div/span/div/div/div[5]
		List <WebElement> brand = driver.findElements(By.xpath("//*[@id='p_89/Lasko']"));

		for (WebElement x1: brand) {
			x1.getSize();
			String br = x1.getText();
			System.out.println(br);
			Thread.sleep(3000);
			if(br.equalsIgnoreCase("Lasko")) {
			x1.click();
			Thread.sleep(5000);
			}
			else
			{
				System.out.println("not found");
			}
		}
			driver.quit();
	}
}	
	//	List<WebElement> brand = driver.findElement(By.xpath(xpathExpression));
		
		
		



