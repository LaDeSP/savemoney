package view;

import java.util.Scanner;
import controller.ContaDAO;


public class TelaUsuario {
	
	Scanner ler = new Scanner(System.in);
		
		public void cadastrar() throws Exception
		{
			String nome, senha, email;
			
			System.out.print("Nome: ");
			nome = ler.nextLine();
			System.out.print("Senha: ");
			senha = ler.nextLine();
			System.out.print("Email: ");
			email = ler.nextLine();
			
			if(ContaDAO.Criar(nome,email,senha)){
				System.out.println("Cliente cadastrado com sucesso");
			}else{
				System.out.println("Erro ao cadastrar cliente");
			}

}
}
