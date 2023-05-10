package Practise;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousemoveover {
	public static void main(String[] args) throws InterruptedException, IOException 
	{
	System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
	

	WebDriver driver=new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
	driver.manage().window().maximize();
	WebElement aa=driver.findElement(By.xpath("//span[text()='Sign In']"));
	Actions a=new Actions(driver);
	a.moveToElement(aa).perform();
	
	driver.findElement(By.xpath("//a[text()='login']")).click();
	
	driver.switchTo().frame(0);
	
	
	driver.findElement(By.id("userName")).sendKeys("12667676");
	
	}
}
