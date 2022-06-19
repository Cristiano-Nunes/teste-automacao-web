package travel;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import utils.PageBase;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = "steps")
public class PesquisaTeste {
	
	public static WebDriver driver;
	
		
	@BeforeClass
	public static void before() {
		System.setProperty("webdriver.chrome.driver", "C:/CNO/BRQ/Driver/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://phptravels.net/admin");
		PageBase.driver = driver;
	}
	
	@AfterClass
	public static void after() {
		driver.quit();
	}
}
