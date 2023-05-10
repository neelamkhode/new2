package Section2;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windowpopup3 {
	

	public static void main(String[] args) throws InterruptedException, IOException, AWTException 
	{
	System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
	

	WebDriver driver=new ChromeDriver();
	
    driver.get("https://www.naukri.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
    WebElement jobs=driver.findElement(By.className("nI-gNb-menuItems__anchorDropdown"));
    
    Actions act=new Actions(driver);
    act.moveToElement(jobs).perform();
    
    driver.findElement(By.linkText("IT jobs")).click();
    Thread.sleep(2000);
    driver.findElement(By.linkText("Java Developer")).click();
    
    String mainid=driver.getWindowHandle();
    Set<String> allid=driver.getWindowHandles();
    for(String id:allid)
    {
    	if(!(mainid.equals(id)))
    	{
    		driver.switchTo().window(id);
    	}
    
    	String msg=driver.findElement(By.xpath("//h2[text()='Jobs you might be interested in']")).getText();
    	System.out.println(msg);
        driver.close();
        driver.switchTo().window(mainid);
        String title=driver.getTitle();
        System.out.println(title);
    }
   
	}
	
}
