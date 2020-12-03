package com.webtest.test;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.webtest.page.NotificationDataPage;
import com.webtest.page.BaseTest;

public class NotificationDataPageTest extends BaseTest {
	NotificationDataPage Page4;
	@BeforeClass
	public void initClass() throws InterruptedException {
		 Page4  =new NotificationDataPage(driver);
		 login("admin", "admin");
		 driver.findElement(By.linkText("配置")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.linkText("调查全局设置")).click();
		 Thread.sleep(2000);
		 
	}
	@BeforeMethod
	public void beforeMethod() {
		driver.findElement(By.id("sidemenu_notification")).click();
	}
	@AfterMethod
	public void AfterMethod() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.linkText("保存")).click();
	}
	//截止日期
	@Test
	public void test35() throws InterruptedException {
		buttonclick("'datestamp_opt1'");
		
	}
	//保存ip
	@Test
	public void test36() throws InterruptedException {
		buttonclick("'ipaddr_opt1'");
		
	}
	//保存次数
	@Test
	public void test37() throws InterruptedException {
		buttonclick("'refurl_opt1'");
		
	}
	//启动评估模式
	@Test
	public void test38() throws InterruptedException {
		buttonclick("'assessments_opt1'");
		
	}
	
	

}
