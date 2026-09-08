package pratica;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		
		Scanner leia = new  Scanner (System.in);
		
		System.out.println("Digite sua altura:");
		
		double altura=leia.nextDouble();
		
		System.out.println("Digite base ");
		double base= leia.nextDouble();
		
		do {
			if(altura==0 && base==0) {
			System.out.println("Inválido");}
			
			
		}while(altura==0 && base==0);
		
		
		System.out.println("Sua base é:"+altura*base/2);
		
		
		
		

	}

}
