package newPackage;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import config.MainMethod2;
import pom.Login_Positive_Fill;
import org.testng.annotations.BeforeClass;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Login_with_valid_Data1 {
	public SoftAssert softassert = new SoftAssert();
	private WebDriver driver ;
	private MainMethod2 mm;
    private Login_Positive_Fill element;
	private  String baseURL;
	private String url;

 @Test
	 public void FillingTheFormWithCorrectData() throws UnsupportedFlavorException ,IOException {
	  mm.fillWithText("jbs27131@jiooq.com", element.email);
	  mm.fillWithText("1234123", element.Password);
	  element.Submit.click();
	  
		
		 
	 }		  
	
  @BeforeClass
  public void beforeClass() {
	  driver = new ChromeDriver();
	  baseURL = "https://www.ivet.bg";
	  url= baseURL+"/login.html";
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  driver.get(url);
	
	 
	    	  
	      }
  

  @AfterClass
  public void afterClass() {
  }

}
