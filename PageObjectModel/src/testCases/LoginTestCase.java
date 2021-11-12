package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pageObjects.LoginPageObjects;

public class LoginTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		PageFactory.initElements(driver, LoginPageObjects.class);
		
		LoginPageObjects.username.sendKeys("Admin");
		LoginPageObjects.password.sendKeys("admin123");
		LoginPageObjects.LoginButton.click();
		
		/*LoginPageObjects.username(driver).sendKeys("Admin");
		LoginPageObjects.password(driver).sendKeys("admin123");
		LoginPageObjects.LoginButton(driver).click();*/
		
		
		/*WebElement username=driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		
		WebElement password=driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");
		
		WebElement loginButton=driver.findElement(By.id("btnLogin"));
		loginButton.click();*/
		
		driver.quit();
		
		
	}

}
