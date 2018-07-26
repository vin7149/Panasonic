package com.test.automation.panasonic;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterNewUser {
	public static WebDriver driver;
	public static String EmailId;
	public static String URL;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://192.168.0.91:9003/#/login");
		//login
		driver.findElement(By.xpath("//*[@id=\"inputEmail3\"]")).sendKeys("a@a.com");
		driver.findElement(By.xpath("//*[@id=\"inputPassword3\"]")).sendKeys("test@123");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/app/main/login/div/div/div[1]/div[2]/form/div/button")).click();
		// click on admin
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/app/main/pages/ba-sidebar/aside/ba-menu/div/ul/ba-menu-item[3]/li/a/span")).click();
		// click on Cutomer Admin
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/app/main/pages/ba-sidebar/aside/ba-menu/div/ul/ba-menu-item[3]/li/ul/ba-menu-item[1]/li/a/span")).click();
		// click on Add Customer
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/app/main/pages/div/div/admin/data-tables/div/div[2]/div[1]/div[2]/button")).click();
		Random rand = new Random();
		  // Generate random integers in range 0 to 999
        int rand_int = rand.nextInt(100000);
        EmailId="vinauto"+rand_int+"@yopmail.com";
        System.out.println("Random Email Id is >>"+EmailId);
        driver.findElement(By.id("custName")).sendKeys("vinod"+rand_int+"");
        driver.findElement(By.id("contactNo")).sendKeys("1234567890");
        driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/addcustomer/div/div/form/div/div/div[1]/div[3]/div/div[2]/textarea")).sendKeys("Test Address");
        driver.findElement(By.id("pointOfContactName")).sendKeys("VinodTest");
        driver.findElement(By.id("pointOfContactEmail")).sendKeys(EmailId);
        driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/addcustomer/div/div/form/div/div/div[2]/div[2]/div/div[2]/input")).sendKeys("5");
        //driver.findElement(By.x)
        driver.findElement(By.id("licenceEndDate")).click();
        Select yeardrp= new Select(driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/addcustomer/div/div/form/div/div/div[2]/div[3]/div[2]/my-date-input/ngb-datepicker/div[1]/ngb-datepicker-navigation/ngb-datepicker-navigation-select/select[2]")));
        yeardrp.selectByValue("2020");
        driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/addcustomer/div/div/form/div/div/div[2]/div[3]/div[2]/my-date-input/ngb-datepicker/div[2]/div/ngb-datepicker-month-view/div[6]/div[2]/div")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/addcustomer/div/div/form/div/div/div[3]/button")).click();
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
        driver.findElement(By.id("inputEmail3")).sendKeys("1234");
        driver.findElement(By.id("inputEmail4")).sendKeys("1234");
        driver.findElement(By.className("login-btn")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//*[@id=\"inputEmail3\"]")).sendKeys(EmailId);
		driver.findElement(By.xpath("//*[@id=\"inputPassword3\"]")).sendKeys("1234");
		driver.findElement(By.xpath("/html/body/app/main/login/div/div/div[1]/div[2]/form/div/button")).click();
		Thread.sleep(5000);
		System.out.println("Script is Completed");
		driver.close();

	}

}
