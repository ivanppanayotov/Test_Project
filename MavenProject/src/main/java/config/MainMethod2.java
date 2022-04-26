package config;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class MainMethod2 {

	WebDriver driver;
	Wait wait = new Wait(driver);

	public MainMethod2(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getelement(String locator, String type) {
		type = type.toLowerCase();
		if (type.equals("id")) {
			System.out.println("try to find a locator with id " + locator);
			return this.driver.findElement(By.id(locator));
		} else if (type.equals("name")) {
			System.out.println("try to find a locator with name " + locator);
			return this.driver.findElement(By.name(locator));
		} else if (type.equals("xpath")) {
			System.out.println("try to find a locator with xpath " + locator);
			return this.driver.findElement(By.xpath(locator));
		} else if (type.equals("className")) {
			System.out.println("try to find a locator with className " + locator);
			return this.driver.findElement(By.className(locator));
		} else if (type.equals("cssSelector")) {
			System.out.println("try to find a locator with cssSelector " + locator);
			return this.driver.findElement(By.cssSelector(locator));
		} else if (type.equals("tagName")) {
			System.out.println("try to find a locator with tagName " + locator);
			return this.driver.findElement(By.tagName(locator));
		} else if (type.equals("linkText")) {
			System.out.println("try to find a locator with linkText " + locator);
			return this.driver.findElement(By.linkText(locator));
		} else if (type.equals("partialLinkText")) {
			System.out.println("try to find a locator with partialLinkText " + locator);
			return this.driver.findElement(By.partialLinkText(locator));
		} else {
			System.out.println("the locator type is not supported");
			return null;
		}
	}

	public <ListWebElement> java.util.List<WebElement> getElementList(String locator, String type) {
		type = type.toLowerCase();
		if (type.equals("id")) {
			System.out.println("try to find a locator with id " + locator);
			return this.driver.findElements(By.id(locator));
		} else if (type.equals("name")) {
			System.out.println("try to find a locator with name " + locator);
			return this.driver.findElements(By.name(locator));
		} else if (type.equals("xpath")) {
			System.out.println("try to find a locator with xpath " + locator);
			return this.driver.findElements(By.xpath(locator));
		} else if (type.equals("className")) {
			System.out.println("try to find a locator with className " + locator);
			return this.driver.findElements(By.className(locator));
		} else if (type.equals("cssSelector")) {
			System.out.println("try to find a locator with cssSelector " + locator);
			return this.driver.findElements(By.cssSelector(locator));
		} else if (type.equals("tagName")) {
			System.out.println("try to find a locator with tagName " + locator);
			return this.driver.findElements(By.tagName(locator));
		} else if (type.equals("linkText")) {
			System.out.println("try to find a locator with linkText " + locator);
			return this.driver.findElements(By.linkText(locator));
		} else if (type.equals("partialLinkText")) {
			System.out.println("try to find a locator with partialLinkText " + locator);
			return this.driver.findElements(By.partialLinkText(locator));
		} else {
			System.out.println("the locator type is not supported");
			return null;
		}
	}

	public boolean isElementPresent(String locator, String type) {
		List<WebElement> elementList = getElementList(locator, type);
		int size = elementList.size();

		if (size > 0) {
			return true;
		} else {

			return false;
		}

	}

	/**
	 * This method is used for opening new tab in the browser and navigate to
	 * destination URL address.
	 *
	 *
	 * @param text    - provide a data for filling the input text element.
	 * @param element - provide an element . The element should be input text
	 *                element.
	 *
	 */

	public void fillWithText(String text, WebElement element) {

		String methodName = new Object() {
	    }.getClass().getEnclosingMethod().getName(); // Get the name of the current method
		String className = this.getClass().getSimpleName(); // Get the name of the class
		try {
			WebElement webElement = wait.waitIsDisplayed(element);
			webElement.sendKeys(text);
			//String actualResult = webElement.getText();

		} catch (Exception e) {
			System.out.println("The operation was not completed . Please review the '" + methodName + "' method from'"
					+ className + "class . Error message:" + e);

		}
	}

	/**
	 * This method is used for opening new tab in the browser and navigate to
	 * destination URL address.
	 *
	 *
	 * @param browserWindow  - provide a browser tab number where we want to switch.
	 * @param url            - provide a destination URL address.
	 * @param expectedResult - provide a text string .This will be used for expected
	 *                       result.
	 * @param element        - provide a element . The getText method will be used
	 *                       over it.This will be used for actual result.
	 *
	 */

	public void openNewBrowserTab(int browserWindow, String url, WebElement element) {

		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName(); // Get the name of the current method
		String className = this.getClass().getSimpleName(); // Get the name of the class
		try {
			// open new tab in the browser and switch to it
			((JavascriptExecutor) driver).executeScript("window.open()");
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(browserWindow));// Switch to second browser tab
			driver.get(url);// Navigate to URL
			WebElement webElement = wait.waitIsDisplayed(element);
			boolean actualResult = webElement.isDisplayed();
			if (actualResult = false) {
				System.out.println("The element  \"" + webElement + "\"is not displayed");
			}
		} catch (Exception e) {
			System.out.println("The operation was not completed . Please review the '" + methodName + "' method from'"
					+ className + "class . Error message:" + e);

		}
	}

	/**
	 * @param url     - provide a destination URL.
	 * @param element - provide an element. A getText method will be used.This will
	 *                be used
	 */

	public void navigateURL(String url, WebElement element) {

		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName(); // Get the name of the current method
		String className = this.getClass().getSimpleName(); // Get the name of the class
		try {
			driver.get(url);
			WebElement webElement = wait.waitIsDisplayed(element);
			boolean actualResult = webElement.isDisplayed();
			if (actualResult = false) {
				System.out.println("The element  \"" + webElement + "\"is not displayed");
			}
		} catch (Exception e) {

			System.out.println("The operation was not completed . Please review the '" + methodName + "' method from'"
					+ className + "class . Error message:" + e);

		}
	}

	/**
	 * This method is used for opening new tab in the browser and navigate to
	 * destination URL address.
	 *
	 *
	 * @param browserWindow - provide a browser tab number where we want to switch.
	 * @param url           - provide a destination URL address.
	 * @param element       - provide a element . The getText method will be used
	 *                      over it.This will be used for actual result.
	 *
	 */

	public void openNewBrowser1(int browserWindow, String url, WebElement element) {

		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName(); // Get the name of the current method
		String className = this.getClass().getSimpleName(); // Get the name of the class
		try {
			// open new tab in the browser and switch to it
			((JavascriptExecutor) driver).executeScript("window.open()");
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(browserWindow));// Switch to second browser tab
			driver.get(url);// Navigate to URL
			wait.waitIsDisplayed(element);

		} catch (Exception e) {
			System.out.println("The operation was not completed . Please review the '" + methodName + "' method from'"
					+ className + "class . Error message:" + e);

		}
	}

	/**
	 * This method is used for opening new tab in the browser and navigate to
	 * destination URL address.
	 *
	 *
	 * @param browserWindow - provide a browser tab number where we want to switch.
	 * @param url           - provide a destination URL address.
	 * @param element       - provide a element . The getText method will be used
	 *                      over it.This will be used for actual result.
	 *
	 */

	public void clickMethod(int browserWindow, String url, WebElement element) {

		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName(); // Get the name of the current method
		String className = this.getClass().getSimpleName(); // Get the name of the class
		try {
			// open new tab in the browser and switch to it
			((JavascriptExecutor) driver).executeScript("window.open()");
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(browserWindow));// Switch to second browser tab
			driver.get(url);// Navigate to URL
			wait.waitIsDisplayed(element);

		} catch (Exception e) {
			System.out.println("The operation was not completed . Please review the '" + methodName + "' method from'"
					+ className + "class . Error message:" + e);

		}
	}

	/**
	 * @param element - provide an element. The element should be check box for
	 *                radio button.The element will be click().
	 */

	public void clickCheckBoxRadiobutton(WebElement element) {

		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName(); // Get the name of the current method
		String className = this.getClass().getSimpleName(); // Get the name of the class
		try {
			WebElement webElement = wait.waitIsDisplayed(element);
			webElement.click();
			if (webElement.isSelected()) {
				System.out.println("The element was NOT selected correctly");

			}
		} catch (Exception e) {

			System.out.println("The operation was not completed . Please review the '" + methodName + "' method from'"
					+ className + "class . Error message:" + e);

		}
	}

	/**
	 * @param element        - provide an element. The element should send an enter
	 *                       button.
	 * @param confirmElement - provide an element.The element shuold be used for
	 *                       confirmation.(if element is displayed)
	 */

	public void clickEnterButton(WebElement element, WebElement confirmElement) {
		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName(); // Get the name of the current method
		String className = this.getClass().getSimpleName(); // Get the name of the class
		try {
			WebElement webElement = wait.waitIsDisplayed(element);
			if (webElement.isEnabled()) {
				webElement.sendKeys(Keys.ENTER);

				boolean actualResult = confirmElement.isDisplayed();
				if (actualResult = false) {
					System.out.println("The element  \"" + confirmElement + "\"is not displayed");
				} else {
					System.out.println("The element  \"" + webElement + "\"is disabled and cant be clicked");
				}
			}

		} catch (Exception e) {

			System.out.println("The operation was not completed . Please review the '" + methodName + "' method from'"
					+ className + "class . Error message:" + e);

		}
	}

	public void uploadFile(String file, WebElement element) {
		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName(); // Get the name of the current method
		String className = this.getClass().getSimpleName(); // Get the name of the class
		try {
			WebElement webElement = wait.waitIsDisplayed(element);
			webElement.sendKeys(file);
		} catch (Exception e) {

			System.out.println("The operation was not completed . Please review the '" + methodName + "' method from'"
					+ className + "class . Error message:" + e);

		}
	}

}
