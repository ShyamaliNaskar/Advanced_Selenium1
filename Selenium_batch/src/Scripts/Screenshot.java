package Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot {
public static void main(String[] args) throws Exception{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.shaadi.com");
	Thread.sleep(2000);
	
	Thread.sleep(2000);
	driver.close();
}
}
