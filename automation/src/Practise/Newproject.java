package Practise;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Newproject {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException 
	{
	System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
	

	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");
	driver.switchTo().frame("iframe_a");
	driver.findElement(By.xpath("//font[text()='Free Mock Tests']")).click();
	 String mainid=driver.getWindowHandle();
        Set<String> allid= driver.getWindowHandles();
        for(String id:allid)
        {
        	if(!mainid.equals(id))
        	{
        		driver.switchTo().window(id);
        	}
        }
        WebElement insurance=driver.findElement(By.xpath("//ul[contains(@style,'margin-top')]/li[6]"));
        Actions act=new Actions(driver);
        act.click(insurance);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20)); 
        wait.until(ExpectedConditions.titleContains("FreshersNow Test Series | 100% Free Mock Tests"));
        WebElement insurance1=driver.findElement(By.tagName("h1"));
        File src=insurance1.getScreenshotAs(OutputType.FILE);
		File trg=new File("./screenshot/insurance1.png");
		FileUtils.copyFile(src, trg);
	    driver.close();
		driver.switchTo().window(mainid);
		System.out.println(driver.getTitle());

}
}