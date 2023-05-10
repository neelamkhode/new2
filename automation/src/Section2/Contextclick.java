package Section2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Contextclick {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
	

	WebDriver driver=new ChromeDriver();
	
    driver.get("https://www.google.co.in/");
    WebElement content=driver.findElement(By.linkText("Gmail"));
    Actions act=new Actions(driver);
    act.contextClick(content).perform();
    Robot r=new Robot();
    r.keyPress(KeyEvent.VK_DOWN);
    r.keyRelease(KeyEvent.VK_DOWN);
    r.keyPress(KeyEvent.VK_ENTER);
    r.keyRelease(KeyEvent.VK_ENTER);
    


	}
}
