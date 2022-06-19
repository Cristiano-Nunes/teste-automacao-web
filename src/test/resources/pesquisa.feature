# language: pt
# encoding: utf-8

Funcionalidade: Pesquisa disponibilidade Hotel

Cenário: Pesquisar Hotel

Dado que esteja logado
E que esteja na tela de pesquisa
E preencha o campo Nome da Cidade com 3 ou mais caracteres
E preencha o campo Check in com a data inicio da hospedagem
E preencha o campo Check out com a data final da hospedagem
E preencha o campo Passageiros com a quantidade de Quartos
E preencha o campo Passageiros com a quantidade de Hospedes Adultos
E preencha o campo Passageiros com a quantidade de Hospedes Crianças e Idade
Quando clicar no botao Pesquisar
Então a pesquisa devera ser retornada



