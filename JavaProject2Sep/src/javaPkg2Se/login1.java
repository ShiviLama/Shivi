package javaPkg2Se;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class login1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\jars\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("u_0_j")).sendKeys("shivi");
		driver.findElement(By.cssSelector("input#u_0_l")).sendKeys("Lama");
		driver.findElement(By.cssSelector("input#u_0_o")).sendKeys("shiva.goal@gmail.com");
		driver.findElement(By.cssSelector("input#u_0_r")).sendKeys("shiva.goal@gmail.com");
		driver.findElement(By.cssSelector("input[id='u_0_v']")).sendKeys("shivideepak");
		driver.findElement(By.id("u_0_9")).click();
		driver.findElement(By.id("u_0_11")).click();
driver.close();

	}

}
