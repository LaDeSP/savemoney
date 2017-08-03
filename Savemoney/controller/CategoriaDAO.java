package controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import model.Categoria;




public class CategoriaDAO implements Serializable {
	int id;
	private static final long serialVersionUID = 1L;
	private static final AtomicInteger count = new AtomicInteger(0);
	private ArrayList<Categoria>listaCategoria = new ArrayList<Categoria>();
	
	public CategoriaDAO(){
		id = count.incrementAndGet();
	}
	
	public boolean Escrever(ArrayList<Categoria> objeto)
	{
		try {
			
			FileOutputStream fos = new FileOutputStream("categorias.ser");
	    	ObjectOutputStream oos = new ObjectOutputStream(fos);
	    	oos.writeObject(objeto);
	    	//oos.flush();
	    	oos.close();
		}
		catch(IOException e){
			e.printStackTrace();	
		}
		return false;
	}
	
	public boolean Criar(String nome, String descricao){
		
		Categoria novo = new Categoria(nome, descricao);
		this.listaCategoria.add(novo);
		System.out.println ("Categoria criado com sucesso");
		this.Escrever(this.listaCategoria);
	return true;
}

public ArrayList<Categoria> getListaCategoria() {
	try {
		FileInputStream fos = new FileInputStream("categoria.ser");
		ObjectInputStream  oos = new ObjectInputStream(fos);
    	
		try {
			this.listaCategoria = (ArrayList<model.Categoria>) oos.readObject();
			} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		oos.close();
	}
	catch(IOException e){
		e.printStackTrace();	
	}
	
	return listaCategoria;
}

public void setListaCategoria(ArrayList<Categoria> listaCategoria) {
	this.listaCategoria = listaCategoria;
}
	
	


}
