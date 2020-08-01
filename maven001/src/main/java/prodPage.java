import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class prodPage extends openPage {

	WebElement prpage = driver.findElement(By.id("a-autoid-0-announce"));
    sysout.out.println("We are in prod page");
    
}