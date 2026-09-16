package academia;

public class Principal {

	public static void main(String[] args) {
	
		AlunoAcademia al= new AlunoAcademia();
		
		al.nome="Lazaro Barbosa";
		al.idade=33;
		al.peso=70.5;
		al.altura=1.72;
		
		al.ehMenorIdade();
		al.exibirDados();
		
AlunoAcademia al2= new AlunoAcademia();
		
		al2.nome="Lazaro ";
		al2.idade=32;
		al2.peso=70.1;
		al2.altura=1.72;
		
		al2.ehMenorIdade();
		al2.exibirDados();
		
		
		

	}

}
