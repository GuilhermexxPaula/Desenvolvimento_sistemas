package academia;

public class AlunoAcademia {


	String nome;
	
	int idade;
	
	double peso;
	
	double altura;
	
	
	public AlunoAcademia() {
		this.nome=nome;
		this.idade=idade;
		this.peso=peso;
		this.altura= altura;
	}
	
	boolean ehMenorIdade() {
		
		if(idade<18) {
			System.out.println("Menor de idade");
			
			return true;
		}else {
			return false;
		}
	}
	
	double calcularIMC() {
		
		return peso/(altura*altura);
		
		
	}
	
	public void exibirDados() {
		System.out.println("Nome:"+nome);
		System.out.println("Idade:"+idade);
		System.out.println("peso:"+peso);
		System.out.println("altura:"+ altura);
	}
	
	

}
