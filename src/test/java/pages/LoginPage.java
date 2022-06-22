package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import utils.PageBase;

public class LoginPage extends PageBase {
	By inputEmail = By.name("email");
	By inputPassword = By.name("password");
	By btnLogin = By.xpath("//button[@type='submit']");
	
	public void fazerLogin() {
		driver.findElement(inputEmail).sendKeys("admin@phptravels.com");
		driver.findElement(inputPassword).sendKeys("demoadmin");
		driver.findElement(btnLogin).click();	
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue(driver.getTitle().equals("Dashboard"));
	}
	
	
	
}
