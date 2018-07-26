package com.test.automation.panasonic;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Add_Planogram extends GlobalClass{

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeBrowser();
		login();
		addPlanogramMethod();

	}

	private static void addPlanogramMethod() {
	driver.findElement(By.linkText("CMS")).click();
    driver.findElement(By.xpath("//ul[@id='al-sidebar-list']/ba-menu-item[3]/li/ul/ba-menu-item[5]/li/a/span")).click();
    driver.findElement(By.linkText("Add Planogram")).click();
    driver.findElement(By.xpath("//input[@type='text']")).clear();
    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("TestPlanogram");
    new Select(driver.findElement(By.id("ddlAspectRatioId"))).selectByVisibleText("16:9");
    driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
    driver.findElement(By.id("startDate")).click();
    driver.findElement(By.cssSelector("div.btn-secondary")).click();
    driver.findElement(By.id("endDate")).click();
    new Select(driver.findElement(By.xpath("//div[@id='planogramScheduler-panel']/div/app-planogram-schedule/div/form/div/div/div/div[2]/div/div[2]/div/my-date-input/ngb-datepicker/div/ngb-datepicker-navigation/ngb-datepicker-navigation-select/select[2]"))).selectByVisibleText("2022");
    driver.findElement(By.xpath("//div[@id='planogramScheduler-panel']/div/app-planogram-schedule/div/form/div/div/div/div[2]/div/div[2]/div/my-date-input/ngb-datepicker/div[2]/div/ngb-datepicker-month-view/div[6]/div[4]/div")).click();
    driver.findElement(By.xpath("//input[@type='time']")).clear();
    driver.findElement(By.xpath("//input[@type='time']")).sendKeys("2222222222");
    driver.findElement(By.xpath("//input[@type='time']")).clear();
    driver.findElement(By.xpath("//input[@type='time']")).sendKeys("15:00");
    driver.findElement(By.xpath("(//input[@type='time'])[2]")).clear();
    driver.findElement(By.xpath("(//input[@type='time'])[2]")).sendKeys("1600");
    driver.findElement(By.xpath("(//input[@type='time'])[2]")).clear();
    driver.findElement(By.xpath("(//input[@type='time'])[2]")).sendKeys("16:00");
    driver.findElement(By.id("repeatEventChk")).click();
    driver.findElement(By.cssSelector("span.onoffswitch-inner")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
    driver.findElement(By.xpath("//div[@id='planogramCampaign-panel']/div/app-planogram-campaign/div/div[2]/div/tabset/div/tab/table/tbody/tr[3]/td[3]/a/i")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
    driver.findElement(By.cssSelector("span.toggle-children-wrapper.toggle-children-wrapper-collapsed")).click();
    driver.findElement(By.cssSelector("span.toggle-children-wrapper.toggle-children-wrapper-collapsed > span.toggle-children")).click();
    driver.findElement(By.xpath("//div[@id='planogramDevices-panel']/div/app-planogram-devices/div/form/div[2]/div/ul/tree-root/tree-viewport/div/div/tree-node-collection/div/tree-node/div/tree-node-children/div/tree-node-collection/div/tree-node/div/tree-node-children/div/tree-node-collection/div/tree-node[10]/div/tree-node-wrapper/div/tree-node-expander/span/span")).click();
    driver.findElement(By.xpath("//div[@id='planogramDevices-panel']/div/app-planogram-devices/div/form/div[2]/div/ul/tree-root/tree-viewport/div/div/tree-node-collection/div/tree-node/div/tree-node-children/div/tree-node-collection/div/tree-node/div/tree-node-children/div/tree-node-collection/div/tree-node[10]/div/tree-node-children/div/tree-node-collection/div/tree-node[9]/div/tree-node-wrapper/div/div/tree-node-content/label/span")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[21]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[50]")).click();
    driver.findElement(By.cssSelector("li > label.custom-input.checkbox > span.checkmark")).click();
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    
    driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
    
    driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
		
	}

}
