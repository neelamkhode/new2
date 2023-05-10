package Section2;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductPrice {
	public static void main(String[] args) throws InterruptedException, IOException
	{
	System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
	

	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[text()='x']")).click();
	driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
	List<WebElement> prod=driver.findElements(By.xpath("//div[@class='MIXNux']/following-sibling::div[1]/div[1]/div[1]"));
	for(WebElement pn:prod)
	{
		String name=pn.getText();
		String price=driver.findElement(By.xpath("//div[text()='"+name+"']/../../div[2]/div[1].div[1]/div[1)")).getText();
		{
			System.out.println(name+"------------->"+price);
		}
		
	}
	
	}

}
