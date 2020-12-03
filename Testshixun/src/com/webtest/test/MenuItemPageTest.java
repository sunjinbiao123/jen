package com.webtest.test;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.page.BaseTest;
import com.webtest.page.MenuItemPage;

public class MenuItemPageTest extends BaseTest{
	MenuItemPage Page8;
	@BeforeClass
	public void initClass() throws InterruptedException {
		 Page8  =new MenuItemPage(driver);
		 login("admin", "admin");
		 driver.findElement(By.linkText("配置")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.linkText("菜单项设置")).click();
		 Thread.sleep(2000);
		 
	}

	@Test
	public void  test55() throws InterruptedException {
		Page8.find("1");
		Page_final();
	
	}

}
