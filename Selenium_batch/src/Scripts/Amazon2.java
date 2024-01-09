package Scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon2 {
	public static void main(String[] args) throws InterruptedException {	
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	Thread.sleep(2000);	
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	List<WebElement> links = driver.findElements(By.xpath("//a"));	
	System.out.println(links);
	driver.close();
	}
}
