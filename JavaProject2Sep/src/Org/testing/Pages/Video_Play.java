package Org.testing.Pages;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Video_Play {
public ChromeDriver driver;
public Properties pr;
public Video_Play(ChromeDriver driver, Properties pr) 
{
this.driver=driver;
this.pr=pr;
	
}
public void video() throws InterruptedException
{
	Actions ac=new Actions(driver);
	ac.sendKeys(Keys.ESCAPE);
	System.out.println("POp-up escaped");
	Thread.sleep(10000);
	List<WebElement> ls=driver.findElements(By.xpath("//a[@id='video-title']"));
	System.out.println("number of videos displayed are:" +ls.size());
	ls.get(2).click();
	System.out.println("video played");
	Thread.sleep(10000);	
}

}
