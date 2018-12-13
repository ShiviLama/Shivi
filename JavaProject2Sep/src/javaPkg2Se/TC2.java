package javaPkg2Se;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC2 extends BaseClass{
	/*ChromeDriver driver;
	@BeforeMethod
	public void BrowserLaunch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\jars\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
	}*/
	@Test
	public void Login() throws InterruptedException
	{
		driver.findElement(By.id("text")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("2010shivagopal@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		System.out.println("1st pswd");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("3196451966");
		System.out.println("paswd entered");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		System.out.println("clicked next");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text()='Subscriptions']")).click();
		
	}
	/*@AfterMethod
	public void BrowserClose()
	{
	driver.close();
	}*/

	}


