package view;

import java.util.Scanner;
import controller.ContaDAO;


public class TelaUsuario {
	
	Scanner ler = new Scanner(System.in);
		
		public void cadastrar(ContaDAO conta) throws Exception
		{
			String nome, senha, email;
			float valor;
			
			System.out.print("Nome: ");
			nome = ler.nextLine();
			System.out.print("Senha: ");
			senha = ler.nextLine();
			System.out.print("Email: ");
			email = ler.nextLine();
			System.out.print("Digite um saldo: ");
			valor = ler.nextFloat();
			
			if(conta.Criar(nome,email,senha,valor)){
				//System.out.println("Cliente cadastrado com sucesso");
			}else{
				System.out.println("Erro ao cadastrar usuário");
			}
			
}
		public boolean login(ContaDAO conta){
			Scanner ler = new Scanner (System.in);
			
			System.out.print("Login: ");
			String nome = ler.nextLine();
			System.out.print("Senha: ");
			String senha = ler.nextLine();
			
			return conta.fazerLogin(nome, senha);
			
			
		}
}

