package automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().manage().maxinize();
		driver.get("http://demo.actitime.com/login.do")
		By usernameLoc=By.id("username");
		WebElement username=driver.findElement(usernameLoc)
				username.sendKeys("admin");
	}

}
