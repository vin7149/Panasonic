package com.test.automation.panasonic;

import java.io.IOException;

import org.openqa.selenium.By;

public class AddTemplate extends GlobalClass {

	public static String Template="Template"+randomNumber();
	public static void main(String[] args) throws IOException, InterruptedException  {
		// TODO Auto-generated method stub
		
		    ChromeBrowser();
		    driver.get(getUrl());
		    driver.findElement(By.id("inputEmail3")).clear();
		    driver.findElement(By.id("inputEmail3")).sendKeys("vinauto15165@yopmail.com");
		    driver.findElement(By.id("inputPassword3")).clear();
		    driver.findElement(By.id("inputPassword3")).sendKeys("12345678");
		    driver.findElement(By.cssSelector("button.login-btn")).click();
		
		    addTemplateMethod();
		
	}

	
	public static void addTemplateMethod() throws InterruptedException {
		
		driver.findElement(By.xpath("(//span[contains(text(),'CMS')])[1]")).click();
		waitforelement();
		driver.findElement(By.xpath("//span[contains(text(),'Template')]")).click();
		waitforelement();
		driver.findElement(By.linkText("Add Template")).click();
		waitforelement();
		driver.findElement(By.id("txtTemplateName")).sendKeys(Template);
		waitforelement();
		driver.findElement(By.id("txtTemplateDescription")).sendKeys("Testing");
		waitforelement();
		driver.findElement(By.xpath("html/body/app/main/pages/div/div/cms/template-save/div/div[3]/form/div[2]/div[2]/div/div[2]/ul/li[1]/a/img")).click();
		waitforelement();
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
	    System.out.println("Template Script Complete");
		
	}



	}


