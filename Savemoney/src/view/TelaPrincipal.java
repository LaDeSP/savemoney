package view;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import model.Categoria;
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
	private ArrayList<Lancamento> listaLancamentos;
	private ArrayList<Categoria> listaCategoria;
	private Scanner scanner;

	public TelaPrincipal(ArrayList<Categoria> categorias) {
		setListaCategoria(categorias);
	}

	public void opcao1() throws Exception {

		Conta conta = new TelaUsuario().login(contaDAO);
		int opcao = 1;
		if (conta != null) {

			TelaLancamento tl = new TelaLancamento(lancamentoDAO,
					listaCategoria, conta);

			while (opcao != 0) {
				scanner = new Scanner(System.in);
				System.out.println();
				System.out
						.print("Escolha uma opção: \n 1. Lançamento \n 2. Extrato \n 0. Sair");
				opcao = scanner.nextInt();
				switch (opcao) {
				case 1:
					tl.leitura();
					break;

				case 2:
					// conta.ImprimirExtrato(listaLancamentos, x);
					/*
					 * for(String s : new LancamentoDAO().Extrato(conta))
					 * System.out.println(s);
					 */
					new LancamentoDAO().show(conta);

					break;
				case 0:
					break;
				}
			}
		} else {
			System.out.println("Incorreto");
		}

	}

	public ArrayList<Categoria> getListaCategoria() {
		return listaCategoria;
	}

	public void setListaCategoria(ArrayList<Categoria> listaCategoria) {
		this.listaCategoria = listaCategoria;
	}

}
