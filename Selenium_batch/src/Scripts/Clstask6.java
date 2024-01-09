package Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Clstask6 {
	
	@Test
	  void Amazon() throws InterruptedException
	  {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(3000); 
		driver.close();
	  }
	  @Test
	  void Shaadi() throws InterruptedException
	  {
		  System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		  WebDriver driver=new FirefoxDriver();
		  driver.get("https://www.Shaadi.com");
		  Thread.sleep(3000);
		  driver.close();
	  }
	  @Test
	  void Mmt() throws InterruptedException
	  {
		  System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		  WebDriver driver=new FirefoxDriver();
		  driver.get("https://www.makemytrip.com");
		  Thread.sleep(3000);
		  driver.close();
	  }
}
