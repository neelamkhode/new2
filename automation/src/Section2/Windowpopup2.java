package Section2;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowpopup2 {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException 
	{
	System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
	

	WebDriver driver=new ChromeDriver();
	
    driver.get("https://www.google.co.in/");
    driver.switchTo().newWindow(WindowType.TAB);
    driver.get("https://www.amazon.in/");
    driver.switchTo().newWindow(WindowType.WINDOW);
    driver.get("https://www.selenium.dev/");
    
    
	}
}
