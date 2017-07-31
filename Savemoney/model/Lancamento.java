package model;

import java.util.Calendar;
/*import java.util.Scanner;*/
/*import java.util.Calendar;*/
public class Lancamento {
	public static final char RECEITAS = 0;
	protected int id_lancamento;
	protected Calendar data;
	protected Conta objetoConta;
	protected float valor;
	
	public Conta getObjetoConta() {
		return objetoConta;
	}

	public void setObjetoConta(Conta objetoConta) {
		this.objetoConta = objetoConta;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public Lancamento(Conta objetoConta, float valor) {
		this.objetoConta = objetoConta;
		this.valor = valor;
	}
	
	public int getId_lancamento() {
		return id_lancamento;
	}
	public void setId_lancamento(int id_lancamento) {
		this.id_lancamento = id_lancamento;
	}
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
	
	

}