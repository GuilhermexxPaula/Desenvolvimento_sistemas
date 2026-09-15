package app;

import java.util.ArrayList;
import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
	
		Scanner input =new Scanner (System.in);
		
		ArrayList<String>nomes =new ArrayList();
		
		String nome;
		
		String continuar;
		
		
		do {
			System.out.print("Digite um nome:");
			
			nome= input.nextLine();
			
			nomes.add(nome);
			
			System.out.print("Deseja  adicionar outro nome? (S/n):");
			
			continuar= input.nextLine();
			
			
			
		} while (continuar.equalsIgnoreCase("s"));
		
		
		
		System.out.println("\nNomes cadastrados :");
		
		for(String nomeCadastro :nomes) {
			System.out.println(nomeCadastro);
		}
		input.close();
		
		

	}

}
