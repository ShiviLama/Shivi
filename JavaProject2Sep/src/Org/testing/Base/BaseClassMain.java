package Org.testing.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClassMain {
	public ChromeDriver driver;
	public Properties pr;
	@BeforeMethod
	public void BrowserLaunch() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\jars\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		File f=new File("C:\\Users\\User\\eclipse-workspace\\JavaProject2Sep\\OR.properties");//path of OR file
		pr=new Properties();//Object Initialized
		FileInputStream fi=new FileInputStream(f);//read from file
		pr.load(fi);//loading
		
	}
	@AfterMethod
	public void BrowserClose()
	{
	driver.close();
	}
}
