

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Flipkart {
	
	@Test(dataProvider = "dataScript")
	public void search(String stringToSearch ) {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.flipkart.com/");
	    driver.findElement(By.xpath("//button[text()='✕']")).click();
	    driver.findElement(By.name("q")).sendKeys(stringToSearch);
	    driver.findElement(By.xpath("//button[@type = 'submit']")).click();
	    System.out.println(driver.getTitle());
	    String resultText = driver.findElement( By.xpath("//span[contains(text(), 'Showing')]")).getText();
	    System.out.println(resultText);
	}

	@DataProvider
	public Object[] dataScript() {
		Object[] objarr = new Object[5];
		objarr[0] = "iphonex";
		objarr[1] = "clock";
		objarr[2] = " watch";
		objarr[3] = "flowers";
		objarr[4] = "laptop";
		return objarr;
	}

		
	}

