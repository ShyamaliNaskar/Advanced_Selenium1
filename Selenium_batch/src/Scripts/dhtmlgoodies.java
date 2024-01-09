package Scripts;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class dhtmlgoodies {
public static void main(String[] args) throws Exception{
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	Thread.sleep(2000);
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	Thread.sleep(2000);
	WebElement Wash = driver.findElement(By.xpath("(//div[.='Washington'])[2]"));
	WebElement US = driver.findElement(By.xpath("//div[.='United States']"));
	WebElement Rome = driver.findElement(By.xpath("(//div[.='Rome'])[2]"));
	WebElement Italy = driver.findElement(By.xpath("//div[.='Italy']"));
	WebElement Oslo = driver.findElement(By.xpath("(//div[.='Oslo'])[2]"));
	WebElement Norway = driver.findElement(By.xpath("//div[.='Norway']"));
	WebElement Stockholm = driver.findElement(By.xpath("(//div[.='Stockholm'])[2]"));
	WebElement Sweden = driver.findElement(By.xpath("//div[.='Sweden']"));
	WebElement Seoul = driver.findElement(By.xpath("(//div[.='Seoul'])[2]"));
	WebElement SKorea = driver.findElement(By.xpath("//div[.='South Korea']"));
	WebElement Copen = driver.findElement(By.xpath("(//div[.='Copenhagen'])[2]"));
	WebElement Denmark = driver.findElement(By.xpath("//div[.='Denmark']"));
	WebElement Madrid = driver.findElement(By.xpath("(//div[.='Madrid'])[2]"));
	WebElement Spain = driver.findElement(By.xpath("//div[.='Spain']"));
	WebElement Capt = driver.findElement(By.xpath("//div[@id='capitals']"));
	Actions act=new Actions(driver);
	act.dragAndDrop(Wash, US).perform();
	act.dragAndDrop(Rome, Italy).perform();
	act.dragAndDrop(Oslo, Norway).perform();
	act.dragAndDrop(Stockholm, Sweden).perform();
	act.dragAndDrop(Seoul, SKorea).perform();
	act.dragAndDrop(Copen, Denmark).perform();
	act.dragAndDrop(Madrid, Spain).perform();
	Thread.sleep(2000);
	act.dragAndDrop(Wash, Capt).perform();
	act.dragAndDrop(Rome, Capt).perform();
	act.dragAndDrop(Oslo, Capt).perform();
	act.dragAndDrop(Stockholm, Capt).perform();
	act.dragAndDrop(Seoul, Capt).perform();
	act.dragAndDrop(Copen, Capt).perform();
	act.dragAndDrop(Madrid, Capt).perform();
}
}
