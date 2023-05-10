package Section2;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowpopup {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException 
	{
	System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
	

	WebDriver driver=new ChromeDriver();
	
    driver.get("https://www.amazon.in/");
    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphonex",Keys.ENTER);
    driver.findElement(By.className("s-image")).click();
    String mainid=driver.getWindowHandle();
    Set<String> allid=driver.getWindowHandles();
    for(String id:allid)
    {
    	if(!(mainid.equals(id)))
    	{
    		driver.switchTo().window(id);
    	}
    	String price=driver.findElement(By.className("a-price-whole")).getText();
    	System.out.println(price);
    	
    }
    
    

}
	
}
