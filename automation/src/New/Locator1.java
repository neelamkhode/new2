package New;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator1 {
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	Thread.sleep(3000);
	
	driver.findElement(By.id("username")).sendKeys("neelam");
	Thread.sleep(2000);
	driver.findElement(By.name("pwd")).sendKeys("neelam");
	Thread.sleep(2000);
	//driver.findElement(By.id("loginButton")).click();
	driver.findElement(By.partialLinkText("Forgot your")).click();
	
	
	

}
}