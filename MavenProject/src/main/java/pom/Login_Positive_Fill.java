package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Positive_Fill {
	WebDriver driver;
	
	public Login_Positive_Fill(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='header-login-wrapper']/a[@class='ivet-login']")
	public WebElement Login;
	
	@FindBy(id="Email")
	public WebElement email;
	
	@FindBy(id="Password")
	public WebElement Password;
	
	@FindBy(id="loginButton")
	public WebElement Submit;
	
	@FindBy(id="facebook-login")
	public WebElement fblogin;
	
	@FindBy(xpath="//div[@class='error-note']")
	public WebElement invalidmail;
	
	@FindBy(id="sbox")
	public WebElement search;
	
	@FindBy(id="wshh")
	public WebElement trytry;
	
}

	
	
	
	
	
	
	
	


