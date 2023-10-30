package Testcases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import junit.framework.Assert;

public class TC_001_Login extends BaseClass {
	
	@Test
	public void logintest() throws InterruptedException, IOException {
		
		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		LoginPage lp=new LoginPage(driver);
		
		lp.setUsername(username);
		log.info("username is eneterd");
		
		lp.setPassword(password);
		
		log.info("password is entered");
		
		lp.ClickLoginbtn();
		
		log.debug("application");
		
		log.info("login button clicking activity is completed");
		
		if(driver.getTitle().equals("Adactin.com - Search Hotel")) {
			
			//call the cature screenshot method
			
			
			Assert.assertTrue(true);//hard assert
			log.info("testcase is passed");
			
		}
		else {
			
			captureScreen(driver,"logintest");
			Assert.assertTrue(false);
			log.info("testcase is failed");
		}
		
		
		
	}

}
