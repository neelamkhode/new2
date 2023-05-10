package testScript;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import genericLib.CommonUtility;

public class Customercreation extends BaseClass{
@Test
public void createCustomer() throws IOException
{
	CommonUtility cu=new CommonUtility();
	String customerName=du.getDataFromExcelSheet("Sheet1",1,1);
	customerName = customerName +cu.getRandonNum(10000);
	driver.findElement(By.id("container_tasks")).click();
	driver.findElement(By.cssSelector(".title.ellipsis")).click();
	driver.findElement(By.className("createNewCustomer")).click();
	driver.findElement(By.className("newNameField")).sendKeys(customerName);
	driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector(".titleEditButtonContainer>.title"), customerName));
	String expcustomername=driver.findElement(By.xpath("//div[@class='titleEditButtonContainer']/div[1]")).getText();
	System.out.println(expcustomername);
}
}
