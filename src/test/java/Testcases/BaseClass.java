package Testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Utilities.Readingdata;

public class BaseClass {
	
	Readingdata rd=new Readingdata();
	public String baseURL=rd.getapplicationURL();
	public String username=rd.getUsername();
	public String password=rd.getPassword();
	
	public static Logger log;
	//open application
	//close application
	//takes screenshot
	//log file generation
	public static WebDriver driver;
	
	@BeforeClass
	public void openApplication() {
		
		
		//log file related code
		
		log=Logger.getLogger("HybridFramework");
		PropertyConfigurator.configure("log4j.properties");
		//launch browser
	   // System.setProperty("webdriver.chrome.driver", rd.getchromepath());
		driver=new ChromeDriver();
		
		driver.get(baseURL);
		
		
		
	}
	
	@AfterClass
	public void closeApplication() {
		driver.close();
	}
	
	public void captureScreen(WebDriver driver,String name) throws IOException {
		
		TakesScreenshot ts=(TakesScreenshot)driver;//initialization
		File src=ts.getScreenshotAs(OutputType.FILE);
		File target=new File("./Screenshots/"+name+ ".png");
		
		
		FileUtils.copyFile(src, target);
		log.info("screenshot is taken");
		
	}
	

}
