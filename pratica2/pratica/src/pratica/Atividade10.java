package pratica;

public class Atividade10 {

	public static void main(String[] args) {
		double Carlos=3000.00;
		double Joao=1000;
		int contador=0;
		
		do {
				Carlos=Carlos*1.02;
				Joao=Joao*1.05;
				contador++
				;
		}while(Carlos>Joao);
		
		System.out.println("Contador:"+contador);
		System.out.printf("Carlos:%.2f%n:",Carlos);
		System.out.printf("Joao:%.2f%n:",Joao);
 
	}

}
