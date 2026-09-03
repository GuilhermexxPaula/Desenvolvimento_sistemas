package pratica;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		Scanner leia=new Scanner (System.in);
		System.out.println("Digite sua idade:");
		int idade=leia.nextInt();
		
		if(idade<5) {
			System.out.println("nenhuma categoria");
			
		} else if(idade>5) {
			System.out.println("Infantil");
			
		}
		
		
		else if(idade>8) {
		System.out.println("juvenil");
		
	}
	
		else if(idade>11) {
		System.out.println("adolescente");
		
	}
	
		else if(idade>16) {
		System.out.println("adulto");
		
	}
	
		else  {
		System.out.println("sênior");
		
	}
	
	
	
	

	}

}
