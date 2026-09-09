package pratica;

import java.util.Scanner;

public class Atividade9 {

	public static void main(String[] args) {
		
		Scanner leia= new Scanner(System.in);
		
		int numero;
		
		do {
			System.out.println("Digite um número:");
			numero=leia.nextInt();
			
			System.out.println("numero:"+numero);
			System.out.println("Quadrado:"+numero*numero);
			System.out.println("Cubo:"+numero*numero*numero);
			System.out.println("Raiz :"+Math.sqrt(numero));
			
		}while(numero>-1);

	}

}
