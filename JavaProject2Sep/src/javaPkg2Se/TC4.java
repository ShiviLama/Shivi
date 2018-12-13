package javaPkg2Se;
import java.util.List;
import java.util.concurrent.TimeUnit;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC4 extends BaseClass{
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
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		Thread.sleep(10000);
		System.out.println("clicked next");
		Thread.sleep(10000);
		Actions ac=new Actions(driver);
		ac.sendKeys(Keys.ESCAPE);
		System.out.println("POp-up escaped");
		Thread.sleep(10000);
		List<WebElement> ls=driver.findElements(By.xpath("//a[@id='video-title']"));
		System.out.println("number of videos displayed are:" +ls.size());
		ls.get(2).click();
		System.out.println("video played");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//yt-formatted-string[@class='style-scope.ytd-subscribe-button-renderer']")).click();
		System.out.println("subscribed successfully");
		//Thread.sleep(10000);
	}
	/*@AfterMethod
	public void BrowserClose()
	{
	driver.close();
}*/
}
