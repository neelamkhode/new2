package Section2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select1 {
	public static void main(String[] args) throws InterruptedException, IOException 
	{
	System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
	

	WebDriver driver=new ChromeDriver();
	driver.get("https://www.ebay.com/");
	WebElement dropdown=driver.findElement(By.id("gh-cat"));
	Select s=new Select(dropdown);
	s.selectByIndex(4);
	s.selectByValue(null);
	s.selectByVisibleText(null);
	
	
	}
}
