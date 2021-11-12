package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageObjects {

	@FindBy(how=How.ID,using="txtUsername")
	public static WebElement username;
	
	@FindBy(id="txtPassword")
	public static WebElement password;
	
	@FindBy(id="btnLogin")
	public static WebElement LoginButton;
	
	
	
	/*public static WebElement username(WebDriver driver) {
		return driver.findElement(By.id("txtUsername"));
	}
	
	public static WebElement password(WebDriver driver) {
		return driver.findElement(By.id("txtPassword"));
	}
	
	public static WebElement LoginButton(WebDriver driver) {
		return driver.findElement(By.id("btnLogin"));	
	}*/
}
