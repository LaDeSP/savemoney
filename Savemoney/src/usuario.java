
public class usuario {
	private String nome;
	private String email;
	private String idade;
	private float salario;
	private double saldo; 
	public usuario(){}
	public usuario(String nome, String email, String idade, Float salario, double saldo){
		this.setNome(nome);
		this.setEmail(email);
		this.setIdade(idade);
		this.setSalario(salario);
		this.setSaldo(saldo);
	}
	
public String getNome(){
	return nome;
}
public String getEmail(){
	return email;
}
public String getIdade(){
	return idade;
}	
public float  getSalario(){
	return salario;
}
public double getSaldo(){
	return saldo;
}

public void setNome(String nome){
	this.nome = nome;
}

public void setEmail(String email){
	this.email = email;
}
public void setIdade(String idade){
	this.idade = idade;
}
public void setSalario(float salario){
	this.salario = salario;
}
public void setSaldo(double saldo){
	this.saldo = saldo;
}

public void consultaSaldo(){
	getSaldo();
}
}
