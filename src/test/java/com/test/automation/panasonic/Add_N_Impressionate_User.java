package com.test.automation.panasonic;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Add_N_Impressionate_User extends GlobalClass {

	public static String EmailId;
	public static String UserName;
	
	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeBrowser();
		login();
		Add_N_Impressionate_UserMethod();
		
	}
		public static void Add_N_Impressionate_UserMethod() throws InterruptedException, IOException {
		// click on admin
		waitforelement();
		driver.findElement(By.xpath("/html/body/app/main/pages/ba-sidebar/aside/ba-menu/div/ul/ba-menu-item[3]/li/a/span")).click();
		// click on Cutomer Admin
		waitforelement();
		driver.findElement(By.xpath("/html/body/app/main/pages/ba-sidebar/aside/ba-menu/div/ul/ba-menu-item[3]/li/ul/ba-menu-item[1]/li/a/span")).click();
		// click on Add Customer
		waitforelement();
		driver.findElement(By.xpath("/html/body/app/main/pages/div/div/admin/data-tables/div/div[2]/div[1]/div[2]/button")).click();
		waitforelement();
	    EmailId=newEmailId();
		String Array[]=EmailId.split("@");
		UserName=Array[0].toString();
		System.out.println("UserName is"+UserName);
		System.out.println("Value of Random Number is"+rand_int);
		driver.findElement(By.id("custName")).sendKeys(UserName);
		
		waitforelement();
		driver.findElement(By.xpath("(//input[@id='typeahead-template'])[1]")).sendKeys("+91");
		waitforelement();
		driver.findElement(By.id("contactNo")).sendKeys("1234567890");
		waitforelement();
		driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/customer-add/div/div/form/div/div/div[1]/div[3]/div/div[2]/textarea")).sendKeys("Test Address");
		waitforelement();
		driver.findElement(By.id("pointOfContactName")).sendKeys(UserName);
		waitforelement();
		System.out.println("Email Id is "+EmailId);
		driver.findElement(By.id("pointOfContactEmail")).sendKeys(EmailId);
		waitforelement();
		driver.findElement(By.xpath("(//input[@id='typeahead-template'])[2]")).sendKeys("+91");
		waitforelement();
		driver.findElement(By.xpath("//input[@placeholder='Alternate Number']")).sendKeys("1234567890");
		waitforelement();

		
		
		driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/customer-add/div/div/form/div/div/div[2]/div[2]/div/div[2]/input")).sendKeys("5");
		// driver.findElement(By.x)
		driver.findElement(By.id("licenceEndDate")).click();
		waitforelement();
		Select yeardrp = new Select(driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/customer-add/div/div/form/div/div/div[2]/div[3]/div[2]/my-date-input/ngb-datepicker/div[1]/ngb-datepicker-navigation/ngb-datepicker-navigation-select/select[2]")));
		yeardrp.selectByValue("2020");
		waitforelement();
		driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/customer-add/div/div/form/div/div/div[2]/div[3]/div[2]/my-date-input/ngb-datepicker/div[2]/div/ngb-datepicker-month-view/div[6]/div[2]/div")).click();
		waitforelement();
		driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/customer-add/div/div/form/div/div/div[3]/button")).click();
		
	/*	Impressionate the User*/
		
		waitforelement();
		//driver.findElement(By.xpath("(//i[@class='fa fa-asl-interpreting'])[1]")).click();
		driver.findElement(By.xpath("(//i[@title='Access Account'])[1]")).click();
		
		waitforelement();
		
		OrganizationSettings.organizationalMethod();
		AddDevice.addDeviceMethod();
		waitforelement();
		AddTemplate.addTemplateMethod();
		waitforelement();
		driver.findElement(By.xpath("//div[@class='profile-icon'] ")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@ng-reflect-router-link=\"/logout\"]")).click();
		ResetPassword.resetPasswordMethod();

		System.out.println("Script is Completed");
		
		
	}

}