﻿package demo02;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class Demo {
	//WebDriver driver;
	@Test
	public  void test()throws InterruptedException {
		System.out.println("HEllo");	
		/*System.setProperty("webdriver.gecko.driver", "C:\\Demo\\geckodriver.exe");
		 driver =new FirefoxDriver();
		 driver.get("http://localhost/index.php/admin");
		Thread.sleep(3000);
		driver.findElement(By.name("user")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.name("login_submit")).click();
		Thread.sleep(1000);
		driver.quit();*/
	}
}
