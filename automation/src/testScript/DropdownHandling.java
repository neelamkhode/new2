package testScript;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import genericLib.DataUtility;

public class DropdownHandling extends BaseClass {
	@Test
	public void getDropDownBox() throws IOException {
		driver.findElement(By.className("popup_menu_button_settings")).click();
		driver.findElement(By.xpath("(//div[@class='item_title'])[3]")).click();
		WebElement dropdown=driver.findElement(By.id("firstHierarchyLevelCodeSelect"));
        Select s=new Select(dropdown);
        s.selectByIndex(4);
        String result=driver.findElement(By.id("FormModifiedTextCell")).getText();
        System.out.println(result);
}


	
}
