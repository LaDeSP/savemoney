package model;

/*import java.util.Scanner;*/


public class Receitas extends Lancamento {
	protected int receita;
	//private String descricao;
	
	public Receitas(String data,Conta objetoConta, float valor, Categoria categoria) {
		super(data,objetoConta, valor, categoria);
	}
	
	// new Receitas(data, descricao, objetoConta)
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
	
	public void Lancamento(String data, float valor, String descricao){
		this.data = data;
		this.valor = valor;
		//this.setDescricao(descricao);		
	}
	
	public void Adiciona(float valor){
		objetoConta.setValor(this.valor + valor);
	}
	
	/*public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}*/
	
	

}
