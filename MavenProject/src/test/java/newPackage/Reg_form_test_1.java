package newPackage;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.github.javafaker.Faker;


import config.MainMethod2;
import config.OtherMethods;
import pom.Reg_form_filling;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.JavascriptExecutor;

public class Reg_form_test_1 {
	private JavascriptExecutor je;
	public SoftAssert softassert = new SoftAssert();
	private WebDriver driver ;
	private MainMethod2 mm;
    private Reg_form_filling element;
    private OtherMethods om;
	private  String baseURL;
	private String url;
	private Faker faker;
	private String tenminutesmail;
	private String clickboardData;
 @Test
	 public void FillingTheFormWithCorrectData() throws UnsupportedFlavorException ,IOException {
	      je.executeScript("arguments[0].scrollIntoView(true);",element.copyEmailadress);
		  element.copyEmailadress.click();                      // Copy the email adress on the clickboard
		  clickboardData = om.clickboardData();                 // Check if the copied email is correct
	   	  mm.openNewBrowser1(1, url, element.email);            //Open new browser tab and switch to it
		  mm.fillWithText(clickboardData, element.email);       // Paste the copied email from the clickboard
		  mm.fillWithText("1234123", element.password);         // Fill the password input text element with correct data
		  mm.fillWithText("1234123", element.passwordConfirm);  // Fill the confirm password input text element with correct data       
	      mm.fillWithText(faker.name().firstName(), element.firstName);   //Fill first name text element with correct data
	      mm.fillWithText(faker.name().lastName(), element.lastName);     //Fill last name text element with correct data 
	      mm.fillWithText(faker.phoneNumber().cellPhone().replace(".", "").replace("(", "").replace(")", "").replace("-", "").replace(" ", ""),element.phone);
	      Select Country = new Select (element.Country);                                  // Open the country dropdown menu
	      Country.selectByVisibleText("????????????????");                                        // Select correct value from the country dropdown menu
	      Select State = new Select (element.State);                                      //Open state dropdown  menu
	      State.selectByVisibleText("????????????");                                            //Select value from the state dropdown menu
	      mm.fillWithText(faker.country().capital(),element.City);                        //Fill city text element with correct data
          mm.fillWithText("8000", element.ZipCode);	                                      //Fill zipCode text element with correct data 
          mm.fillWithText(faker.address().streetAddressNumber(), element.BillingAdress);  //Fill delivery adress text element with correct data
          mm.fillWithText(faker.address().city(), element.BillingAdress2);                //Fill billing adress text element with correct data 
          element.PrivateCustomer.click();                                                // Select value from the 	customer type radio button 
          element.Submit.click();                                                         //Click on the registation submit button
          System.out.println("softAssert Method Was Started");
          String actualresult = element.Assertion2.getText();
          softassert.assertEquals("?????????????? ??????????????????????", actualresult);
          System.out.println("softAssert Method Was Executed");
          softassert.assertAll();
         
          
         
	 }		  
	
  @BeforeClass
  public void beforeClass() {
	 driver = new ChromeDriver();
	 element = new Reg_form_filling(driver);
	 om = new OtherMethods();
	 mm = new MainMethod2(driver);
	 faker = new Faker();//Create a new instance of faker library
	 baseURL = "https://www.ivet.bg/";//Declare a base URL value
	 url = baseURL + "register.html";
	 tenminutesmail = "https://10minutemail.net/?lang=bg";
	 driver.manage().window().maximize();//Set opened browser to full screen mode
	 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	 driver.get(tenminutesmail);//Navigate to base URL + page
	 je = (JavascriptExecutor) driver;
	 
	
	 
	    	  
	      }
  

  @AfterClass
  public void afterClass() {
  }

}
