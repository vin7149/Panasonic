package com.test.automation.panasonic;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddNewUserTest extends GlobalClass {
	public static String EmailId;
	public static String UserName;
  @BeforeTest
  public void main() throws IOException, InterruptedException {
	  ChromeBrowser();
		login();
		addNewUsermethod();
		
  }

  @Test
  public void addNewUsermethod() throws InterruptedException, IOException {
	// click on admin
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/app/main/pages/ba-sidebar/aside/ba-menu/div/ul/ba-menu-item[3]/li/a/span")).click();
			// click on Cutomer Admin
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/app/main/pages/ba-sidebar/aside/ba-menu/div/ul/ba-menu-item[3]/li/ul/ba-menu-item[1]/li/a/span")).click();
			// click on Add Customer
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/app/main/pages/div/div/admin/data-tables/div/div[2]/div[1]/div[2]/button")).click();
			Thread.sleep(2000);
		    EmailId=newEmailId();
			String Array[]=EmailId.split("@");
			UserName=Array[0].toString();
			System.out.println("UserName is"+UserName);
			System.out.println("Value of Random Number is"+rand_int);
			driver.findElement(By.id("custName")).sendKeys(UserName);
			Thread.sleep(2000);
			driver.findElement(By.id("contactNo")).sendKeys("1234567890");
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/customer-add/div/div/form/div/div/div[1]/div[3]/div/div[2]/textarea")).sendKeys("Test Address");
			Thread.sleep(2000);
			driver.findElement(By.id("pointOfContactName")).sendKeys(UserName);
			Thread.sleep(2000);
			
			System.out.println("Email Id is "+EmailId);
			driver.findElement(By.id("pointOfContactEmail")).sendKeys(EmailId);
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/customer-add/div/div/form/div/div/div[2]/div[2]/div/div[2]/input")).sendKeys("5");
			// driver.findElement(By.x)
			driver.findElement(By.id("licenceEndDate")).click();
			Thread.sleep(2000);
			Select yeardrp = new Select(driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/customer-add/div/div/form/div/div/div[2]/div[3]/div[2]/my-date-input/ngb-datepicker/div[1]/ngb-datepicker-navigation/ngb-datepicker-navigation-select/select[2]")));
			yeardrp.selectByValue("2020");
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/customer-add/div/div/form/div/div/div[2]/div[3]/div[2]/my-date-input/ngb-datepicker/div[2]/div/ngb-datepicker-month-view/div[6]/div[2]/div")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/customer-add/div/div/form/div/div/div[3]/button")).click();
			Thread.sleep(20000);
			driver.findElement(By.xpath("//*[@id=\"user-profile-dd\"]/div[1]/div")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"mobile_only_nav\"]/div[1]/div/ul/li[4]/a")).click();
			Thread.sleep(2000);
			driver.navigate().to("http://www.yopmail.com/en/");
			driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(EmailId);
			Thread.sleep(2000);
			driver.findElement(By.className("sbut")).click();
			driver.switchTo().frame(driver.findElement(By.id("ifmail")));
			driver.findElement(By.xpath("//*[@id=\"mailmillieu\"]/div[2]/a")).click();
			Thread.sleep(5000);
			ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(newTab.get(1));
			Thread.sleep(5000);
			driver.findElement(By.id("inputEmail3")).sendKeys("12345678");
			driver.findElement(By.id("inputEmail4")).sendKeys("12345678");
			driver.findElement(By.className("login-btn")).click();
			Thread.sleep(10000);
			driver.get(getUrl());
			Thread.sleep(5000);
			driver.findElement(By.id(prop.getProperty("usernamexpath"))).sendKeys(EmailId);
			Thread.sleep(500);
			driver.findElement(By.id(prop.getProperty("passwordxpath"))).sendKeys("12345678");
			waitforelement();
			driver.findElement(By.xpath(prop.getProperty("clickLogin"))).click();
			
			System.out.println("User Added Successfully");
  }
}
