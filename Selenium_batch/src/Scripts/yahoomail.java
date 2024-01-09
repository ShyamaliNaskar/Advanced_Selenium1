package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class yahoomail {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.yahoo.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Sign in']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("naskarshy939@yahoo.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='login-signin']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='login-passwd']")).sendKeys("shy9393$");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@id='login-signin']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@id='root_1']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Compose']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='message-to-field']")).sendKeys("i.nikhita@yahoo.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@data-test-id='compose-subject']")).sendKeys("Normal");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@data-test-id='rte']")).sendKeys("Hi, how are you??");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@data-test-id='compose-send-button']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//label[@id='ybarAccountMenuOpener']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Sign out']")).click();
	driver.close();
	WebDriver driver1=new FirefoxDriver();
	driver1.get("https://www.yahoo.com");
	Thread.sleep(2000);
	driver1.findElement(By.xpath("//a[text()='Sign in']")).click();
	Thread.sleep(2000);
	driver1.findElement(By.xpath("//input[@id='login-username']")).sendKeys("i.nikhita@yahoo.com");
	Thread.sleep(2000);
	driver1.findElement(By.xpath("//input[@id='login-signin']")).click();
	Thread.sleep(2000);
	driver1.findElement(By.xpath("//input[@id='login-passwd']")).sendKeys("Inikita26@");
	Thread.sleep(2000);
	driver1.findElement(By.xpath("//button[@id='login-signin']")).click();
	Thread.sleep(2000);
	driver1.findElement(By.xpath("//a[@id='root_1']")).click();
	Thread.sleep(2000);
}
}
