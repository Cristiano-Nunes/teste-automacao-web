package pages;

import org.openqa.selenium.By;

import utils.PageBase;

public class PesquisaPage extends PageBase {
	By cliquepesquisa = By.xpath("//select[@id=\"hotels_city\"]/..");
	By inputpesquisa = By.xpath("//span/input sendkyes");
	By resultadopesquisa = By.xpath("//ul[@id='select2-hotels_city-results']/li");
	By btnpesquisar = By.id("submit");
	By labelmincaratpesquisa = By.xpath("//li[contains(text(), 'Please enter 3 or more characters')]");

}
