package com.test.automation.panasonic;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddMediaTest extends GlobalClass {

  @Test
  public void AddingMedia() throws InterruptedException {
	  	driver.findElement(By.xpath("(//span[contains(text(),'CMS')])[1]")).click();
		waitforelement();
		driver.findElement(By.xpath("//span[contains(text(),'Media Library')]")).click();
		waitforelement();
		driver.findElement(By.xpath("//span[contains(text(),'Add Media')]")).click();
		waitforelement();
		driver.findElement(By.xpath("//button[contains(text(),'Choose Content Type')]")).click();
		waitforelement();
		driver.findElement(By.xpath("html/body/ngb-modal-window/div/div/add-media/div/div/div[2]/div/div/div/div/div/div/div/ul/li[1]/a")).click();
		System.out.println("Media Libary Sript Complete");
  }

  @BeforeTest
  public void main() throws IOException, InterruptedException {
	  ChromeBrowser();
	    driver.get(getUrl());
	    driver.findElement(By.id("inputEmail3")).clear();
	    driver.findElement(By.id("inputEmail3")).sendKeys("vinyop@yopmail.com");
	    driver.findElement(By.id("inputPassword3")).clear();
	    driver.findElement(By.id("inputPassword3")).sendKeys("1234");
	    driver.findElement(By.cssSelector("button.login-btn")).click();
	    AddingMedia();
  }
}
