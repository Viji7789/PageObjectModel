package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyInfoPageObjects {

	@FindBy(xpath="//*[@id=\'menu_pim_viewMyDetails\']")
	public static WebElement MyInfo;
	
	@FindBy(id="btnSave")
	public static WebElement EditButton;
	
	@FindBy(id="personal_optGender_2")
	public static WebElement GenderSelect;
	
	@FindBy(id="btnSave")
	public static WebElement SaveButton;
	
	/*public static WebElement MyInfo(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\'menu_pim_viewMyDetails\']"));
	}
	
	public static WebElement EditButton(WebDriver driver) {
		return driver.findElement(By.id("btnSave"));
	}
	
	public static WebElement GenderSelect(WebDriver driver) {
		return driver.findElement(By.id("personal_optGender_2"));
	}
	
	public static WebElement SaveButton(WebDriver driver) {
		return driver.findElement(By.id("btnSave"));
	}*/
}
