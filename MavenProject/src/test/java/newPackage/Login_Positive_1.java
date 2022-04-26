package newPackage;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import config.MainMethod2;
import pom.Login_Positive_Fill;


public class Login_Positive_1 {
     WebDriver driver;
     MainMethod2 mm;
	 String baseURL;
	 String url;
	 Login_Positive_Fill element;
	
	
	
  @Test
  public void LoginWithValidData(){
	  element.search.sendKeys("sadas");
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
