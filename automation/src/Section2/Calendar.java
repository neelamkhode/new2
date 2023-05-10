package Section2;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException 
	{
	System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
	

	WebDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/datepicker/");
	driver.switchTo().frame(0);
	Calendar cal=Calendar.getInstance();
	Date currentDate=cal.getTime();
	
	System.out.println(currentDate);
	
	
	
	
	
	
	
	
	
	}

	

	
}
