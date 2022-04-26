package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Reg_form_filling {
	
	WebDriver driver;
	
	public Reg_form_filling(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id= "copy-button")
	public WebElement copyEmailadress;
	
	@FindBy(id= "CustomerPassword")
	public WebElement password;
	
	@FindBy(id= "CustomerPasswordConfirm")
	public WebElement passwordConfirm;
	
	@FindBy(id= "CustomerBillingFirstName")
	public WebElement firstName;
	
	@FindBy(id= "CustomerBillingLastName")
	public WebElement lastName;
	
	@FindBy(id= "CustomerBillingPhone")
	public WebElement phone;
	
	@FindBy(id= "CustomerEmail")
	public WebElement email;

	@FindBy(id= "CustomerBillingCountry")
	public WebElement Country;
	
	@FindBy(id= "CustomerBillingState")
	public WebElement State;
	
	@FindBy(id= "CustomerBillingCity")
	public WebElement City;
	
	@FindBy(id= "CustomerBillingZip")
	public WebElement ZipCode;
	
	@FindBy(xpath= "//input[@name='CustomerBillingAddress1']")
	public WebElement BillingAdress;
	
	@FindBy(id= "CustomerBillingAddress2")
	public WebElement BillingAdress2;
	
	@FindBy(id= "CustomerBillingIsCompany0")
	public WebElement PrivateCustomer;
	
	@FindBy(id= "registerButton")
	public WebElement Submit;
	
	@FindBy(xpath= "//*[contains(text(),'Невалиден имейл формат.')]")
	public WebElement Assertion1;
	
	@FindBy(xpath= "//*[@id='register-success']//h1")
	public WebElement Assertion2;
	
	@FindBy(xpath="//div[@class='error-note']")
	public WebElement invalidmail;
	
	
	
	
	
}
	
	
	
	
	
	
	
	


