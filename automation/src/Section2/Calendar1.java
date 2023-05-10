package Section2;

import java.awt.AWTException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar1 {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException 
	{
	System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
	

	WebDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/datepicker/");
	driver.switchTo().frame(0);
	Calendar cal=Calendar.getInstance();
	Date currentDate=cal.getTime();
	System.out.println(currentDate);
	SimpleDateFormat sdf= new SimpleDateFormat("MM/dd/yyyy");
	String md=sdf.format(currentDate);
	driver.findElement(By.id("datepicker")).sendKeys(md,Keys.ENTER);
	
	}
}
