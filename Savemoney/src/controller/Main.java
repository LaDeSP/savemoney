package controller;


import java.util.ArrayList;

import model.Categoria;
import view.TelaLancamento;
import view.TelaPrincipal;
import view.TelaUsuario;
import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception {
		ArrayList<Categoria> lista = new ArrayList<>();
		CategoriaDAO cdao = new CategoriaDAO();
		cdao.add(lista);
		ContaDAO.getListaConta();
		ContaDAO conta = new ContaDAO();
		int opcao;
		//LancamentoDAO.getListaLancamentos();
		while(true) {	
			LancamentoDAO lancamento = new LancamentoDAO();
			Scanner ler = new Scanner(System.in);
			System.out.println("Escolha uma opção");
			System.out.println("1- Cadastrar");
			System.out.println("2- Logar");
			System.out.println("3- Sair");
			opcao = ler.nextInt();
			
			switch(opcao) {
				case 1:
					new TelaUsuario().cadastrar(conta);
					break;
				case 2:
					new TelaPrincipal(lista).opcao1();
					break;
				case 3:
					return;
				default:
					System.out.println("Opção inválida!");
			}
		}
	}

}
