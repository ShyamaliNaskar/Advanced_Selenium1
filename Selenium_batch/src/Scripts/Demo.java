package Scripts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		new ChromeDriver();
		Thread.sleep(3000);
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		new FirefoxDriver();
		
	}

}
