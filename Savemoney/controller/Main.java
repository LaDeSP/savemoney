package controller;


import view.TelaUsuario;

public class Main {

	public static void main(String[] args)throws Exception {
		ContaDAO conta = new ContaDAO();
		 new TelaUsuario().cadastrar(conta);
		 new TelaUsuario().login(conta);
		

	}

}
