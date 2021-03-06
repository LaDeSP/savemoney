package controller;



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

import model.Conta;


public class ContaDAO implements Serializable {

	int id;
	private static final long serialVersionUID = 1L;
	private static final AtomicInteger count = new AtomicInteger(0);
	private static ArrayList<Conta>listaConta = new ArrayList<Conta>();
	
	public ContaDAO(){
		id = count.incrementAndGet();
	}
	

	public static boolean Escrever(Object objeto)
	{
		//System.out.println("Entrou");
		try {
			
			FileOutputStream fos = new FileOutputStream("contas.ser");
	    	ObjectOutputStream oos = new ObjectOutputStream(fos);
	    	oos.writeObject(objeto);
	    	oos.flush();
	    	oos.close();
		}
		catch(IOException e){
			e.printStackTrace();	
		}
		return false;
	}
	
	


	public boolean Criar(String nome, String email, String senha, float valor){
	
			Conta novo = new Conta(nome, email, senha, valor);
			this.listaConta.add(novo);
			System.out.println ("Conta criado com sucesso");
			this.Escrever(this.listaConta);
		return true;
	}

	public static ArrayList<Conta> getListaConta() {
		try {
			FileInputStream fos = new FileInputStream("contas.ser");
			
			ObjectInputStream  oos = new ObjectInputStream(fos);
	    	
			try {
				listaConta = (ArrayList<model.Conta>) oos.readObject();
				} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
			
			oos.close();
		}
		catch(IOException e){
			e.printStackTrace();	
		}
		
		return listaConta;
	}


	public void setListaConta(ArrayList<Conta> listaConta) {
		this.listaConta = listaConta;
	}
	
	public void Remove(int id){
	
		for(Conta conta : listaConta)
		{
			if(id == model.Conta.getId_conta())
			{
				this.listaConta.remove(model.Conta.id_conta);
				return ;
			}
		}
	}
	
	public static void Lista(){
		
		for(Conta conta : listaConta)
		{
			System.out.println("\tNome: "+conta.getNome());
		}
	}
	
	public Conta fazerLogin(String nome, String senha){
		//System.out.println("ainda n�o");
		for (Conta c: this.listaConta){
			
			if(nome.equals(c.getNome()) && senha.equals(c.getSenha())){
				System.out.print("Login efetuado com sucesso!");
				return c;
			}			
		}
		
		System.out.print("Nome ou senha incorreto!");
		return null;
		
		
	}

	
}

