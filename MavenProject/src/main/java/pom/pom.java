package pom;

import org.openqa.selenium.By;


public class pom {
	
	public By copyEmailadress = By.xpath("(//button[@data-clipboard-action='copy'])[2]");
	public By firstName = By.xpath("//*[@id='firstName']");
	public By lastName = By.xpath("//*[@id='lastName']");
	public By email = By.xpath(" //*[@id='userEmail']");
	public By gender = By.xpath("//*[@id='gender-radio-1']/following-sibling::label");
	public By phone = By.xpath("//*[@id='userNumber']");
	public By date = By.xpath("//*[@id='dateOfBirthInput']");
	public By hobbie = By.xpath("//*[@id='hobbies-checkbox-2']/following-sibling::label");
	public By uploadFile = By.xpath("//*[@id='uploadPicture']");
	public By adress = By.xpath("//*[@id='currentAddress']"); 
	public By submit = By.xpath("//*[@id='submit']");
	

}
