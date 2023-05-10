package Section2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select {
	public Select(WebElement dropdown) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException, IOException 
	{
	System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
	

	WebDriver driver=new ChromeDriver();
	driver.get("https://www.ebay.com/");
	WebElement Dropdown=driver.findElement(By.id("gh-cat"));
	Select s=new Select(Dropdown);
	
	
	}

	public void selectByIndex() {
		// TODO Auto-generated method stub
		
	}

}
