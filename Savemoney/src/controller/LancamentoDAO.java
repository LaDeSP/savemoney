package controller;

import java.io.Serializable;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import model.Lancamento;
import model.Receitas;
/*import model.Despesas; */



public class LancamentoDAO extends DAO implements Serializable{
	int id;
	private static final long serialVersionUID = 1L;
	private static final AtomicInteger count = new AtomicInteger(0);
	private static List<Lancamento>listaLancamentos = new ArrayList<Lancamento>();
	
	public LancamentoDAO(){
		id = count.incrementAndGet();
	}
	
	public static void Escrever()
	{
		Escrever(Lancamento.RECEITAS, listaLancamentos );
	}
	
	private static void Escrever(char receitas,
			List<model.Lancamento> listaLancamentos) {
	
		
	}

	public static void lerArquivo()
	{
		listaLancamentos = (List<Lancamento>) Ler(Lancamento.RECEITAS, listaLancamentos);
	}
	
	private static List<model.Lancamento> Ler(char receitas,
			List<model.Lancamento> listaLancamentos2) {
		
		return null;
	}

	public static void Inserir(Calendar data, String descricao, float valor, char tipo){
	
		if(tipo==Lancamento.RECEITAS){
			Receitas novo = new Receitas(data, descricao, valor);
			listaLancamentos.add(novo);
			System.out.println ("Lançamento inserido com sucesso");
		}
	}

	public static List<Lancamento> getListaLancamentos() {
		return listaLancamentos;
	}

	public static void setListaLancamentos(List<Lancamento> listaLancamentos) {
		LancamentoDAO.listaLancamentos = listaLancamentos;
	}
	
	public static void Remove(int id){
	
		for(Lancamento lancamento : listaLancamentos)
		{
			if(id == lancamento.getId_lancamento())
			{
				LancamentoDAO.listaLancamentos.remove(lancamento);
				return ;
			}
		}
	}
	
	public static void Atualiza(int id){
		for (Lancamento lancamento: listaLancamentos)
		{
			if(id==lancamento.getId_lancamento())
			{
				Object novo = null;
				listaLancamentos = Lancamento(novo);
			}
	
		
	
		
		
		}
		
	}

	private static List<Lancamento> Lancamento(Object novo) {
		// TODO Auto-generated method stub
		return null;
	}
}


	
	
		
		
	
	


