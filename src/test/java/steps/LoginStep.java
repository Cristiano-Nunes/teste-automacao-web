package steps;

import cucumber.api.java.pt.Dado;
import pages.LoginPage;

public class LoginStep {
	
	LoginPage login = new LoginPage();
	
	@Dado("que esteja logado")
	public void dado_que_esteja_logado() {
		login.fazerLogin();
	}
}
