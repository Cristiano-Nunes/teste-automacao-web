package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;

import utils.PageBase;

public class HomePage extends PageBase{
	public By websiteLink = By.xpath("//a[text() = 'Website']");
	
	public void clicarNavMenuWebsite(){
		driver.findElement(websiteLink).click();
	}

	public void acessarAbaWebsite() {
		List<String> abas = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(abas.get(1));
	}
}
