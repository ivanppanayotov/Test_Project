package newPackage;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import config.MainMethod2;
import org.testng.annotations.BeforeClass;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import pom.Login_Positive_Fill;

public class Positive_123 {
	public SoftAssert softassert = new SoftAssert();
	private WebDriver driver ;
	private MainMethod2 mm;
	private  String baseURL;
	private String url;
	private Login_Positive_Fill element;
	
 @Test
	 public void FillingTheFormWithCorrectData() throws UnsupportedFlavorException ,IOException {
		
		System.out.println("1");
		 element.search.sendKeys("sadas");
		  mm.fillWithText("jbs27131@jiooq.com", element.email);
		  mm.fillWithText("1234123", element.Password);
		  element.Submit.click();
		             
	   	
	 }		  
	
  @BeforeClass
  public void beforeClass() {
	 driver = new ChromeDriver();
	 element = new Login_Positive_Fill(driver);
	 mm = new MainMethod2(driver);
	 baseURL = "https://www.ivet.bg/";//Declare a base URL value
	 url = baseURL + "login.html";
	 driver.manage().window().maximize();//Set opened browser to full screen mode
	 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	 driver.get(url);
	
	
	 
	    	  
	      }
  

  @AfterClass
  public void afterClass() {
  }

}
