package app;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
	
Scanner input =new Scanner (System.in);
		
		ArrayList<String>tarefas =new ArrayList();
		
		String tarefa;
		
		String continuar;
		
		
		do {
			System.out.print("Adicione uma tarefa:");
			
			tarefa= input.nextLine();
			
			tarefas.add(tarefa);
			
			System.out.print("Deseja  adicionar outra tarefa ? (S/n):");
			
			continuar= input.nextLine();
			
			
			
		} while (continuar.equalsIgnoreCase("s"));
		
		
		
		System.out.println("\nTarefas  :");
		
		for(String tarefasCadastro :tarefas) {
			System.out.println(tarefasCadastro);
		}
		input.close();
		
		

	}

}
