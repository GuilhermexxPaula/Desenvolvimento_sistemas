package app;

import java.util.ArrayList;
import java.util.Scanner;
public class Atividade7 {

	public static void main(String[] args) {
	
		Scanner input =new Scanner (System.in);
		
		ArrayList<String>nomes =new ArrayList<>();
		String nome;
		int opcoes;
		
		System.out.println("1 add convidado, 2 Alterar, 3 remover ,4 procurar, 5 Exibir ,6 encerrar");
		
		do {
			
			System.out.println("1 add convidado, 2 Alterar, 3 remover ,4 procurar, 5 Exibir ,6 encerrar");
			
			
			switch (opcoes){
			
			case 1:
			
			System.out.println("Digite o nome da pessoa");
			
			nome= input.next();
			nomes.add(nome);
			
			break;
			
			case 2:
				
			System.out.println("Digite a posição convidado:");
			
			int posicao=Integer.parseInt(input.next());
			
			
			System.out.println("Digite novo nome");
			
			nome = input.next();
			
			nomes.set(posicao, nome);
			
			
			
			break;
			
			case 3:
				System.out.println("Digite o nome que dejeja remover");
				
				nome= input.next();
				
				if(nomes.contains(nome)) {
					nomes.remove(nome);
				}else {
					System.out.println("Não encontrado ");
				}
				
				break;
				
				
			case 4:
				
				System.out.print("Nome para procurar :");
				
				String nomeProcurado=input.nextLine();
				
				int posicaoEncontrada= nomes.indexOf(nomeProcurado);
				
				
			break;
			
			
			case  5 :
				
				System.out.println("Lista de convidados:");
				
				System.out.println(nomes);
				
			break;
			
			
			case 6:
				
				System.out.println("Programa encerrado");}
			
			}while(opcoes!=6);
			
			
			
		}


	}


