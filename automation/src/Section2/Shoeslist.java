package Section2;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shoeslist {
	public static void main(String[] args) throws InterruptedException, IOException
	{
	System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
	

	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes");
	List<WebElement> shoes=driver.findElements(By.xpath("//div[class='s-suggestion-container']/div"));
	for(WebElement s:shoes)
	{
		String suggestion=s.getText();
		if(suggestion.contains(" for boys"))
		{
		suggestion.click();
		break;
		}
	}
	}
}
