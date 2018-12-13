package Org.testing.testCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Org.testing.Base.BaseClassMain;
import Org.testing.Pages.Video_Play;

public class TC4 extends BaseClassMain{
	@Test
	public void Login() throws InterruptedException
	{
		//driver.findElement(By.id("text")).click();
		/*System.out.println("click on signin");
		WebElement sign=driver.findElement(By.xpath("//yt-formatted-string[contains(text(),'Sign')]"));
		sign.click();
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
		Thread.sleep(10000);*/
		Org.testing.Pages.Login l=new Org.testing.Pages.Login(driver, pr);
		l.Signin("2010shivagopal@gmail.com", "3196451966");
		Video_Play vd=new Video_Play(driver,pr);
		vd.video();
		driver.findElement(By.xpath("//yt-formatted-string[@class='style-scope.ytd-subscribe-button-renderer']")).click();
		System.out.println("subscribed successfully");
		//Thread.sleep(10000);
	}
}
