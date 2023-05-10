package New;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrm {
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(3000);
	driver.findElement(By.className("oxd-input")).sendKeys("admin");
	Thread.sleep(3000);
	driver.findElement(By.name("password")).sendKeys("admin123");
	Thread.sleep(3000);
	//driver.findElement(By.className("oxd-button")).click();
	//Thread.sleep(2000);
	driver.findElement(By.partialLinkText("Forgot your")).click();
	

}
}