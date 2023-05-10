package genericLib;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtility {
	public int getRandonNum(int range)
	{
		Random r = new Random();
		int num = r.nextInt(range);
		return num;
	}
	public void titleWait(String title,WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains(title));
	}
	public void textWait(WebDriver driver,By element,String matchstr)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(element,matchstr));
	}
	
	
	public String fetchMsg(WebDriver driver) {
		Alert alt = driver.switchTo().alert();
		return alt.getText();
	}
	public void alertOk(WebDriver driver) {
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}
	
	
}


