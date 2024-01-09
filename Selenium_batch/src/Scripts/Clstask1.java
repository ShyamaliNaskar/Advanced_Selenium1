package Scripts;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Clstask1 {
public static void main(String[] args) throws Exception{
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	Thread.sleep(2000);
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	Robot rbt=new Robot();
	rbt.keyPress(KeyEvent.VK_ALT);
	rbt.keyRelease(KeyEvent.VK_ALT);
	Thread.sleep(2000);
	rbt.keyPress(KeyEvent.VK_V);
	rbt.keyRelease(KeyEvent.VK_V);
	Thread.sleep(2000);
	rbt.keyPress(KeyEvent.VK_Z);
	rbt.keyRelease(KeyEvent.VK_Z);
	Thread.sleep(2000);
	rbt.keyPress(KeyEvent.VK_I);
	rbt.keyRelease(KeyEvent.VK_I);
	Thread.sleep(2000);
	driver.close();
}
}
