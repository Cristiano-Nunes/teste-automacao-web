package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import utils.PageBase;

public class PesquisaPage extends PageBase {
	By cliquepesquisa = By.xpath("//select[@id=\"hotels_city\"]/..");
	By inputpesquisa = By.xpath("//span/input");
	By resultadopesquisa = By.xpath("//ul[@id='select2-hotels_city-results']/li");
	By btnpesquisar = By.id("submit");
	By labelmincaratpesquisa = By.xpath("//li[contains(text(), 'Please enter 3 or more characters')]");
	By cliqueTravellers = By.xpath("//span[contains(text(), 'Rooms')]/../..");
	By roomInc = By.xpath("//input[@id='rooms']/../div[@class='roomInc']");
	By adultsInc = By.xpath("//input[@id='adults']/../div[@class='qtyInc']");
	By childInc = By.xpath("//input[@id='childs']/../div[@class='qtyInc']");
	By btnPEsquisar = By.id("submit");
	
	public void validarTelaPesquisa() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String titulo = "PHPTRAVELS | Travel Technology Partner - PHPTRAVELS";
		System.out.println("Validando tela de pesquisa. Esperado [ " + titulo + " ] Encontrado [" + driver.getTitle() + " ]");
		Assert.assertTrue(driver.getTitle().equals(titulo));
	}

	public void preencherCidade(String string) {
		driver.findElement(cliquepesquisa).click();
		driver.findElement(inputpesquisa).sendKeys(string);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(resultadopesquisa).click();
		
	}

	public void pesquisar() {
		driver.findElement(btnpesquisar).click();
	}

	public void validarTelaDePesquisa() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Assert.assertTrue(driver.getTitle().contains("dubai"));
	}

	public void preencherTravellersQuartos() {
		driver.findElement(cliqueTravellers).click();
		driver.findElement(roomInc).click();
		
	}

	public void preencherTravellersHospedes() {
		driver.findElement(adultsInc).click();
	}

	public void preencherTravellersCriancas() {
		driver.findElement(childInc).click();
	}

}
