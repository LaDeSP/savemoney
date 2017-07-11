package model;

/*import java.util.Scanner;*/
import java.util.Calendar;

public class Receitas extends Lancamento {
	protected int receita;
	protected float valor;
	private String descricao;
	public Receitas(Calendar data, String descricao2, float valor2) {
	}
	public int getReceita() {
		return receita;
	}
	public void setReceita(int receita) {
		this.receita = receita;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public void Lancamento(Calendar data, float valor, String descricao){
		this.data = data;
		this.valor = valor;
		this.setDescricao(descricao);
		
		
		
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	

}
