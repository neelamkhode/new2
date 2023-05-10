package genericLib;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Parametrization {

	@Test(dataProvider="dataSupplier")

	public void login(String username,String password) {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("pwd")).sendKeys(password);
		
	}

@DataProvider
public Object[][] dataSupplier()
{
	Object[][] objarr=new Object[4][2];
	objarr[0][0]="admin";
	objarr[0][1]="manager";
	objarr[1][0]="admin1";
	objarr[1][1]="manager1";
	return objarr;
	
	
}}
