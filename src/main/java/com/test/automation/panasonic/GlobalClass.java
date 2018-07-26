package com.test.automation.panasonic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.json.StaticInitializerCoercer;

import com.google.common.util.concurrent.Service.State;

public class GlobalClass {
	
	public static WebDriver driver;
	public static String EmailId;
	
	public static Properties prop=new Properties();
	public static String URL=null;
	public static String Directory=System.getProperty("user.dir");
	public static int rand_int=0;
	
	
	public static void ChromeBrowser() {
	System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
	}
	
	public static String getUrl() throws IOException {
	
		FileInputStream fp=new FileInputStream("C:\\Users\\vinod.rohilla\\eclipse-workspace\\panasonic\\Config\\OR.Properties");
		prop.load(fp);
		URL=prop.getProperty("URL");
		System.out.println("Current URL is >>>>"+URL);
		return URL;
	}
	
	public static String newEmailId() {
	  Random rand = new Random();
	  rand_int = rand.nextInt(100000);
      EmailId="vinauto"+rand_int+"@yopmail.com";
      System.out.println("Random Email Id is >>"+EmailId);
	  return EmailId;
				
	}
	
	public static void login() throws IOException, InterruptedException {
		
		driver.get(getUrl());
		driver.findElement(By.id(prop.getProperty("usernamexpath"))).sendKeys(prop.getProperty("getadminEmail"));
		Thread.sleep(500);
		driver.findElement(By.id(prop.getProperty("passwordxpath"))).sendKeys(prop.getProperty("getadminpass"));
		waitforelement();
		driver.findElement(By.xpath(prop.getProperty("clickLogin"))).click();
	}

	public static void waitforelement() throws InterruptedException {
		Thread.sleep(10000);
	}
	
	public static void longwaitforelement() throws InterruptedException {
		Thread.sleep(20000);
	}
	
	public static int randomNumber() {
		Random rand = new Random();
		 return rand_int = rand.nextInt(100000);
		
	}
}
