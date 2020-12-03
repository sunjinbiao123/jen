package com.webtest.page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AppearancePage extends BaseTest{

		WebDriver driver;
		public AppearancePage(WebDriver driver) {
			// TODO Auto-generated constructor stub
		
	
			this.driver=driver;
		}
		public void Navigation() {
				WebElement c=driver.findElement(By.id("navigationdelay"));
				c.clear();
				
		}
		public void Navigation(String count) {
			WebElement c=driver.findElement(By.id("navigationdelay"));
			c.clear();
			c.sendKeys(count);
			
		}
		public void showGroupInfo(String value) {
			WebElement  showIndex=driver.findElement(By.name("showgroupinfo"));
			Select select1=new Select(showIndex);
			select1.selectByValue(value);
			
		}
		public void showGroupCode(String code) {
			WebElement  showCode=driver.findElement(By.name("showqnumcode"));
			Select select2=new Select(showCode);
			select2.selectByValue(code);
		}

		

}
