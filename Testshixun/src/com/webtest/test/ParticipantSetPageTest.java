package com.webtest.test;

import org.apache.xmlbeans.impl.xb.xsdschema.impl.PublicImpl;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.webtest.page.BaseTest;
import com.webtest.page.ParticipantSetPage;

public class ParticipantSetPageTest  extends BaseTest{
	ParticipantSetPage Page3;
	@BeforeClass
	public void initClass() throws InterruptedException {
		 Page3  =new ParticipantSetPage(driver);
		 login("admin", "admin");
		 driver.findElement(By.linkText("配置")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.linkText("调查全局设置")).click();
		 Thread.sleep(2000);
		 
	}
	@BeforeMethod
	public void beforeMethod() {
		driver.findElement(By.id("sidemenu_tokens")).click();
	}
	@AfterMethod
	public void AfterMethod() {
		driver.findElement(By.linkText("保存")).click();
	}
	//匿名回答开启
	@Test
	public void test29() throws InterruptedException {
		buttonclick("'anonymized_opt1'");
		Page_first();
	}
	//允许公开注册
	@Test
	public void test30() throws InterruptedException {
		buttonclick("'allowregister_opt1'");
		Page_first();
	}
	//不允许公开注册
	@Test
	public void test31() throws InterruptedException {
		buttonclick("'allowregister_opt2'");
		Page_first();
	}

	//启用基于参与者的响应持久性
	@Test
	public void test32() throws InterruptedException {
		buttonclick("'tokenanswerspersistence_opt1'");
	}

	//邮件启动html格式
	@Test
	public void test33() throws InterruptedException {
		buttonclick("'htmlemail_opt1'");
	}

	//发送确认邮件开启
	@Test
	public void test34() throws InterruptedException {
		buttonclick("'sendconfirmation_opt1'");
	}



}
