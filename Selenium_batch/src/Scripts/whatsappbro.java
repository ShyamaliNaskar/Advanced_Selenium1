package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class whatsappbro {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	Thread.sleep(2000);
	driver.get("https://web.whatsapp.com/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[.='Link with phone number']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("6289361794");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[.='Next']")).click();
	Thread.sleep(2000);
	
}
}
