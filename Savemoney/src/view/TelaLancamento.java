package view;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import model.Categoria;
import model.Conta;
import model.Despesas;
import model.Receitas;
import controller.ContaDAO;
import controller.LancamentoDAO;
import view.TelaPrincipal;
import model.Lancamento;

public class TelaLancamento  {
	private Conta objetoConta;
	private String nome;
	private String senha;
	LancamentoDAO lancamentoDAO;
	ContaDAO c;
	private ArrayList<Categoria> listaCategoria;
	private Scanner scanner;

	public TelaLancamento(LancamentoDAO lancamento,
			ArrayList<Categoria> categoria, Conta conta){
		setListaCategoria(categoria);
		setObjetoConta(conta);
		
		lancamentoDAO = new LancamentoDAO();
		
	}
	
	public void leitura() {
		int opcao = 1;
		scanner = new Scanner(System.in);
		do{
			System.out.println("\n Escolha uma opção: \n 1. Receita: \n 2.Despesa: \n 0.Sair: \n ");
			opcao = scanner.nextInt();
			switch (opcao) {
			case 1:
				Inserir(true);
				break;
			case 2:
				Inserir(false);
				break;
			case 0:
				System.out.println("Obrigado");
				break;
			default:
				System.out.println("Resposta inválida");
				break;
			}
			System.out.println(opcao != 0);
		}while (opcao != 0);
		//System.out.println("Saiu");
	}

	public Conta getObjetoConta() {
		return objetoConta;
	}

	public void setObjetoConta(Conta objetoConta) {
		this.objetoConta = objetoConta;
	}

	public ArrayList<Categoria> getListaCategoria() {
		return listaCategoria;
	}

	public void setListaCategoria(ArrayList<Categoria> listaCategoria) {
		this.listaCategoria = listaCategoria;
	}

	public void Inserir(boolean x) // throws IOException
	{
		Scanner ler = new Scanner(System.in);

		System.out.println("Escolha uma categoria");
		System.out.println("\n Escolha uma opção:");
		for (Categoria categoria : listaCategoria) {
			System.out.println(categoria.getId() + " - " + categoria.getNome());
		}
		int opcao = new Scanner(System.in).nextInt();

		String data;
		Categoria categoria = getPosicao(opcao);
		System.out.println("Digite a data conforme o formato (yyyy-mm-dd)");
		System.out.print("Data: ");

		data = ler.nextLine();

		// System.out.print("Descrição: ");
		// String descricao;
		// descricao = ler.nextLine();
		System.out.print("Valor: ");
		float valor;
		valor = ler.nextFloat();

		this.lancamentoDAO.Inserir(data, objetoConta, valor, categoria, x);
		
	}

	public Categoria getPosicao(int id) {
		return this.listaCategoria.get(id - 1);
	}
	public Categoria setPosicao(int id, Categoria editado) {
		return this.listaCategoria.set(id, editado);
	}

}
