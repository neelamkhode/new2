package New;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRect {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement loginbutton=driver.findElement(By.id("loginButton"));
		org.openqa.selenium.Rectangle rec=loginbutton.getRect();
		System.out.println("x:"+rec.getX());
		System.out.println("y:"+rec.getY());
		System.out.println("width"+rec.getWidth());
		System.out.println("height"+rec.getHeight());
		
		
	}	
}
