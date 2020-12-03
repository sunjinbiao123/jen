package com.webtest.test;

import org.openqa.selenium.By;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import com.webtest.page.BaseTest;
import com.webtest.page.PlugPage;



public class PlugPageTest extends BaseTest{
	PlugPage Page6;
	@BeforeClass
	public void initClass() throws InterruptedException {
		 Page6  =new PlugPage(driver);
		 login("admin", "admin");
		 driver.findElement(By.linkText("配置")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.linkText("插件管理器")).click();
		 Thread.sleep(2000);
		 
	}
	//安装zip
	@Test
	public void test44() throws InterruptedException {
		Page6.file("D:\\297.zip");	
		
	}
	//扫描文件
	@Test
	public void test45() {
		Page6.scan();
		
	}
	//从文件系统中删除
	@Test
	public void test46() throws InterruptedException {
		Page6.scan();
		Thread.sleep(2000);
		Page6.delete_from_system();
	}
	//从文件系统中安装
	@Test
	public void test47() throws InterruptedException {
		Page6.scan();
		Thread.sleep(2000);
		Page6.load_from_system();
	}
	//激活插件
	@Test
	public void test48() throws InterruptedException {
		Page6.plug_activite();
	}
	//停用插件
	@Test
	public void test49() throws InterruptedException {
		Page6.plug_stop();
	}
	//卸载插件
	@Test
	public void test50() throws InterruptedException {
		Page6.plug_unload();
	}

	//排序
	@Test
	public void test51() {
		Page6.plug_sort();
	
	}


}
