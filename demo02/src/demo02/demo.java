package demo02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class demo {
	static WebDriver driver;
	@Test
	
	public  void test()throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\Demo\\geckodriver.exe");
		 driver =new FirefoxDriver();
	    driver.get("http://localhost/index.php/admin");
		
		Thread.sleep(3000);
		driver.findElement(By.name("user")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.name("login_submit")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("配置")).click();
		Thread.sleep(1000);
	}


		

	


}