package Webdrivercoding;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Voidsubmit {
	public static void main(String[] args) throws InterruptedException, IOException 
	{
	System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
	

	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("mobiles");
	search.submit();//will work only for search box
	
	
	
	}

}
