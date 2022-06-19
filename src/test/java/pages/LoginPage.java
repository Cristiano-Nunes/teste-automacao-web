package pages;

import org.openqa.selenium.By;

import junit.framework.Assert;
import utils.PageBase;

public class LoginPage extends PageBase {
	By inputEmail = By.name("email");
	By inputPassword = By.name("password");
	By btnLogin = By.xpath("//button[@type='submit']");
	
	public void fazerLogin() {
		driver.findElement(inputEmail).sendKeys("admin@phptravels.com");
		driver.findElement(inputPassword).sendKeys("demoadmin");
		driver.findElement(btnLogin).click();	
		Assert.assertTrue(driver.getTitle().equals("Dashboard"));
		
	}
	
	
	
}
