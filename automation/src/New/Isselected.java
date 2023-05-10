package New;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isselected {

	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	WebElement checkbox=driver.findElement(By.id("keepLoggedInCheckBox"));
	if(checkbox.isSelected())
	{
		System.out.println("selected");
	}
	else
	{
		System.out.println("not selected");
		checkbox.click();
}
	}
}


