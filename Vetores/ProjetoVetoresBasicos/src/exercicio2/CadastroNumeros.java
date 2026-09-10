package exercicio2;

import java.util.Scanner;

public class CadastroNumeros {

	public static void main(String[] args) {
		
		Scanner leia= new Scanner(System.in);
		
		int []numeros=new int[5];
		
		for (int i=0; i< numeros.length;i++) {
			System.out.print("Digite o número:"+ (i+1)+"º");
			numeros[i]=leia.nextInt();
		}
		
		for (int i=0;i< numeros.length;i++) {
			System.out.println(numeros[i]);
		}

		
		

	}

}
