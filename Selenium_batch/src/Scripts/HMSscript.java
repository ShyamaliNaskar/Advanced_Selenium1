package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class HMSscript {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("http://106.51.87.42:9007/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("aunty@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345678");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("")).click();
}
}
