package Practise;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch {
	public static void main(String[] args) throws InterruptedException, IOException 
	{
	System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
	

	WebDriver driver=new ChromeDriver();
	driver.get("https://paytm.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//span[text()='Sign In']")).click();
	driver.switchTo().frame(0);//icons which doesnt get click v use frame
	
	driver.findElement(By.xpath("//span[contains(text(),'Google Play')]")).click();
	Thread.sleep(3000);
	
	//to swith to previous page we use 
	//driver.switchTo().defaultcontent(1);
	
	}
}
