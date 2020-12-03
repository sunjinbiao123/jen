package com.webtest.test;



import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.dataprovider.NSDataProvider;
import com.webtest.page.BaseTest;
import com.webtest.page.InvestigateOverallPage;

public class InverstigateOverallPageTest extends BaseTest {
	InvestigateOverallPage Page1;
	@BeforeClass
	public void initClass() throws InterruptedException {
		 Page1  =new InvestigateOverallPage(driver);
		 login("admin", "admin");
		 driver.findElement(By.linkText("配置")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.linkText("调查全局设置")).click();
	}
	@Test
	public void test1() throws InterruptedException{
		
		Thread.sleep(1000);
		Page1.administrators();
	
	}
	@Test
	public void test2()throws InterruptedException{
		Thread.sleep(1000);
		Page1.administrators("asd");
	}
	@Test
	public void test3()throws InterruptedException {
		Thread.sleep(1000);
		Page1 .adminemail();
	}
	@Test
	public void test4()throws InterruptedException {
		Thread.sleep(1000);
		Page1 .adminemail("254272669@qq.com");
	}
	@Test
	public void test5()throws InterruptedException {
		Thread.sleep(1000);
		Page1 .adminemail("123456");
	}
	@Test
	public void test6()throws InterruptedException {
		Thread.sleep(1000);
		Page1 .bounce_email();
	}
	@Test
	public void test7()throws InterruptedException {
		Thread.sleep(1000);
		Page1 .bounce_email("254272669@qq.com");
	}
	@Test
	public void test8()throws InterruptedException {
		Thread.sleep(1000);
		Page1 .bounce_email("123456");
	}
}
