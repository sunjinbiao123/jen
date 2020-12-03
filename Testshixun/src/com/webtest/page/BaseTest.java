package com.webtest.page;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	protected WebDriver driver;
	protected WebDriver driver2;
	@BeforeClass
	public void initBrowser() {			
		System.setProperty("webdriver.gecko.driver", "C:\\Demo\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://localhost/index.php/admin/authentication/sa/login");
		
		
	}


	public void login(String username ,String password )throws InterruptedException  {
	Thread.sleep(1000);
	driver.findElement(By.name("user")).sendKeys(username);
	driver.findElement(By.name("password")).sendKeys(password);
	Thread.sleep(1000);
	driver.findElement(By.name("login_submit")).click();
	Thread.sleep(1000);
	}
	//获取按钮
	public  void buttonclick(String xpath) throws InterruptedException {
		Thread.sleep(3000);
		WebElement sq=driver.findElement(By.xpath("//input[@id="+xpath+"]"));
		Actions actions =new Actions(driver);
		actions.moveToElement(sq).click().perform();
		
	}
	public void Page_first() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\Demo\\geckodriver.exe");
		driver2 = new FirefoxDriver();
		driver2.get("http://localhost");
		driver2.findElement(By.linkText("Test")).click();
		Thread.sleep(2000);
		driver2.quit();
		
	}
	public void Page_md() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\Demo\\geckodriver.exe");
		driver2 = new FirefoxDriver();
		driver2.get("http://localhost");
		driver2.findElement(By.linkText("Test")).click();
		Thread.sleep(2000);
		driver2.findElement(By.id("ls-button-submit")).click();
		Thread.sleep(2000);
		driver2.findElement(By.id("ls-button-submit")).click();
		driver2.quit();
		
	}

	public void Page_final() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\Demo\\geckodriver.exe");
		driver2 = new FirefoxDriver();
		driver2.get("http://localhost");
		driver2.findElement(By.linkText("Test")).click();
		Thread.sleep(2000);
		driver2.findElement(By.id("ls-button-submit")).click();
		Thread.sleep(2000);
		driver2.findElement(By.id("ls-button-submit")).click();
		driver2.findElement(By.id("ls-button-submit")).click();
		Thread.sleep(2000);
		driver2.findElement(By.id("ls-button-submit")).click();
		Thread.sleep(2000);
		driver2.findElement(By.id("ls-button-submit")).click();
		Thread.sleep(2000);
		driver2.quit();	
		
		}
	@AfterClass
	public void close() throws InterruptedException{
		Thread.sleep(3000);
		driver.quit();
	

		
	
	}

}
