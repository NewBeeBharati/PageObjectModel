package com.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pages.AdminPO;
import com.pages.AppConstant;

public class AdminTest extends AppConstant
{
	@Test
	 public void adminTest()
	 {
		 AdminPO obj = PageFactory.initElements(driver, AdminPO.class);
	     obj.adminClick();
	 }

}
