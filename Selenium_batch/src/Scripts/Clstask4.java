package Scripts;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Clstask4 {
public static void main(String[] args) throws Exception{
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.amazon.in");
	Thread.sleep(2000); 
	WebElement btn = driver.findElement(By.xpath("//a[.='Amazon miniTV']"));
	Actions act=new Actions(driver);
	act.contextClick(btn).perform();
	Robot rbt=new Robot();
	rbt.keyPress(KeyEvent.VK_T);
	rbt.keyRelease(KeyEvent.VK_T);
	Thread.sleep(2000);
	WebElement btn1 = driver.findElement(By.xpath("//a[.='Best Sellers']"));
	act.contextClick(btn1).perform();
	rbt.keyPress(KeyEvent.VK_T);
	rbt.keyRelease(KeyEvent.VK_T);
}
}
