package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pages.AppConstant;
import com.pages.LoginPO;

public class LoginTest extends AppConstant
{

	  @Test(dataProvider = "readExcel")
	  public void loginTest(String uname,String pass) throws InterruptedException
	  {
		  LoginPO obj = PageFactory.initElements(driver, LoginPO.class);
	      
		  obj.fillLoginData(uname,pass);	  
		  
	  }
	  
	 @DataProvider 
	public Object[][] readExcel() throws IOException
	{
	  File f = new File("C:\\Users\\Bharti Yadav\\Desktop\\software Testing\\Lectures Recording\\selenium lecture\\Login.xlsx");
	  FileInputStream fis = new FileInputStream(f);
	  Workbook wb = new XSSFWorkbook(fis);
	  
	  Sheet sheet = wb.getSheet("Sheet1");
	  
	  int lastRowNo = sheet.getLastRowNum();
	  System.out.println(lastRowNo);
	  int lastCellNo = sheet.getRow(0).getLastCellNum();
	  
	  Object[][] obj= new Object[lastRowNo+1][lastCellNo];
	  
	  for (int i = 0; i<=lastRowNo ; i++)
	  {
		  for(int j=0;j<lastCellNo ;j++)
		  {
		  obj[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();
	      
	     }
		 
	  }  
     
	  return obj;
}
}
