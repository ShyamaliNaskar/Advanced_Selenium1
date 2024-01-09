package Scripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipkartAssignment {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='✕']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[.='APPLE iPhone 13 (Starlight, 128 GB)']")).click();
	Thread.sleep(2000);
	String pid = driver.getWindowHandle();
	Set<String> allids = driver.getWindowHandles();
	allids.remove(pid);
	for(String e:allids)
	{
		driver.switchTo().window(e);
	}
	driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
	Thread.sleep(2000);
	driver.switchTo().window(pid);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[.='Cart']")).click();
	Thread.sleep(2000);
	
	
	
	//System.out.println("Hello");
}
}


      

