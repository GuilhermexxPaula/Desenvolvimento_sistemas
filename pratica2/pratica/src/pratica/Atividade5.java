package pratica;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		
		Scanner leia= new Scanner(System.in);
		
		System.out.println("Digite a tabuada que gostaria de ver:");
		
		int numero=leia.nextInt();
		do {
			
		
			System.out.println("Digite o número da tabuada que gostaria de ver:");
			numero=leia.nextInt();
			
		
		}while(numero<=1&& numero>=10);
			
		for(int i=1;i<=10;i++) {
			if(numero==1) {
			System.out.println(numero+"x"+"="+numero*i);
			}
			if(numero==2) {
				System.out.println(numero+"x"+"="+numero*i);
				}
			if(numero==3) {
				System.out.println(numero+"x"+"="+numero*i);
				}
			if(numero==4) {
				System.out.println(numero+"x"+"="+numero*i);
				}
			if(numero==5) {
				System.out.println(numero+"x"+"="+numero*i);
				}
			if(numero==6) {
				System.out.println(numero+"x"+"="+numero*i);
				}
			if(numero==7) {
				System.out.println(numero+"x"+"="+numero*i);
				}
			if(numero==8) {
				System.out.println(numero+"x"+"="+numero*i);
				}
			if(numero==9) {
				System.out.println(numero+"x"+"="+numero*i);
				}
			if(numero==10) {
				System.out.println(numero+"x"+"="+numero*i);
				}
			
		}
		

	}

}
