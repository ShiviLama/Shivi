package javaPkg2Se;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class BrowserOpen {
	ChromeDriver driver;
//@Before
public void browser_Launch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\jars\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		//driver.close();
	}

//@Test
public void signUp()
	{
		driver.findElement(By.name("firstname")).sendKeys("Shivi");
		driver.findElement(By.id("u_0_l")).sendKeys("Lama");
		driver.findElement(By.id("u_0_o")).sendKeys("7292090146");
		driver.findElement(By.name("reg_passwd__")).sendKeys("7292090146");
		
		WebElement drop= driver.findElement(By.cssSelector("Select#day"));// CSS and select by Index
		Select s=new Select(drop);
		s.selectByIndex(1);
		
		WebElement drop1= driver.findElement(By.cssSelector("Select#month"));// CSS selector and select by Value
		Select s1=new Select(drop1);
		s1.selectByValue("4");
		
		WebElement drop2= driver.findElement(By.cssSelector("Select#year"));// CSS select by visible text
		Select s2=new Select(drop2);
		s2.selectByVisibleText("1991");
		
		driver.findElementById("u_0_11").click();
		
		System.out.println("hi");
	}
	
public static void main(String[] args) 
{
	BrowserOpen obj=new BrowserOpen();
	obj.browser_Launch();
	obj.signUp();
	
}
	

}
