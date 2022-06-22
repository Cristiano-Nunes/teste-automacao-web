package steps;

import cucumber.api.java.pt.E;
import pages.HomePage;

public class HomeSteps {
	HomePage home = new HomePage();
	
	@E("acesse o menu Website na navbar")
	public void e_acesse_o_menu_Website_na_navbar() {
		home.clicarNavMenuWebsite();
		home.acessarAbaWebsite();
	}
}
