package Org.testing.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Org.testing.Base.BaseClassMain;

public class TC2 extends BaseClassMain{
	public void Login() throws InterruptedException
	{
		//driver.findElement(By.id("text")).click();
		//System.out.println("click on signin");
	//	WebElement sign=driver.findElement(By.xpath("//yt-formatted-string[contains(text(),'Sign')]"));
	//	sign.click();
		/*driver.findElement(By.xpath("//input[@type='email']")).sendKeys("2010shivagopal@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		System.out.println("1st pswd");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("3196451966");
		System.out.println("paswd entered");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		System.out.println("clicked next");
		Thread.sleep(10000);*/
	/*	WebElement user=driver.findElement(By.xpath(pr.getProperty("user")));
		user.sendKeys("2010shivagopal@gmail.com");
		WebElement nxt=driver.findElement(By.xpath(pr.getProperty("next")));
		nxt.click();
		System.out.println("1st pswd");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
		WebElement pswd=driver.findElement(By.xpath(pr.getProperty("password")));
		pswd.sendKeys("3196451966");
		System.out.println("paswd entered");
		Thread.sleep(20000);
		Thread.sleep(10000);
		driver.findElement(By.className("RveJvd snByac")).click();
		//WebElement next1=driver.findElement(By.xpath(pr.getProperty("next1")));
		//next1.click();
		System.out.println("clicked next");
		Thread.sleep(20000); */
		Org.testing.Pages.Login l= new Org.testing.Pages.Login(driver, pr);
		l.Signin("2010shivagopal@gmail.com", "3196451966");
		WebElement subs=driver.findElement(By.xpath("subs"));
		subs.click();
		
	}
}
