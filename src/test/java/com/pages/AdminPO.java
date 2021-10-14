package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPO 
{
     @FindBy(xpath = "//a[@id=\"menu_admin_viewAdminModule\"]")
     WebElement adminLink;
     
     public void adminClick()
     {
    	 adminLink.click();
     }

}
