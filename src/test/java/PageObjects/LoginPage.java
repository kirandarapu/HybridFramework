package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	//Parameterized constructor
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		//page object model (design pattern) ==> store the web pages (adactin==>login page,registration.....
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="username")
	WebElement txtusername;
	
	@FindBy(id="password")
	WebElement txtpassword;
	
	@FindBy(id="login")
	WebElement btnlogin;
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement logoutbtn;
	
	@FindBy(xpath="//a[text()='Click here to login again']")
	WebElement gobackLoginLink;
	
	
	
	public void setUsername(String uname) {
		txtusername.sendKeys(uname);
		
	}
	public void setPassword(String pwd) {
		txtpassword.sendKeys(pwd);
	}
	
	public void ClickLoginbtn() {
		btnlogin.click();
	}
	
	public void ClickLogoutbtn() {
		logoutbtn.click();
	}
	
	public void ClickGobackLogin() {
		gobackLoginLink.click();
	}
	

}
