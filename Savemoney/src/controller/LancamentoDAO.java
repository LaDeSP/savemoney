package controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

import model.Conta;
import model.Despesas;
import model.Lancamento;
import model.Receitas;
import model.Categoria;
/*import model.Despesas; */



public class LancamentoDAO implements Serializable{
	int id;
	private static final long serialVersionUID = 1L;
	private static final AtomicInteger count = new AtomicInteger(0);
	private static ArrayList<Lancamento> listaLancamentos = new ArrayList<Lancamento>();
	private ArrayList<Categoria>listaCategorias;
	
	public LancamentoDAO(){
		id = count.incrementAndGet();
		this.listaCategorias = new ArrayList<>();
	}
	
	public LancamentoDAO(ArrayList<Categoria> categorias){
		this.setListaCategorias(categorias);
		id = count.incrementAndGet();
	}
	
	public static boolean Escrever(Object objeto)
	{
		try {
			
			FileOutputStream fos = new FileOutputStream("lancamentos.ser", false);
	    	ObjectOutputStream oos = new ObjectOutputStream(fos);
	    	oos.writeObject(objeto);
	    	oos.flush();
	    	oos.close();
		}
		catch(IOException e){
			e.printStackTrace();	
		}
		return false;
	}

	public void Inserir(String data, Conta objetoConta, float valor, Categoria categoria, boolean tipo){
		int i=0;
		//if(i==Lancamento.RECEITAS){

		if(tipo == true) {
			Receitas novo = new Receitas(data,objetoConta, valor, categoria);
			this.listaLancamentos.add(novo);
		}else {
			Despesas novo = new Despesas(data,objetoConta, valor, categoria);
			this.listaLancamentos.add(novo);
		}
		
	
		System.out.println ("Lançamento inserido com sucesso");
		this.Escrever(this.listaLancamentos);

	}
	
	public static ArrayList<Lancamento> getListaLancamentos() {
		try {
			FileInputStream fos = new FileInputStream("lancamentos.ser");
			ObjectInputStream  oos = new ObjectInputStream(fos);
			try {
				listaLancamentos = (ArrayList<model.Lancamento>) oos.readObject();
				} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
			
			oos.close();
		}
		catch(IOException e){
			e.printStackTrace();	
		}
		
		return listaLancamentos;
	}



	public void setListaLancamentos(ArrayList<Lancamento> listaLancamentos) {
		this.listaLancamentos = listaLancamentos;
	}
	
	public void Remove(int id){
	
		for(Lancamento lancamento : listaLancamentos)
		{
			if(id == lancamento.getId_lancamento())
			{
				this.listaLancamentos.remove(lancamento);
				return ;
			}
		}
	}
	
	
	public void show(Conta conta) {
		setListaLancamentos(getListaLancamentos());
		System.out.println("###EXTRATO###");
		System.out.println("Saldo inicial: " + conta.getValor());
		for (Lancamento lancamento: listaLancamentos)
		{	
			
			if(conta.getNome().equals(lancamento.getObjetoConta().getNome())) {
				if(lancamento instanceof Receitas)
					System.out.println(lancamento.getObjetoConta().getNome()+" "+ lancamento.getData()+" +" + lancamento.getValor() +" "+ lancamento.getObjetoCategoria().getNome()+" ");
				else
					System.out.println(lancamento.getObjetoConta().getNome()+" "+ lancamento.getData()+" -" + lancamento.getValor() +" "+ lancamento.getObjetoCategoria().getNome()+" ");
				//System.out.println(lancamento.getObjetoCategoria().getNome());
				//System.out.println(lancamento.getObjetoConta().getNome());
			}
		}
		
		System.out.println("Saldo atual: " + conta.getSaldoFinal());
	}
	
	public ArrayList<String> Extrato(Conta conta){
		ArrayList<String> s = new ArrayList<>();
		for(Lancamento l : this.listaLancamentos) {
			if(conta == l.getObjetoConta()) 
				s.add(l.getData() + "   |   " + l.getObjetoCategoria().getNome() + "   |   " + l.getValor() + "\n");
		}
		return s;
	
	}

	public ArrayList<Categoria> getListaCategorias() {
		return listaCategorias;
	}

	public void setListaCategorias(ArrayList<Categoria> listaCategorias) {
		this.listaCategorias = listaCategorias;
	}


 /*public static void Lista(){
	
	for(Conta lancamento : listaLancamentos)
	{
		System.out.println("\tNome: "+conta.getNome());
		System.out.println("\n    ":  
	}*/
}


	
	
		
		
	
	


