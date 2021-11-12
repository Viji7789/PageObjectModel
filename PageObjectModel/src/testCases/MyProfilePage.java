package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pageObjects.LoginPageObjects;
//import org.openqa.selenium.interactions.Actions;
import pageObjects.MyInfoPageObjects;

public class MyProfilePage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		PageFactory.initElements(driver, LoginPageObjects.class);
		LoginPageObjects.username.sendKeys("Admin");
		LoginPageObjects.password.sendKeys("admin123");
		LoginPageObjects.LoginButton.click();
		
		Thread.sleep(1000);
		PageFactory.initElements(driver, MyInfoPageObjects.class);
		MyInfoPageObjects.MyInfo.click();
		MyInfoPageObjects.EditButton.click();
		MyInfoPageObjects.GenderSelect.click();
		MyInfoPageObjects.SaveButton.click();
		
		
		/*MyInfoPageObjects.MyInfo(driver).click();
		MyInfoPageObjects.EditButton(driver).click();
		MyInfoPageObjects.GenderSelect(driver).click();
		MyInfoPageObjects.SaveButton(driver).click();*/
		
		/*WebElement username=driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		
		WebElement password=driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");
		
		WebElement loginButton=driver.findElement(By.id("btnLogin"));
		loginButton.click();*/
		
		/*WebElement MyInfo=driver.findElement(By.xpath("//*[@id=\'menu_pim_viewMyDetails\']"));
		MyInfo.click();
		
		WebElement EditButton=driver.findElement(By.id("btnSave"));
		EditButton.click();
		
		WebElement GenderSelect=driver.findElement(By.id("personal_optGender_2"));
		GenderSelect.click();
		
		WebElement SaveButton=driver.findElement(By.id("btnSave"));
		SaveButton.click();*/
		
		
		driver.quit();
	}

}
