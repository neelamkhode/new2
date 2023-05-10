package Section2;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {
	public static void main(String[] args, CharSequence search) throws InterruptedException, IOException
	{
	System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
	

	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in/");
	Actions act=new Actions(driver);
	act.keyDown(Keys.SHIFT).sendKeys(search,"cricket").perform();
	
	}
}
