package genericLib;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
@Listeners(automation.genericLib.ListenerImplementation.class)

public class BaseClass1 {
	
	public WebDriver driver;
	public static WebDriver listenerdriver;
	public DataUtility du=new DataUtility();
	public CommonUtility cu=new CommonUtility();

	@BeforeClass(alwaysRun=true)
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		listenerdriver=driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	@BeforeMethod(alwaysRun=true)
	public void login() throws IOException {
		driver.get(du.getDataFromProperties("url"));
		driver.findElement(By.id("username")).sendKeys(du.getDataFromProperties("username"));
		driver.findElement(By.name("pwd")).sendKeys(du.getDataFromProperties("password"));
		driver.findElement(By.id("loginButton")).click(); 
	}
	@AfterMethod(alwaysRun=true)
	public void logout() {
		driver.findElement(By.id("logoutLink")).click();
	}
	@AfterClass(alwaysRun=true)
	public void closeBrowser() {
		driver.close();
	}


}
