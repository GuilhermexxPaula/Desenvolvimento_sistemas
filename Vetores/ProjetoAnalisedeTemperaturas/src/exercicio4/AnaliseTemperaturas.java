package exercicio4;

import java.util.Scanner;

public class AnaliseTemperaturas {

	public static void main(String[] args) {
		
Scanner leia=new Scanner (System.in);
		
		double [] temperatura =new double[7];
		double menor,maior;
		
		for (int i=0; i< temperatura.length;i++) {
			System.out.print("Digite a temperatura:"+ (i+1)+"º dia");
			temperatura[i]=leia.nextDouble();
			
		}
		
		maior=temperatura[0];
		menor=temperatura[0];
		
		for (int i=0; i< temperatura.length;i++) {
			
			
			if (temperatura[i]>maior) {
				maior=temperatura[i];
			}
			if(temperatura[i]<menor) {
				menor=temperatura[i];
			}
			
		}
		System.out.println("Menor:"+menor);
		System.out.println("Maior:"+maior);
		

	}

	}


