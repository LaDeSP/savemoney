package controller;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import view.TelaUsuario;

public class Main {

	public static void main(String[] args)throws IOException {
		FileWriter arq = new FileWriter("d:\\arquivo.txt");
		PrintWriter gravarArq = new PrintWriter(arq);
		 new TelaUsuario();
		

	}

}
