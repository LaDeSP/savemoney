package model;

import controller.LancamentoDAO;
/*import model.Lancamento;*/

public class Conta {
	public static int id_conta;
	protected int id_lancamento;
	protected String nome;
	protected String email;
	protected String senha;
	
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
	public int getId_lancamento() {
		return id_lancamento;
	}
	public void setId_lancamento(int id_lancamento) {
		this.id_lancamento = id_lancamento;
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
	
	public void ImprimirExtrato(LancamentoDAO listaLancamentos){
		System.out.print("   ");
		listaLancamentos.show(null);
			
			

		}
	}


	


