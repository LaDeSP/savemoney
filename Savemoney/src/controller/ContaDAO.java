package controller;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import model.Conta;


public class ContaDAO extends DAO implements Serializable {

	int id;
	private static final long serialVersionUID = 1L;
	private static final AtomicInteger count = new AtomicInteger(0);
	private static List<Conta>listaConta = new ArrayList<Conta>();
	
	public ContaDAO(){
		id = count.incrementAndGet();
	}
	
/*	public static void Escrever()
	{
		Escrever(Conta.id_conta, listaConta );
	}*/
	
	private static void Escrever( int id_conta,
			List<model.Conta> listaConta) throws IOException {
		FileWriter arq = new FileWriter("arquivo.txt");
		
	}

	public static void lerArquivo()
	{
		listaConta = (List<Conta>) Ler(Conta.id_conta, listaConta);
	}
	
	private static List<model.Conta> Ler(int conta,
			List<model.Conta> listaConta) {
		
		return null;
	}

	public static boolean Criar(String nome, String email, String senha){
		int usuario = 0;
	
		if(usuario==Conta.id_conta){
			Conta novo = new Conta(nome, email, senha);
			listaConta.add(novo);
			Escrever("receita", novo);
			System.out.println ("Conta criado com sucesso");
		}
		return true;
	}

	public static List<Conta> getListaConta() {
		return listaConta;
	}

	public static void setListaConta(List<Conta> listaConta) {
		ContaDAO.listaConta = listaConta;
	}
	
	public static void Remove(int id){
	
		for(@SuppressWarnings("unused") Conta Conta : listaConta)
		{
			if(id == model.Conta.getId_conta())
			{
				ContaDAO.listaConta.remove(model.Conta.id_conta);
				return ;
			}
		}
	}
	
	public static void Atualiza(int id){
		for (@SuppressWarnings("unused") Conta Conta: listaConta)
		{
			if(id==model.Conta.getId_conta())
			{
				Object novo = null;
				listaConta = Conta(novo);
			}
	
		
	
		
		
		}
		
	}

	private static List<Conta> Conta(Object novo) {
		
		return null;
	}

	
}

