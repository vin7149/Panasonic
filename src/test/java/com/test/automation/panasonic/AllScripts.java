package com.test.automation.panasonic;

import java.io.IOException;

public class AllScripts extends GlobalClass{

	public static void main(String[] args) throws InterruptedException, IOException {
		
		ChromeBrowser();
		login();
		AddNewUser.addNewUsermethod();
		//Add_N_Impressionate_User.Add_N_Impressionate_UserMethod();
		
	/*	//0 level Approver
		OrganizationSettings.organizationalMethod();*/
		
		//1 level Approver
		OrganizationSettings1.organizationalMethod();
		AddDevice.addDeviceMethod();
		AddTemplate.addTemplateMethod();
		AddMedia.addingImageMedia();
		driver.quit();
		ResetPassword.resetPasswordMethod();
		SetPassword.setAllPassword();
		
	}

}
