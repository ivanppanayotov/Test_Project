package config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitTypes {

	WebDriver driver;

	public WaitTypes(WebDriver driver) {
		this.driver = driver;

	}

	public WebElement waitForElement(By locator, int timeout) {
		WebElement element = null;
		try {
			System.out.println("We are waiting" + timeout + "seconds to load the element ");

			WebDriverWait wait = new WebDriverWait(driver, timeout);
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			System.out.println("Element appeared  on the page ");

		} catch (Exception e) {
			System.out.println("Element is not  presented in the page ");
		}
		return element;

	}

	public void clickWhenReady(By by, int timeout) {

		try {
			WebElement element = null;
			System.out.println("We are waiting " + timeout + "seconds to check if the element is clickable");

			WebDriverWait wait = new WebDriverWait(driver, timeout);
			element = wait.until(ExpectedConditions.elementToBeClickable(by));
			element.click();
			System.out.println("Element clicked ");

		} catch (Exception e) {
			System.out.println("Element  is not clicked ");
		}
	}

}
