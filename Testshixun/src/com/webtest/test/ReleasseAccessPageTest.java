package com.webtest.test;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.webtest.page.BaseTest;

import com.webtest.page.ReleaseAccessPage;

public class ReleasseAccessPageTest extends BaseTest {
	ReleaseAccessPage Page5;
	@BeforeClass
	public void initClass() throws InterruptedException {
		 Page5  =new ReleaseAccessPage(driver);
		 login("admin", "admin");
		 driver.findElement(By.linkText("配置")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.linkText("调查全局设置")).click();
		 Thread.sleep(2000);
		 
	}
	@BeforeMethod
	public void beforeMethod() {
		driver.findElement(By.id("sidemenu_publication")).click();
	}
	@AfterMethod
	public void AfterMethod() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.linkText("保存")).click();
	}
	//公开列出调查
	@Test
	public void test39() throws InterruptedException {
		buttonclick("'listpublic_opt1'");
	}
	//设置cookie以防止重复参与
	@Test
	public void test40() throws InterruptedException {
		buttonclick("'usecookie_opt1'");
	}
	//使用验证码访问
	@Test
	public void test41() throws InterruptedException {
		buttonclick("'usecaptcha_surveyaccess_opt1'");
		Page_first();
	}
	//注册时启用验证码
	@Test
	public void test42() throws InterruptedException {
		buttonclick("'allowregister_opt1'");
		buttonclick("'usecaptcha_registration_opt1'");
		Page_first();
	}
	//保存时启用验证码
	@Test
	public void test43() throws InterruptedException {
		buttonclick("'usecaptcha_saveandload_opt1'");
	}

	
	

}
