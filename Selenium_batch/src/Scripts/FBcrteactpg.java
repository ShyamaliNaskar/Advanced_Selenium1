package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FBcrteactpg {
public static void main(String[] args) throws InterruptedException{
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	Thread.sleep(2000);
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[.='Create new account']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Shyamali");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Naskar");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("snaskar939@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("snaskar939@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Shyamali939@");
	Thread.sleep(2000);
	WebElement Daydd = driver.findElement(By.xpath("//select[@id='day']"));
	Select S=new Select(Daydd);
	S.selectByIndex(7);
	Thread.sleep(2000);
	WebElement Mondd = driver.findElement(By.xpath("//select[@id='month']"));
	Select S1=new Select(Mondd);
	S1.selectByVisibleText("Aug");
	Thread.sleep(2000);
	WebElement Yrdd = driver.findElement(By.xpath("//select[@id='year']"));
	Select S2=new Select(Yrdd);
	S2.selectByVisibleText("1995");
	driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
	Thread.sleep(2000);
}
}
