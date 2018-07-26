package com.test.automation.panasonic;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ResetPasswordTest extends GlobalClass {

  @BeforeTest
  public void main() throws IOException, InterruptedException {
	  ChromeBrowser();
	  driver.get(getUrl());
	  resetPasswordMethod();
  }

  @Test
  public void resetPasswordMethod() throws InterruptedException {
	  waitforelement();
	    driver.findElement(By.linkText("Forgot password?")).click();
	    waitforelement();
	    driver.findElement(By.id("inputEmail3")).sendKeys("vinauto15165@yopmail.com");
	    waitforelement();
	    driver.findElement(By.cssSelector("button.login-btn")).click();
	    waitforelement();
	    driver.navigate().to("http://www.yopmail.com/en/");
	    waitforelement();
	    driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys("vinauto15165@yopmail.com");
		waitforelement();
		driver.findElement(By.className("sbut")).click();
		driver.switchTo().frame(driver.findElement(By.id("ifmail")));
		driver.findElement(By.xpath("//*[@id=\"mailmillieu\"]/div[2]/a")).click();
		waitforelement();
		ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newTab.get(1));
		waitforelement();
		driver.findElement(By.id("inputEmail3")).sendKeys("12345678");
		waitforelement();
		driver.findElement(By.id("inputEmail4")).sendKeys("12345678");
		waitforelement();
		driver.findElement(By.className("login-btn")).click();
		waitforelement();
		waitforelement();
	    driver.findElement(By.id("inputEmail3")).sendKeys("vinauto15165@yopmail.com");
	    waitforelement();
	    driver.findElement(By.id("inputPassword3")).sendKeys("12345678");
	    waitforelement();
	    driver.findElement(By.cssSelector("button.login-btn")).click();
	    waitforelement();
	    System.out.println("Password Reset Successfully");
  }
}
