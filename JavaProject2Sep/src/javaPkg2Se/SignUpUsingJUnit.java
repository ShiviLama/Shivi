package javaPkg2Se;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SignUpUsingJUnit {
ChromeDriver driver;
@BeforeClass
public void LaunchBrowse()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\jars\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
}
@Test
public void SignUp() throws InterruptedException
{
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("u_0_j")).sendKeys("shivi");
	driver.findElement(By.cssSelector("input#u_0_l")).sendKeys("Lama");
	driver.findElement(By.cssSelector("input#u_0_o")).sendKeys("shiva.goal@gmail.com");
	driver.findElement(By.cssSelector("input#u_0_r")).sendKeys("shiva.goal@gmail.com");
	driver.findElement(By.cssSelector("input[id='u_0_v']")).sendKeys("shivideepak");
	WebElement drop=driver.findElement(By.name("birthday_day"));
	Select s=new Select(drop);
	s.selectByIndex(26);
	System.out.println("day");
	WebElement drop2=driver.findElement(By.id("month"));
	System.out.println("month");
	Select s2=new Select(drop2);
	s2.selectByValue("10");
	WebElement drop3=driver.findElement(By.cssSelector("select#year"));
	Select s3=new Select(drop3);
	s2.selectByVisibleText("1991");
	System.out.println("year");
	Thread.sleep(50000);
	driver.findElement(By.id("u_0_9")).click();
	driver.findElement(By.id("u_0_11")).click();
}

@AfterClass
public void CloseBrowser()
{
	driver.close();
}


}
