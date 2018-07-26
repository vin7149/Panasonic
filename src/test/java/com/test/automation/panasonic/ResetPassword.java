package com.test.automation.panasonic;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;

public class ResetPassword extends GlobalClass {
	String Email=GlobalClass.EmailId;
	public static void main(String[] args) throws IOException, InterruptedException {
		
	   /* ChromeBrowser();
	    driver.get(getUrl());*/
	    resetPasswordMethod();
	    
	}
	
	public static void resetPasswordMethod() throws InterruptedException, IOException {
		ChromeBrowser();
		driver.get(getUrl());
	    waitforelement();
	    String RandomEmailid=AddNewUser.randomEmailId;
	    
	    /*static Email Id*/
	 //   String RandomEmailid="testingVin1@yopmail.com";
	    
	    driver.findElement(By.linkText("Forgot password?")).click();
	    waitforelement();
	    driver.findElement(By.id("inputEmail3")).sendKeys(RandomEmailid);
	    waitforelement();
	    driver.findElement(By.cssSelector("button.login-btn")).click();
	    waitforelement();
	    driver.navigate().to("http://www.yopmail.com/en/");
	    waitforelement();
	    driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(RandomEmailid);
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
		System.out.println("Password Reset Successfully");
		waitforelement();
		driver.get(URL);
		waitforelement();
	    driver.findElement(By.id("inputEmail3")).sendKeys(RandomEmailid);
	    waitforelement();
	    driver.findElement(By.id("inputPassword3")).sendKeys("12345678");
	    waitforelement();
	    driver.findElement(By.cssSelector("button.login-btn")).click();
	    waitforelement();
		driver.findElement(By.xpath("//*[@id=\"user-profile-dd\"]/div[1]/div")).click();
		waitforelement();
		driver.findElement(By.xpath("html/body/app/main/pages/ba-page-top/div/div[2]/div[1]/div/ul/li[2]/a")).click();
		waitforelement();
		driver.findElement(By.xpath("//span[@class='onoffswitch-switch']")).click();
		waitforelement();
		driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		longwaitforelement();
		driver.findElement(By.xpath("//*[@id=\"user-profile-dd\"]/div[1]/div")).click();
		longwaitforelement();
		driver.findElement(By.xpath("html/body/app/main/pages/ba-page-top/div/div[2]/div[1]/div/ul/li[2]/a")).click();
	/*	waitforelement();
		driver.findElement(By.xpath("(//a/i[@class=\"zmdi zmdi-power\"])[2]")).click();
		waitforelement();*/
	    System.out.println("CMS Activated Successfully");
	    driver.quit();

	}
	

}
