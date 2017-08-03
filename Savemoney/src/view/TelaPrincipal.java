package view;

import java.util.Scanner;

import model.Conta;
import model.Lancamento;
import controller.ContaDAO;
import controller.LancamentoDAO;

public class TelaPrincipal {
	int opcao;
	int aux;
	Scanner guardar = new Scanner(System.in);
	ContaDAO contaDAO = new ContaDAO();
	LancamentoDAO lancamentoDAO = new LancamentoDAO();

	public void opcao(int opcao){
		if (new TelaUsuario().login(contaDAO)){
			System.out.print("Escolha uma opção: \n 1. Lançamento \n 2. Extrato \n 0. Sair");
			int aux = new Scanner(System.in).nextInt();
			
			switch(opcao){
			case 1:
				new TelaLancamento().TelaLancamento(lancamentoDAO);
				
			case 2:
				//new Conta().;
			case 0:
				
			}
		}
		else{
			System.out.println("Incorreto");
		}
			
		}
		
}
