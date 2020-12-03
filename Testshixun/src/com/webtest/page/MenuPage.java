package com.webtest.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class MenuPage  extends BaseTest{
	WebDriver driver;
	public MenuPage(WebDriver driver) {
		this.driver=driver;
	}
	public void create_menu(String value1,String name) throws InterruptedException {
		driver.findElement(By.linkText("新建")).click();
		Thread.sleep(5000);
		WebElement show=driver.findElement(By.xpath("//select[@id='Surveymenu_parent_id']"));	
		Select select1=new Select(show);
		select1.selectByValue(value1);
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//input[@class='input-60 form-control']")).sendKeys(name);

		driver.findElement(By.name("yt0")).click();
		Thread.sleep(2000);
		Actions actions=new Actions(driver);
		actions.sendKeys(Keys.ESCAPE).perform();
	}
	public void create_menu(String value1,String value2,String name) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.linkText("新建")).click();
		Thread.sleep(5000);
		WebElement show=driver.findElement(By.xpath("//select[@id='Surveymenu_parent_id']"));	
		Select select1=new Select(show);
		select1.selectByValue(value1);
		Thread.sleep(2000);	
		WebElement show2=driver.findElement(By.xpath("//select[@id='Surveymenu_ordering']"));	
		Select s2=new Select(show2);
		s2.selectByValue(value2);
		driver .findElement(By.id("Surveymenu_showincollapse")).click();
		driver.findElement(By.xpath("//input[@class='input-60 form-control']")).sendKeys(name);
		driver.findElement(By.name("yt0")).click();
		
	}
	public void reset()throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.linkText("重置")).click();
		Thread.sleep(2000);
		
		driver .findElement(By.id("reset-menus-confirm")).click();
		
	}

}
