package model;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.text.*;

import controller.LancamentoDAO;
/*import java.util.Scanner;*/

/*import java.util.Calendar;*/
public class Lancamento implements Serializable{
	public static final char RECEITAS = 0;
	protected int id_lancamento;
	protected String data;
	protected Conta objetoConta;
	protected float valor;
	protected Categoria objetoCategoria;
	

	public Lancamento(String data,Conta objetoConta, float valor, Categoria objetoCategoria) {
		this.data = data;
		this.objetoConta = objetoConta;
		this.valor = valor;
		this.objetoCategoria = objetoCategoria;
	}
	
	public Categoria getObjetoCategoria() {
		return objetoCategoria;
	}

	public void setObjetoCategoria(Categoria objetoCategoria) {
		this.objetoCategoria = objetoCategoria;
	}

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

	
	public int getId_lancamento() {
		return id_lancamento;
	}
	public void setId_lancamento(int id_lancamento) {
		this.id_lancamento = id_lancamento;
	}
	public String getData() {
		return formataData(data);
	}
	public void setData(String data) {
		this.data = data;
	}
	public  String formataData(String data){
		//System.out.println(data);
		SimpleDateFormat df = new SimpleDateFormat ("yyyy-MM-dd");
		try {
			Date d = df.parse(data);
			df = new SimpleDateFormat("dd/MM/yyyy");
			String s = df.format(d);
			return s;
		} catch (Exception e) {
			return data;
		}
		
		
	}
	

}