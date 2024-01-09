package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Youtubescript {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.youtube.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Heeriye");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//yt-formatted-string[contains(.,'Heeriye (Official Video) Jasleen Royal ft Arijit Singh| Dulquer Salmaan|')])[5]")).click();
}
}
