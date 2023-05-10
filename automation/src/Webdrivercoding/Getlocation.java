package Webdrivercoding;

import java.awt.Dimension;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getlocation {
	public static void main(String[] args) throws InterruptedException, IOException 
	{
	System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
	

	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	WebElement loc=driver.findElement(By.id("nav-logo-sprites"));
	
	Point p=loc.getLocation();
	System.out.println("x and y coordinate:"+p);
	
	org.openqa.selenium.Dimension d=loc.getSize();
	System.out.println("width and height:"+d);
	
	
	
	
	
	
	
	
	}

}
