package model;

public class Despesas extends Lancamento{
	public Despesas(String data,Conta objetoConta, float valor, Categoria categoria) {
		super(data, objetoConta, valor, categoria);
	}



	protected int id_despesa;
	protected float valor;
	public int getId_despesa() {
		return id_despesa;
	}
	public void setId_despesa(int id_despesa) {
		this.id_despesa = id_despesa;
	}
	
	
	
	public boolean Tirar (float valor){
		if(valor<0){
			valor = -valor;
			
		}
			
		if(valor >= this.valor){
			this.objetoConta.setValor(valor - this.valor);
			return true;
		}
		else
			return false;
	}
	

}
