package controller;

import java.util.ArrayList;

import model.Categoria;

public class CategoriaDAO {
	
	public void add(ArrayList<Categoria> lista){
		lista.add(new Categoria(1, "Sal�rio", "teste"));
		lista.add(new Categoria(2, "Investimento", "teste"));
		lista.add(new Categoria(3, "Moradia", "teste"));
		lista.add(new Categoria(4, "Contas Resid�nciais", "teste"));
		lista.add(new Categoria(5, "Sa�de", "teste"));
		lista.add(new Categoria(6, "Educa��o", "teste"));
		lista.add(new Categoria(7, "Transporte", "teste"));
		lista.add(new Categoria(8, "Mercado", "teste"));
		lista.add(new Categoria(9, "Outros", "teste"));
		
	}
}
