package Section2;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException 
	{
	System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
	

	WebDriver driver=new ChromeDriver();
	
    driver.get("https://the-internet.herokuapp.com/javascript_alerts");
    
    
    driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
    Alert alt=driver.switchTo().alert();
    String text=alt.getText();
    System.out.println(text);
    
    alt.sendKeys("hello");
    Thread.sleep(3000);
    alt.accept();
    
    String mainpagetext=driver.findElement(By.id("result")).getText();
    System.out.println(mainpagetext);
    
    
    
	}
}
