package config;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Wait {
WebDriver driver;
	
	public Wait (WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement waitIsDisplayed(WebElement element) {
		try {
			element.isDisplayed();
		}
		catch (NoSuchElementException e) {
			throw new RuntimeException("The element is not Displayed . Error message "+ e );
		}
		return element;
	}
	
	public WebElement waitIsEnabled(WebElement element) {
		try {
			element.isEnabled();
		}
		catch (NoSuchElementException e) {
			throw new RuntimeException("The element is not Enabled . Error message "+ e );
		}
		return element;
	}
	
	public WebElement waitIsSelected(WebElement element) {
		try {
			element.isSelected();
		}
		catch (NoSuchElementException e) {
			throw new RuntimeException("The element is not Selected . Error message "+ e );
		}
		return element;
	}
	
}
	