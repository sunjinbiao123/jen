package com.webtest.page;

import org.apache.xmlbeans.impl.xb.substwsdl.impl.DefinitionsDocumentImpl;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PlugPage extends BaseTest {
	WebDriver driver;
	public PlugPage(WebDriver driver) {
		this.driver=driver;
	}
	public void file(String path) throws InterruptedException {
		driver.findElement(By.linkText("安装ZIP")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("the_file")).sendKeys(path);
		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
	}
	public void scan() {
		driver.findElement(By.linkText("扫描文件")).click();
	}
	public void delete_from_system() throws InterruptedException {
		
		driver.findElement(By.xpath("//a[@class='btn btn-danger']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("返回插件管理器")).click();
	
		
	}
	public void load_from_system() throws InterruptedException {
	
		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
		Thread.sleep(2000);

		
	}
	public void  plug_activite() throws InterruptedException {
		driver.findElement(By.xpath("//button[@class='btntooltip btn btn-default btn-xs']")).click();
		Thread.sleep(1000);
		
	}
	public void plug_stop() throws InterruptedException {
		driver.findElement(By.xpath("//button[@class='btntooltip btn btn-warning btn-xs']")).click();
		Thread.sleep(1000);
		Alert a=driver.switchTo().alert();   //点击确认
		a.accept();
	   
	}
	public void plug_unload() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btntooltip btn btn-danger btn-xs']")).click();
		Thread.sleep(1000);
		Alert b=driver.switchTo().alert(); 
		b.accept();
		
	}
	public void plug_sort() {
		driver.findElement(By.linkText("状态")).click();
	}
	

}
