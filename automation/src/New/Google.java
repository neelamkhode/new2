package New;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		//driver.get("https://www.google.com/search?q=selenium&source=hp&ei=bBFuY5WwG4-hseMPoISbyAU&iflsig=AJiK0e8AAAAAY24ffMY2Kf_cTq3_NYlsgK-MPP1jE4rC&ved=0ahUKEwiVlvSK5KX7AhWPUGwGHSDCBlkQ4dUDCAg&uact=5&oq=selenium&gs_lcp=Cgdnd3Mtd2l6EAMyCwgAEIAEELEDEIMBMgsIABCABBCxAxCDATILCAAQgAQQsQMQgwEyCAgAEIAEELEDMgUIABCABDILCAAQgAQQsQMQgwEyCwgAEIAEELEDEIMBMggIABCABBCxAzILCAAQgAQQsQMQgwEyCAgAEIAEELEDOhEIABCPARCPARDqAhCMAxDlAjoRCC4QgwEQxwEQsQMQ0QMQgAQ6CAguELEDEIMBOgUILhCABDoICAAQsQMQgwE6EQguEIAEELEDEIMBEMcBENEDOgsILhCABBCxAxDUAjoKCAAQsQMQgwEQCjoLCC4QgAQQsQMQgwE6CAguEIAEELEDOgsILhCDARCxAxCABDoLCC4QgwEQ1AIQsQNQ-wJY_xZglhtoCXAAeACAAQCIAQCSAQCYAQCgAQGwAQo&sclient=gws-wiz");
		
		driver.findElement(By.className("gLFyf")).sendKeys("selenium");//class name from title bar google search
		Thread.sleep(1000);
		driver.findElement(By.className("gNO89b")).click();//classname from google search button
		
		//String Urldriver.getCurrentUrl();
		String title=driver.getTitle();
		System.out.println(title);
		
	}

}


