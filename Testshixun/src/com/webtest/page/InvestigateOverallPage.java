package com.webtest.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class InvestigateOverallPage extends BaseTest{

	private WebDriver driver;
	public InvestigateOverallPage(WebDriver driver){
		this.driver=driver;
	}
	
	

			
	
	
	
	public void administrators(String name) throws InterruptedException {
		Thread.sleep(2000);
		WebElement a=driver.findElement(By.id("admin"));
		a.clear();
		a.sendKeys(name);
		driver.findElement(By.linkText("保存")).click();
	}
	public void administrators() throws InterruptedException {
		Thread.sleep(2000);
		WebElement a=driver.findElement(By.id("admin"));
		a.clear();
		
		driver.findElement(By.linkText("保存")).click();
	}
	public void adminemail() {
		WebElement b1 =driver.findElement(By.id("adminemail"));
		b1.clear();
		driver.findElement(By.linkText("保存")).click();
	}
	public void adminemail(String email) {
		WebElement b1 =driver.findElement(By.id("adminemail"));
		b1.clear();
		b1.sendKeys(email);
		driver.findElement(By.linkText("保存")).click();
	}
	public void bounce_email() throws InterruptedException {
		driver.findElement(By.linkText("关闭")).click();
		driver.findElement(By.linkText("配置")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("调查全局设置")).click();
		WebElement b2 =driver.findElement(By.id("bounce_email"));
		b2.clear();
		driver.findElement(By.linkText("保存")).click();
		
	}
	public void bounce_email(String bemail) {
		WebElement b2 =driver.findElement(By.id("bounce_email"));
		b2.clear();
		b2.sendKeys(bemail);
		driver.findElement(By.linkText("保存")).click();
		
	}
	
	

	
	
}
