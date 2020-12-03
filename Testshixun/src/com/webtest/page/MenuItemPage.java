package com.webtest.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


public class MenuItemPage  extends BaseTest{
	WebDriver driver;
	public MenuItemPage (WebDriver driver) {
		this.driver=driver;
	}
	public void find(String value) throws InterruptedException {

		Thread.sleep(1000);
		driver.findElement(By.id("SurveymenuEntries_ordering")).sendKeys(value);
		Actions actions =new Actions(driver);
		actions.sendKeys(Keys.ENTER).perform();
		
	}

}
