package Org.testing.Pages;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	ChromeDriver driver;
	Properties pr;
public Login(ChromeDriver driver,Properties pr)
{
this.driver=driver;
this.pr=pr;
}

public void Signin(String usr, String pswd)
{
	System.out.println("click on signin");
	WebElement sign=driver.findElement(By.xpath("//yt-formatted-string[contains(text(),'Sign')]"));
	sign.click();
	System.out.println("clicked on signin");
	WebElement user=driver.findElement(By.xpath(pr.getProperty("user")));
	user.sendKeys(usr);
	WebElement nxt=driver.findElement(By.xpath(pr.getProperty("next")));
	nxt.click();
	System.out.println("1st pswd");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
	WebElement pswd1=driver.findElement(By.xpath(pr.getProperty("password")));
	pswd1.sendKeys(pswd);
	System.out.println("paswd entered");
	WebElement next1=driver.findElement(By.xpath(pr.getProperty("next1")));
	next1.click();
	System.out.println("clicked next");
	//Thread.sleep(10000);
}
}
