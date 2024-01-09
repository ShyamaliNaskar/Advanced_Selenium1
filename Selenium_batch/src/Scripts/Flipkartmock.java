package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkartmock {
public static void main(String[] args) throws InterruptedException{
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
}
}
