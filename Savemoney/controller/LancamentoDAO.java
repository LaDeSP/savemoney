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
import model.Lancamento;
import model.Receitas;
/*import model.Despesas; */



public class LancamentoDAO implements Serializable{
	int id;
	private static final long serialVersionUID = 1L;
	private static final AtomicInteger count = new AtomicInteger(0);
	private ArrayList<Lancamento>listaLancamentos = new ArrayList<Lancamento>();
	
	public LancamentoDAO(){
		id = count.incrementAndGet();
	}
	
	public boolean Escrever(ArrayList<Lancamento> objeto)
	{
		try {
			
			FileOutputStream fos = new FileOutputStream("lancamentos.ser");
	    	ObjectOutputStream oos = new ObjectOutputStream(fos);
	    	oos.writeObject(objeto);
	    	//oos.flush();
	    	oos.close();
		}
		catch(IOException e){
			e.printStackTrace();	
		}
		return false;
	}

	public void Inserir(String data, String descricao, Conta objetoConta,float valor, int i){
	
		if(i==Lancamento.RECEITAS){
			Receitas novo = new Receitas(data, descricao, objetoConta, valor);
			listaLancamentos.add(novo);
			System.out.println ("Lançamento inserido com sucesso");
			this.Escrever(this.listaLancamentos);
		}
	}
	
	public ArrayList<Lancamento> getListaLancamentos() {
		try {
			FileInputStream fos = new FileInputStream("lancamentos.ser");
			ObjectInputStream  oos = new ObjectInputStream(fos);
	    	
			try {
				this.listaLancamentos = (ArrayList<model.Lancamento>) oos.readObject();
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
	
	
	public void show( ArrayList<Lancamento> listaLancamentos) {
		for (Lancamento lancamento: listaLancamentos)
		{
			if(id==((model.Lancamento) lancamento).getId_lancamento()){
				System.out.print("   ");
			}
		
		
	}
	}
}
	


	
	
		
		
	
	


