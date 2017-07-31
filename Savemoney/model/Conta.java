package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import controller.LancamentoDAO;
/*import model.Lancamento;*/

public class Conta implements Serializable{
	private static final long serialVersionUID = 1L;
	private static final AtomicInteger count = new AtomicInteger(0);
	public static int id_conta;
	protected String nome;
	protected String email;
	protected String senha;
	private float valor;
	
	public void setValor(float valor) {
		this.valor = valor;
	}
	public Conta(String nome, String email, String senha) {
		
	}
	public Conta() {
		// TODO Auto-generated constructor stub
	}
	public static int getId_conta() {
		return id_conta;
	}
	public void setId_conta(int id_conta) {
		Conta.id_conta = id_conta;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public void ImprimirExtrato(ArrayList<Lancamento> listaLancamentos, LancamentoDAO x){
		System.out.print("   ");
		x.show(listaLancamentos);
			
	}
	public float getValor() {
		return this.valor;
	}
}


	


