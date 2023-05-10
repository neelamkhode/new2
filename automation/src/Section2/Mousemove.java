package Section2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousemove {
	public static void main(String[] args) throws InterruptedException, IOException 
	{
	System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
	

	WebDriver driver=new ChromeDriver();
	driver.get("https://www.ebay.com/");
	WebElement ele=driver.findElement(By.xpath("(//a[text()='Motors'])[1]"));
	Actions act=new Actions(driver);
	act.moveToElement(ele).perform();
	
	driver.findElement(By.xpath("//a[contains()='Turbo']")).click();
	
	
	
	
	}

}
