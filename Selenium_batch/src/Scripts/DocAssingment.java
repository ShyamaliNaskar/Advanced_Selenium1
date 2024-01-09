package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DocAssingment {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	Thread.sleep(2000);
	driver.get("file:///C:/Users/Shyamali%20Naskar/OneDrive/Desktop/frame_automation/home.html");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Shyamali");
	Thread.sleep(2000);
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("snaskar939@gmail.com");
	Thread.sleep(2000);
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//input[@placeholder='Phone']")).sendKeys("3421578609");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@placeholder='Phone']")).clear();
	Thread.sleep(2000);
	driver.switchTo().parentFrame();
	driver.findElement(By.xpath("//input[@placeholder='Email']")).clear();
	Thread.sleep(2000);
	driver.switchTo().parentFrame();
	driver.findElement(By.xpath("//input[@placeholder='Username']")).clear();
}
}
