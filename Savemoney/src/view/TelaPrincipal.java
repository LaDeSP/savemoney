package view;

import model.Conta;
import model.Lancamento;

public class TelaPrincipal {
	int opcao;

	public void opcao(int opcao){
		System.out.print("Escolha uma op��o: \n 1. Lan�amento \n 2. Extrato \n 0. Sair");
		
		switch(opcao){
		case 1:
			new Lancamento();
			
		case 2:
			new Conta();
		case 0:
			
		}
	}
}
