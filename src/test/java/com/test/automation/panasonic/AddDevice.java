package com.test.automation.panasonic;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class AddDevice extends GlobalClass {

	public static String Template="Template"+randomNumber();
	public static void main(String[] args) throws IOException, InterruptedException  {
		// TODO Auto-generated method stub
		
		    ChromeBrowser();
		    driver.get(getUrl());
		    driver.findElement(By.id("inputEmail3")).clear();
		    driver.findElement(By.id("inputEmail3")).sendKeys("TestingVIn@yopmail.com");
		    driver.findElement(By.id("inputPassword3")).clear();
		    driver.findElement(By.id("inputPassword3")).sendKeys("12345678");
		    driver.findElement(By.cssSelector("button.login-btn")).click();
		
		    addDeviceMethod();
		
	}
	
	public static void addDeviceMethod() throws InterruptedException {
		waitforelement();
		driver.findElement(By.xpath("//span[contains(text(),'Device Management')]")).click();
		waitforelement();
		driver.findElement(By.xpath("//span[contains(text(),'Register a New Device')]")).click();
		waitforelement();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[contains(text(),'Add Media Player')]")).click();
		waitforelement();
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("TestinDevice");
		waitforelement();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("TestinDevice");
		waitforelement();
		driver.findElement(By.xpath("//input[@value='Get']")).click();
		waitforelement();
		driver.findElement(By.xpath("(//span[@class='toggle-children'])[2]")).click();
		waitforelement();
		driver.findElement(By.xpath("(//span[@class='toggle-children-wrapper toggle-children-wrapper-collapsed'])[10]")).click();
		waitforelement();
		driver.findElement(By.xpath("(//span[@class='checkmark'])[9]")).click();
		waitforelement();
		driver.findElement(By.xpath("//button[@class='btn shinygreen medium']")).click();
		waitforelement();
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("TestingDevice");
		waitforelement();
		new Select(driver.findElement(By.xpath("//select[@formcontrolname='deviceOs']"))).selectByVisibleText("WINDOWS");
		waitforelement();
		new Select(driver.findElement(By.xpath("//select[@formcontrolname='deviceGroupId']"))).selectByIndex(0);
		waitforelement();
		driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
		waitforelement();
		driver.findElement(By.xpath("//button[contains(text(),'Save & Close')]")).click();
		waitforelement();
		System.out.println("Device Added Successfully");
	
	
	
	}


}
