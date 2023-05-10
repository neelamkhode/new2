package testScript;


	import java.io.IOException;

	import org.apache.poi.EncryptedDocumentException;
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.testng.annotations.Test;

import genericLib.BaseClass;
public class Typeofwork extends BaseClass{
		@Test
		public void typesOfWork() throws EncryptedDocumentException, IOException {
			
			driver.findElement(By.className("popup_menu_button_settings")).click();
			Actions act = new Actions(driver);
			WebElement ele = driver.findElement(By.partialLinkText("Types of Work"));
			act.click(ele).perform();
			String typeOfWork=du.getDataFromExcelSheet("Sheet1",4,1);
			driver.findElement(By.id("ext-comp-1002")).click();
			driver.findElement(By.name("name")).sendKeys(typeOfWork);
			driver.findElement(By.xpath("//td[@id='ButtonPane']//input[contains(@value,'Cancel')]")).click();
			//switch to alert popup
			System.out.println(cu.fetchMsg(driver));
			cu.alertOk(driver);
		}

	}


