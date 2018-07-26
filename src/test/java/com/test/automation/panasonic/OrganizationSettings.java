package com.test.automation.panasonic;

import java.io.FileInputStream;
import com.test.automation.panasonic.AddNewUser;
import java.io.IOException;
import java.util.Properties;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class OrganizationSettings extends GlobalClass  {
public static void main(String[] args) throws IOException, InterruptedException {
	    ChromeBrowser();
	    driver.get(getUrl());
	   
	    driver.findElement(By.id("inputEmail3")).clear();
	    driver.findElement(By.id("inputEmail3")).sendKeys("pratap.patil@impressico.com");
	 
	    driver.findElement(By.id("inputPassword3")).clear();
	    driver.findElement(By.id("inputPassword3")).sendKeys("test@123");
	    driver.findElement(By.cssSelector("button.login-btn")).click();
	
	    organizationalMethod();
	
	
}


     public static void organizationalMethod() throws InterruptedException, IOException {
	
    	 
    	 String Username=AddNewUser.UserName;
    	 if (Username==null) {
    	Username=Add_N_Impressionate_User.UserName;	 
    	 }	
   /* if(driver.getCurrentUrl().contains("https://pidev.impressicocrm.com")) {
   	 
    driver.findElement(By.linkText("Admin")).click();
	waitforelement();
	driver.findElement(By.xpath("//span[contains(text(),'Customer Management')]")).click();
	waitforelement();
	driver.findElement(By.xpath("(//i[@title='Access Account'])[1]")).click();	
   	waitforelement();
    }*/
    // Need to uncomment While Runnig on PanQA	 	
    driver.findElement(By.xpath("//button[contains(text(),'Default Location Hierarchy')]")).click();
    waitforelement();
    Thread.sleep(20000);
    driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
    waitforelement();
    Thread.sleep(20000);
    driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
    waitforelement();
    Thread.sleep(20000);
    
    //Setup Approval Work Flow.
    driver.findElement(By.xpath("//span[contains(text(),'Save')]")).click();
    waitforelement();
    Thread.sleep(20000);
  
    
    waitforelement();
    driver.findElement(By.xpath("//span[contains(text(),'Save')]")).click();
    //Add Group
    driver.findElement(By.xpath("//button[contains(text(),'Add Group')]")).click();
    waitforelement();
    Thread.sleep(20000);
    driver.findElement(By.id("deviceGroupName")).sendKeys("VintestGroup");
    waitforelement();
    Thread.sleep(20000);

    /*  driver.findElement(By.id("deviceGroupName")).clear();
    waitforelement();
    Thread.sleep(20000);*/
    
    //Add Group Details
    waitforelement();
    Thread.sleep(20000);
    driver.findElement(By.xpath("(//button[contains(text(),'Add Group')])[2]")).click();
    waitforelement();
    Thread.sleep(20000);
    driver.findElement(By.xpath("//button[contains(text(),'Complete')]")).click();
    waitforelement();
    Thread.sleep(20000);
    driver.findElement(By.cssSelector("li.al-sidebar-list-item.with-sub-menu > a.al-sidebar-list-link > span")).click();
    waitforelement();
    driver.findElement(By.xpath("//ul[@id='al-sidebar-list']/ba-menu-item[2]/li/ul/ba-menu-item[2]/li/a/span")).click();
    waitforelement();
    /*driver.findElement(By.xpath("//button[contains(text(),'Add User')]")).click();
    waitforelement();
    driver.findElement(By.id("fullname")).click();
    waitforelement();
    driver.findElement(By.id("fullname")).clear();
    waitforelement();
    driver.findElement(By.id("fullname")).sendKeys(Username+"approver");
    waitforelement();
    driver.findElement(By.xpath("(//input[@id='typeahead-template'])[1]")).sendKeys("+91");
    waitforelement();
    driver.findElement(By.id("mobile")).sendKeys("1234567890");
    waitforelement();
    driver.findElement(By.id("inputEmail3")).clear();
    waitforelement();
    driver.findElement(By.id("inputEmail3")).sendKeys(Username+"approver@yopmail.com");
    waitforelement();
    new Select(driver.findElement(By.id("role"))).selectByVisibleText("APPROVER");
    waitforelement();
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    waitforelement();
    longwaitforelement();*/
    driver.findElement(By.xpath("//button[contains(text(),'Add User')]")).click();
    waitforelement();
    driver.findElement(By.id("fullname")).click();
    waitforelement();
    driver.findElement(By.id("fullname")).clear();
    driver.findElement(By.id("fullname")).sendKeys(Username+"maker");
    waitforelement();
    driver.findElement(By.id("inputEmail3")).clear();
    waitforelement();
    driver.findElement(By.id("inputEmail3")).sendKeys(Username+"maker@yopmail.com");
    waitforelement();
//    driver.findElement(By.xpath("(//input[@id='typeahead-template'])[1]")).sendKeys("+91");
   waitforelement();
    driver.findElement(By.id("mobile")).sendKeys("1234567890");
    waitforelement();
    new Select(driver.findElement(By.id("role"))).selectByVisibleText("MAKER");
    waitforelement();
    driver.findElement(By.cssSelector("#role > option[value=\"4\"]")).click();
    waitforelement();
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    waitforelement();
    longwaitforelement();
    driver.findElement(By.xpath("//button[contains(text(),'Add User')]")).click();
    waitforelement();
    driver.findElement(By.id("fullname")).clear();
    driver.findElement(By.id("fullname")).sendKeys(Username+"viewer");
    waitforelement();
  //  driver.findElement(By.xpath("(//input[@id='typeahead-template'])[1]")).sendKeys("+91");
    waitforelement();
    driver.findElement(By.id("mobile")).sendKeys("1234567890");
    waitforelement();
    driver.findElement(By.id("inputEmail3")).clear();
    driver.findElement(By.id("inputEmail3")).sendKeys(Username+"viewer@yopmail.com");
    waitforelement();
    new Select(driver.findElement(By.id("role"))).selectByVisibleText("VIEW ONLY");
    waitforelement();
    driver.findElement(By.cssSelector("option[value=\"3\"]")).click();
    waitforelement();
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    waitforelement();
    longwaitforelement();
    driver.findElement(By.cssSelector("li.ba-sidebar-sublist-item > a.al-sidebar-list-link > span")).click();
    waitforelement();
    driver.findElement(By.xpath("//button[@type='button']")).click();
    waitforelement();
    driver.findElement(By.xpath("//input[@type='text']")).clear();
    driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Username+"customRole");
    waitforelement();
    driver.findElement(By.xpath("//textarea")).clear();
    driver.findElement(By.xpath("//textarea")).sendKeys(Username+"customRole");
    waitforelement();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[5]")).click();
    waitforelement();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[13]")).click();
    waitforelement();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[17]")).click();
    waitforelement();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[21]")).click();
    waitforelement();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[29]")).click();
    waitforelement();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[33]")).click();
    waitforelement();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[37]")).click();
    waitforelement();
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    waitforelement();
    driver.findElement(By.xpath("//span[contains(text(),'User Management')]")).click();
    waitforelement();
    driver.findElement(By.xpath("//button[contains(text(),'Add User')]")).click();
    waitforelement();
    new Select(driver.findElement(By.id("role"))).selectByVisibleText(Username+"customRole");
    waitforelement();
    driver.findElement(By.id("fullname")).clear();
    waitforelement();
    driver.findElement(By.id("fullname")).sendKeys(Username+"customRole");
    waitforelement();
    driver.findElement(By.id("inputEmail3")).clear();
    driver.findElement(By.id("inputEmail3")).sendKeys(Username+"custom@yopmail.com");
    waitforelement();
//    driver.findElement(By.xpath("(//input[@id='typeahead-template'])[1]")).sendKeys("+91");
    waitforelement();
    driver.findElement(By.id("mobile")).sendKeys("1234567890");
    waitforelement();
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    

}

}

	
	/*String Directory=System.getProperty("user.dir");
	System.out.println("User Directory is " +Directory);
	System.out.println("current Url is>>>>" +getUrl());
	newEmailId();
	*/
	
	/*// To print the Distinct number in the array 
	int[] array= {1,2,3,4,2,4,5,6};
	Boolean distinct=false;
	for(int i=0;i<array.length;i++)
	{
		distinct=false;
		for(int j=0;j<i;j++) {
			if(array[i]==array[j]) {
				distinct=true;
				break;
		}
				
		}

		if(distinct==false) 
		{
			System.out.print(array[i]+",");
		}
	}
*/
	

/*int [] array= {1,2,3,4,5,6,7,8};


	for(int j=array.length-1;j>=0;j--){
		
		System.out.print(array[j]+" " );*/
		
		

	



/*public static String getUrl() throws IOException {

	FileInputStream fp=new FileInputStream("C:\\Users\\vinod.rohilla\\eclipse-workspace\\panasonic\\Config\\OR.Properties");
	Properties prop=new Properties();
	prop.load(fp);
	String	URL=prop.getProperty("URL");
	System.out.println("Current URL is >>>>"+URL);
	return URL;
}*/

