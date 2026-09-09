package pratica;

import java.util.Scanner;

public class Atividade {

	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		
		System.out.println("Digite o primeiro número:");
		
	int numero1=leia.nextInt();
	System.out.println("Digite o segundo número:");
	int numero2=leia.nextInt();
	
	System.out.println("Digite a opcao:");
	
	int opcao=leia.nextInt();
	
	int maior;
	
	switch(opcao) {
	
	case 1:
		
	System.out.println(numero1+numero2/2);
	
	break;
	
	case 2:
		
		if(numero1>numero2) {
			maior=numero1;
			System.out.println(maior-numero2);
		}else {
			System.out.println(numero2-numero1);
		}
		break;
		
	case 3:
		System.out.println(numero1*numero2);
		break;
		
	case 4:
		System.out.println(numero1/numero2);
		break;
		
	default:
		System.out.println("Inválido");
		

	}

}}
