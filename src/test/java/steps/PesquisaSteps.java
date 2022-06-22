package steps;

import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.PesquisaPage;

public class PesquisaSteps {
	PesquisaPage pesquisa = new PesquisaPage();
	
	@E("que esteja na tela de pesquisa")
	public void e_que_esteja_na_tela_de_pesquisa(){
		pesquisa.validarTelaPesquisa();
	}
	
	@E("preencha o campo Nome da Cidade com 3 ou mais caracteres")
	public void e_preencha_o_campo_Nome_da_Cidade_com_3_ou_mais_caracteres(){
		pesquisa.preencherCidade("Dubai");
	}
	
	@E("preencha o campo Passageiros com a quantidade de Quartos")
	public void e_preencha_o_campo_Passageiros_com_a_quantidade_de_Quartos(){
		pesquisa.preencherTravellersQuartos();
	}
	
	@E("preencha o campo Passageiros com a quantidade de Hospedes Adultos")
	public void e_preencha_o_campo_Passageiros_com_a_quantidade_de_Hospedes_Adultos(){
		pesquisa.preencherTravellersHospedes();
	}
	
	@E("preencha o campo Passageiros com a quantidade de Hospedes Criancas e Idade")
	public void e_preencha_o_campo_Passageiros_com_a_quantidade_de_Hospedes_Criancas_e_Idade(){
		pesquisa.preencherTravellersCriancas();
	}
	
	@Quando("clicar no botao Pesquisar")
	public void quando_clicar_no_botao_Pesquisar(){
		pesquisa.pesquisar();
	}
	
	@Entao("a pesquisa devera ser retornada")
	public void entao_a_pesquisa_devera_ser_retornada(){
		pesquisa.validarTelaDePesquisa();
	}

}
