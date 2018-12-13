package Org.testing.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Org.testing.Base.BaseClassMain;
import javaPkg2Se.BaseClass;


	public class TC1 extends BaseClassMain{
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
		/*System.out.println("click on signin");
		WebElement sign=driver.findElement(By.xpath("//yt-formatted-string[contains(text(),'Sign')]"));
		sign.click();
		System.out.println("clicked on signin");
		WebElement user=driver.findElement(By.xpath(pr.getProperty("user")));
		user.sendKeys("2010shivagopal@gmail.com");
		WebElement nxt=driver.findElement(By.xpath(pr.getProperty("next")));
		nxt.click();
		System.out.println("1st pswd");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
		WebElement pswd=driver.findElement(By.xpath(pr.getProperty("password")));
		pswd.sendKeys("3196451966");
		System.out.println("paswd entered");
		WebElement next1=driver.findElement(By.xpath(pr.getProperty("next1")));
		next1.click();
		System.out.println("clicked next");
		Thread.sleep(10000);*/
		Org.testing.Pages.Login l=new Org.testing.Pages.Login(driver, pr);
		l.Signin("2010shivagopal@gmail.com", "3196451966");
		WebElement trending=driver.findElement(By.xpath(pr.getProperty("trending")));
		trending.click();
		Thread.sleep(10000);
		
	}
	/*@AfterMethod
	public void BrowserClose()
	{
	driver.close();
	}*/

	}

