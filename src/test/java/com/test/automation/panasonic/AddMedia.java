package com.test.automation.panasonic;

import java.io.IOException;

import org.openqa.selenium.By;

public class AddMedia extends GlobalClass {

	public static String UserEmailid="vinauto8929@yopmail.com";
//	public static String Template="Template"+randomNumber();
	public static void main(String[] args) throws IOException, InterruptedException  {
		// TODO Auto-generated method stub
		
		    ChromeBrowser();
		    driver.get(getUrl());
		    driver.findElement(By.id("inputEmail3")).clear();
		    driver.findElement(By.id("inputEmail3")).sendKeys(UserEmailid);
		    driver.findElement(By.id("inputPassword3")).clear();
		    driver.findElement(By.id("inputPassword3")).sendKeys("12345678");
		    driver.findElement(By.cssSelector("button.login-btn")).click();
		    Thread.sleep(20000);
		    driver.findElement(By.xpath("(//span[contains(text(),'CMS')])[1]")).click();
		
		    
		    addingImageMedia();
		    waitforelement();
		    /*addingAudioMedia();
		    longwaitforelement();
		    longwaitforelement();
		    addingVideoMedia();*/
		    System.out.println("Media Libary Sript Complete");

	}

	public static void addingVideoMedia() throws InterruptedException, IOException {
	
	/*driver.findElement(By.xpath("(//span[contains(text(),'CMS')])[1]")).click();
	waitforelement();*/
	driver.findElement(By.xpath("//span[contains(text(),'Media Library')]")).click();
	waitforelement();
	driver.findElement(By.xpath("//span[contains(text(),'Add Media')]")).click();
	waitforelement();
	driver.findElement(By.xpath("//button[contains(text(),'Choose Content Type')]")).click();
	waitforelement();
	driver.findElement(By.xpath("html/body/ngb-modal-window/div/div/add-media/div/div/div[2]/div/div/div/div/div/div/div/ul/li[1]/a")).click();
	waitforelement();
	driver.findElement(By.xpath("//input[@type='file']")).click();
	waitforelement();
	Runtime.getRuntime().exec("C:\\Users\\vinod.rohilla\\Desktop\\AutoItScript\\AllVideoFileUploadNew.exe");
	waitforelement();
	driver.findElement(By.xpath("//button[@class=\"btn btn-success btn-s\"]")).click();
	longwaitforelement();
	longwaitforelement();
	longwaitforelement();
	longwaitforelement();
	longwaitforelement();
	longwaitforelement();
	longwaitforelement();
	driver.findElement(By.xpath("//button[contains(text(),'Save & Continue')]")).click();
	System.out.println("Video uploaded SuccessFully");
}

public static void addingAudioMedia() throws InterruptedException, IOException {
	
	/*driver.findElement(By.xpath("(//span[contains(text(),'CMS')])[1]")).click();
	waitforelement();
	driver.findElement(By.xpath("//span[contains(text(),'Media Library')]")).click();
	waitforelement();*/
	waitforelement();
	driver.findElement(By.xpath("//span[contains(text(),'Add Media')]")).click();
	waitforelement();
	driver.findElement(By.xpath("//button[contains(text(),'Choose Content Type')]")).click();
	waitforelement();
	driver.findElement(By.xpath("html/body/ngb-modal-window/div/div/add-media/div/div/div[2]/div/div/div/div/div/div/div/ul/li[2]/a")).click();
	waitforelement();
	driver.findElement(By.xpath("//input[@type='file']")).click();
	waitforelement();
	Runtime.getRuntime().exec("C:\\Users\\vinod.rohilla\\Desktop\\AutoItScript\\AllAudioFileUploadNew.exe");
	waitforelement();
	driver.findElement(By.xpath("//button[@class=\"btn btn-success btn-s\"]")).click();
	longwaitforelement();
	longwaitforelement();
	longwaitforelement();
	driver.findElement(By.xpath("//button[contains(text(),'Save & Continue')]")).click();
	longwaitforelement();
	System.out.println("Audio uploaded SuccessFully");
}


public static void addingImageMedia() throws InterruptedException, IOException {
	waitforelement();
	/*String Email=GlobalClass.EmailId;
	if (Email.contains(UserEmailid))
	{
		driver.findElement(By.xpath("(//span[contains(text(),'CMS')])[1]")).click();
	}
	
	waitforelement();
*/	driver.findElement(By.xpath("//span[contains(text(),'Media Library')]")).click();
	waitforelement();
	driver.findElement(By.xpath("//span[contains(text(),'Add Media')]")).click();
	waitforelement();
	driver.findElement(By.xpath("//button[contains(text(),'Choose Content Type')]")).click();
	waitforelement();
	driver.findElement(By.xpath("html/body/ngb-modal-window/div/div/add-media/div/div/div[2]/div/div/div/div/div/div/div/ul/li[3]/a")).click();
	waitforelement();
	driver.findElement(By.xpath("//input[@type='file']")).click();
	waitforelement();
	Runtime.getRuntime().exec("C:\\Users\\vinod.rohilla\\Desktop\\AutoItScript\\AllImageFileUploadNew.exe");
	waitforelement();
	driver.findElement(By.xpath("//button[@class=\"btn btn-success btn-s\"]")).click();
	longwaitforelement();
	longwaitforelement();
	longwaitforelement();
	longwaitforelement();
	driver.findElement(By.xpath("//button[contains(text(),'Save & Continue')]")).click();
	longwaitforelement();	
	System.out.println("Image uploaded SuccessFully");
	
	longwaitforelement();
	addingAudioMedia();
	longwaitforelement();
	addingVideoMedia();
	waitforelement();
	

}


}
