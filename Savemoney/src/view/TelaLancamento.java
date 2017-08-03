package view;

import java.io.IOException;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Scanner;

import model.Conta;
import controller.ContaDAO;
import controller.LancamentoDAO;
import view.TelaPrincipal;

public class TelaLancamento {
	
	public void TelaLancamento(LancamentoDAO lancamento){
		
		while(true){
			System.out.println("Escolha uma opção: \n 1. Receita: \n 2.Despesa: \n 0.Sair: \n ");
			int opcao = new Scanner(System.in).nextInt();
			
			switch (opcao){
			case 1:
				lancamento.Inserir(null, null, null, opcao, opcao);
			break;
			
			case 2:
				lancamento.Inserir(null, null, null, opcao, opcao);
			break;
			
			case 0:
				return;
			default:
				System.out.println("Resposta inválida");
			break;
			
				
			
			
				
			}
			
		}
		
	}
	
	public void Inserir() throws IOException
	{
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Data: ");
		String data;
		data = ler.nextLine();
		System.out.print("Descrição: ");
		String descricao;
		descricao = ler.nextLine();
		System.out.print("Valor: ");
		float valor;
		valor = ler.nextFloat();
		System.out.print("Tipo: ");
		char tipo;
		tipo = (char)System.in.read();

	}
	
	
	}

	


