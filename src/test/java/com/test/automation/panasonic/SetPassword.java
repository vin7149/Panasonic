package com.test.automation.panasonic;

import java.util.ArrayList;

import org.openqa.selenium.By;

public class SetPassword extends GlobalClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeBrowser();
		setAllPassword();
	}

	public static void setAllPassword() throws InterruptedException {
		
			ChromeBrowser();
			String Username="vinauto14322";
		// 	String Username=AddNewUser.UserName;
		 	String approver=Username+"approver@yopmail.com";
		 	String viewer=Username+"viewer@yopmail.com";
		 	String maker=Username+"maker@yopmail.com";
		 	String customUser=Username+"custom@yopmail.com";
		 	
		 	//Set Password for Approver
		 	driver.navigate().to("http://www.yopmail.com/en/");
		 	driver.findElement(By.xpath("//*[@id=\"login\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(approver);
			Thread.sleep(2000);
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
			
			//Set Password for Maker
		 	driver.navigate().to("http://www.yopmail.com/en/");
		 	driver.findElement(By.xpath("//*[@id=\"login\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(maker);
			Thread.sleep(2000);
			Thread.sleep(2000);
			driver.findElement(By.className("sbut")).click();
			driver.switchTo().frame(driver.findElement(By.id("ifmail")));
			driver.findElement(By.xpath("//*[@id=\"mailmillieu\"]/div[2]/a")).click();
			Thread.sleep(5000);
			newTab = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(newTab.get(2));
			Thread.sleep(5000);
			driver.findElement(By.id("inputEmail3")).sendKeys("12345678");
			driver.findElement(By.id("inputEmail4")).sendKeys("12345678");
			driver.findElement(By.className("login-btn")).click();
			
			//Set Password for Viewer
		 	driver.navigate().to("http://www.yopmail.com/en/");
		 	driver.findElement(By.xpath("//*[@id=\"login\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(viewer);
			Thread.sleep(2000);
			Thread.sleep(2000);
			driver.findElement(By.className("sbut")).click();
			driver.switchTo().frame(driver.findElement(By.id("ifmail")));
			driver.findElement(By.xpath("//*[@id=\"mailmillieu\"]/div[2]/a")).click();
			Thread.sleep(5000);
			newTab = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(newTab.get(3));
			Thread.sleep(5000);
			driver.findElement(By.id("inputEmail3")).sendKeys("12345678");
			driver.findElement(By.id("inputEmail4")).sendKeys("12345678");
			driver.findElement(By.className("login-btn")).click();
			
			//Set Password for CustomUser
		 	driver.navigate().to("http://www.yopmail.com/en/");
		 	driver.findElement(By.xpath("//*[@id=\"login\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(customUser);
			Thread.sleep(2000);
			Thread.sleep(2000);
			driver.findElement(By.className("sbut")).click();
			driver.switchTo().frame(driver.findElement(By.id("ifmail")));
			driver.findElement(By.xpath("//*[@id=\"mailmillieu\"]/div[2]/a")).click();
		
			newTab = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(newTab.get(4));
			Thread.sleep(5000);
			driver.findElement(By.id("inputEmail3")).sendKeys("12345678");
			driver.findElement(By.id("inputEmail4")).sendKeys("12345678");
			driver.findElement(By.className("login-btn")).click();
			System.out.println("All User Password Set Successfully");
			
			driver.quit();
			
	}
}
