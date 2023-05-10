package New;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
//		driver.findElement(By.id("username")).sendKeys("admin");//deletes by itself
//		driver.findElement(By.name("pwd")).sendKeys("manage");//deletes by itself
//		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.className("textField")).sendKeys("admin");//Doesn't delete
		driver.findElement(By.className("pwdfield")).sendKeys("manager");//Doesn't delete

}

}