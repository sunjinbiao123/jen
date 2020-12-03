package com.webtest.test;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.page.BaseTest;
import com.webtest.page.MenuPage;


public class MenuPageTeset extends BaseTest {
	MenuPage Page7;
	@BeforeClass
	public void initClass() throws InterruptedException {
		 Page7  =new MenuPage(driver);
		 login("admin", "admin");
		 driver.findElement(By.linkText("配置")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.linkText("菜单设置")).click();
		 Thread.sleep(2000);
		 
	}
	//错误创建
	@Test
	public void test52() throws InterruptedException {
		Page7.create_menu("2","axcv");
		
	}

	//正确创建
	@Test
	public void test53() throws InterruptedException {
		Page7.create_menu("1", "1", "sunjinbiao123");
	}
	//重置
	@Test
	public void test54() throws InterruptedException {
		Page7.reset();
		
	}

}
