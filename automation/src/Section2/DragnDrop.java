package Section2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DragnDrop {
	public static void main(String[] args) throws InterruptedException, IOException 
	{
	System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
	

	WebDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com/");
	
	driver.findElement(By.xpath("//button[text()='X']")).click();
	driver.findElement(By.name("q")).sendKeys("iphonex",Keys.ENTER);
	WebElement slider1=driver.findElement((By.xpath("//div[contains(@class,'SG)]/div/div[1]/div")));
	
	
	

	
	}
}
