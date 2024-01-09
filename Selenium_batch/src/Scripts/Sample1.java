package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample1 {
public static void main(String[] args)throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/Shyamali%20Naskar/OneDrive/Desktop/Sample2.html");
	Thread.sleep(2000);
	driver.findElement(By.id("user")).sendKeys("Shyamali Naskar");
	Thread.sleep(2000);
	driver.findElement(By.id("linka")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[class='_2IX_2- VJZDxU']")).sendKeys("6289361794");
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("button[class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
}
}
