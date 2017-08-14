package view;
import java.util.ArrayList;
import java.util.Scanner;

import model.Categoria;
import view.TelaLancamento;
import controller.LancamentoDAO;
import controller.CategoriaDAOold;;

public class TelaCategoria {
	CategoriaDAOold categoria;
	
	public Categoria tela() {
		Scanner ler = new Scanner(System.in);
		
		
		while(true) {
			if(categoria == null) {
				System.out.println("Não possui uma categoria!");
				System.out.println("Adicionar uma categoria: ");
				System.out.println("Digite um nome e uma descrição para a Categoria");
				String nome = ler.nextLine();
				String descricao = ler.nextLine();
				System.out.println("criar");
				categoria = new CategoriaDAOold();
				categoria.Criar(nome, descricao);
				//categoria = new CategoriaDAO(nome, descricao);
				
			}
			else {
				System.out.println(categoria.listar().getNome());
				System.out.println("Escolha uma categoria:");
				String cat = ler.next();
				if(cat.equals(categoria.listar().getNome())){
					System.out.println("ok");
				}
			}
		//	if(lista == lista){
			//	categoria.Criar(nome, descricao);
			//}
			
			/// criar um swith com as opçoes.	
		}
	}
	
}


	