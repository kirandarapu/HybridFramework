package Testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import Utilities.XLUtils;

public class TC_LoginDataDriven_001 extends BaseClass {
	
	
	@Test(dataProvider="LoginData")
	public  void logintest(String user,String pwd) {
		
	
		driver.get(baseURL);
		LoginPage lp=new LoginPage(driver);
		
		lp.setUsername(user);
		log.info("user name is entered");
		lp.setPassword(pwd);
		log.info("password is entered");
		lp.ClickLoginbtn();
		log.info("clicking activity is completed");
		lp.ClickLogoutbtn();
		log.info("clicking activity is completed");
		lp.ClickGobackLogin();
		log.info("clicking activity is completed");
		
		
	}
	
	@DataProvider(name="LoginData")
	String [][] getData() throws IOException
	{
		String path=System.getProperty("user.dir")+"/src/test/java/TestData/LoginData.xlsx";

		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int colcount=XLUtils.getCellCount(path,"Sheet1",1);

		String logindata[][]=new String[rownum][colcount];

		for(int i=1;i<=rownum;i++)//row
		{
			for(int j=0;j<colcount;j++)//col
			{
				logindata[i-1][j]=XLUtils.getCellData(path,"Sheet1", i,j);//1 0
			}

		}
		return logindata;
	}

}
