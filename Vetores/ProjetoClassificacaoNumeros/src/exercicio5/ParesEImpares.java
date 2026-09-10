package exercicio5;

import java.util.Scanner;

public class ParesEImpares {

	public static void main(String[] args) {
Scanner leia=new Scanner (System.in);
		
		int [] numeros =new int[8];
		
		
		for (int i=0; i< numeros.length;i++) {
			System.out.print("Digite o valor:"+ (i+1)+"º ");
			numeros[i]=leia.nextInt();
			
		}
		int pares=numeros[0];
		int impar=numeros[0];
		
		
		for (int i=0; i< numeros.length;i++) {
			
			
			if (numeros[i]%2==0) {
				pares=numeros[i];
			}
			if(numeros[i]!=0) {
				impar=numeros[i];
			}
			
		}
		System.out.println("impar:"+impar);
		System.out.println("pares:"+pares);

	}

}
