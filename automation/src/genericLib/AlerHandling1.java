package genericLib;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(automation.genericLib.ListenerImplementation.class)


public class AlerHandling1 extends BaseClass1{
	
	@Test(groups= {"system"})
	public void textPresentWait(WebDriver driver, By element,String matchStr) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(element, matchStr));
		
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


