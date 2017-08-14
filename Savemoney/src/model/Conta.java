package model;

import java.io.Serializable;
import java.util.ArrayList;
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
	
	
	
	
	public Conta(String nome, String email, String senha, float valor) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.valor = valor;
	}
	


	public void setValor(float valor) {
		this.valor = valor;
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
	
	public void ImprimirExtrato(Lancamento lancamento){
		
		System.out.print("   ");
	
			
	}
	public float getValor() {
		return this.valor;
	}
	public float getSaldoFinal() {
		ArrayList<Lancamento> listaLancamentos = new LancamentoDAO().getListaLancamentos();
		
		float receitas = 0;
		float despesas = 0;
		
		for(Object o : listaLancamentos) {
			if ( ((Lancamento) o).getObjetoConta().getNome().equals(this.nome)) {
			
			if(o instanceof Despesas ) 
				despesas += ((Despesas) o).getValor();
			else
				receitas += ((Receitas) o).getValor();
			}
		}
		return this.valor + receitas - despesas;
	}
	
}




	


