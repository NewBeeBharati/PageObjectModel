package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPO 
{

	@FindBy(id="txtUsername")
	WebElement unametxt;
	
	@FindBy(name = "txtPassword")
	WebElement passtxt;
	
	@FindBy(xpath ="//input[@type =\"submit\"]")
	WebElement btn;
	
	
	public void fillLoginData(String uname, String pass) throws InterruptedException
	{
		unametxt.clear();
		unametxt.sendKeys(uname);
		Thread.sleep(2000);
		passtxt.clear();
		passtxt.sendKeys(pass);
		Thread.sleep(2000);
		btn.click();
	}
}
