package Scripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Clstask3 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	Thread.sleep(2000);
	driver.get("https://skpatro.github.io/demo/links/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
	Thread.sleep(2000);
	String pid = driver.getWindowHandle();
	Set<String> allids = driver.getWindowHandles();
	allids.remove(pid);
	for(String e:allids)
	{
		driver.switchTo().window(e);
	}
	Thread.sleep(2000);
	driver.close();
	Thread.sleep(2000);
	driver.switchTo().window(pid);
	driver.close();
}
}
