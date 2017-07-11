package controller;

import java.util.Calendar;
import java.util.ArrayList;
import java.util.List;

import model.Lancamento;
import model.Receitas;
/*import model.Despesas; */

public class LancamentoDAO {
	private static List<Lancamento>listaLancamentos = new ArrayList<Lancamento>();
	
	public static void criar(Calendar data, String descricao, float valor, char tipo){
	
		if(tipo==Lancamento.RECEITAS){
			Receitas novo = new Receitas(data, descricao, valor);
			listaLancamentos.add(novo);
		}
	}

	public static List<Lancamento> getListaLancamentos() {
		return listaLancamentos;
	}

	public static void setListaLancamentos(List<Lancamento> listaLancamentos) {
		LancamentoDAO.listaLancamentos = listaLancamentos;
	}
	

}
