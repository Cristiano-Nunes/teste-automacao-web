package steps;

import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class PesquisaSteps {
	
	@E("que esteja na tela de pesquisa")
	public void e_que_esteja_na_tela_de_pesquisa(){}
	
	@E("preencha o campo Nome da Cidade com 3 ou mais caracteres")
	public void e_preencha_o_campo_Nome_da_Cidade_com_3_ou_mais_caracteres(){}
	
	@E("preencha o campo Check in com a data inicio da hospedagem")	
	public void e_preencha_o_campo_Check_in_com_a_data_inicio_da_hospedagem(){}
	
	@E("preencha o campo Check out com a data final da hospedagem")
	public void e_preencha_o_campo_Check_out_com_a_data_final_da_hospedagem(){}
	
	@E("preencha o campo Passageiros com a quantidade de Quartos")
	public void e_preencha_o_campo_Passageiros_com_a_quantidade_de_Quartos(){}
	
	@E("preencha o campo Passageiros com a quantidade de Hospedes Adultos")
	public void e_preencha_o_campo_Passageiros_com_a_quantidade_de_Hospedes_Adultos(){}
	
	@E("preencha o campo Passageiros com a quantidade de Hospedes Crianças e Idade")
	public void e_preencha_o_campo_Passageiros_com_a_quantidade_de_Hospedes_Crianças_e_Idade(){}
	
	@Quando("clicar no botao Pesquisar")
	public void quando_clicar_no_botao_Pesquisar(){}
	
	@Então("a pesquisa devera ser retornada")
	public void entao_a_pesquisa_devera_ser_retornada(){}
	

}
