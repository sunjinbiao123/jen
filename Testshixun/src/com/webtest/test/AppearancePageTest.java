package com.webtest.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.webtest.page.AppearancePage;
import com.webtest.page.BaseTest;


public class AppearancePageTest extends BaseTest {
	AppearancePage Page2;
	@BeforeClass
	public void initClass() throws InterruptedException {
		 Page2  =new AppearancePage(driver);
		 login("admin", "admin");
		 driver.findElement(By.linkText("配置")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.linkText("调查全局设置")).click();
		 Thread.sleep(2000);
		 
	}
	@BeforeMethod
	public void beforeMethod() {
		driver.findElement(By.id("sidemenu_presentation")).click();
	}
	@AfterMethod
	public void AfterMethod() {
		driver.findElement(By.linkText("保存")).click();
		
	}

	//导航数据
	@Test
	public void test9() throws InterruptedException {
		Page2 .Navigation();
		Page_md();
	}
	@Test
	public void test10() {
		Page2.Navigation("-1");
	}
	@Test
	public void test11() {
		Page2.Navigation("2");
	}
	//显示问题索引
	@Test
	public void test12() throws InterruptedException {
		buttonclick("'questionindex_opt2'");
		Page_md();
	}
	@Test
	public void test13()throws InterruptedException {
		buttonclick("'questionindex_opt3'");
		Page_md();
	}
	//显示问题组名
	@Test
	public void test14() throws InterruptedException {
		Page2.showGroupInfo("B");
		Page_md();

	}
	@Test
	public void test15() throws InterruptedException {
		Page2.showGroupInfo("N");
		Page_md();
	}
	@Test
	public void test16() throws InterruptedException {
		Page2.showGroupInfo("D");
		Page_md();
	}
	
	@Test
	public void test17() throws InterruptedException {
		Page2.showGroupInfo("X");
		Page_md();
	}
	//显示问题编号，编码
	@Test
	public void test18() throws InterruptedException {
		Page2.showGroupCode("B");
		Page_md();
	}
	@Test
	public void test19() throws InterruptedException {
		Page2.showGroupCode("N");
		Page_md();
	}
	@Test
	public void test20() throws InterruptedException {
		Page2.showGroupCode("C");
		Page_md();
	}
	@Test
	public void test21() throws InterruptedException {
		Page2.showGroupCode("X");
		Page_md();
	}
	//显示问题数
	@Test
	public void test22() throws InterruptedException {
		buttonclick("'showxquestions_opt1'");
		Page_first();
	}
	//欢迎界面
	@Test
	public void test23()throws InterruptedException{
		buttonclick("'showwelcome_opt1'");
		Page_first();
	}
	//显示后退导航
	@Test
	public void test24() throws InterruptedException {
		buttonclick("'allowprev_opt1'");
		Page_md();
	}
	//显示进度条
	@Test
	public void test25() throws InterruptedException {
		buttonclick("'showprogress_opt1'");
		Page_final();
	}
	//显示参与者打印答案
	@Test
	public void test26() throws InterruptedException {
		buttonclick("'printanswers_opt1'");
		Page_final();
	}
	//公开统计数据
	@Test
	public void test27() throws InterruptedException {
		buttonclick("'publicstatistics_opt1'");
		Page_final();
	}
	//公开统计内显示统计图
	@Test
	public void test28() throws InterruptedException {
		buttonclick("'publicgraphs_opt1'");
		
	}

	
	
	
	
}
