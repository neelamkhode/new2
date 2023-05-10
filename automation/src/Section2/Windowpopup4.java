package Section2;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowpopup4 {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException 
	{
	System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
	

	WebDriver driver=new ChromeDriver();
	
    driver.get("https://opensource-demo.orangehrmlive.com/");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[1]")).click();
    driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[2]")).click();
    driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[3]")).click();
    
    Set<String> allid=driver.getWindowHandles();
    for(String id:allid)
    {
    	driver.switchTo().window(id);
    	String title=driver.getTitle();
    	if(title.contains("LinkedIn"))
    	{
    		System.out.println(title);
    	}
    	else
    	{
    		driver.close();
    		
    	}
    }
    

}
}