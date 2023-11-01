package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	
	public WebDriver driver;
	public RegistrationPage(WebDriver driver) {
		
		this.driver=driver;
		//page object model (design pattern) ==> store the web pages (adactin==>login page,registration.....
		PageFactory.initElements(driver, this);
	}

}
