
public class ResultadoEscolar {

	public static void main(String[] args) {
		
		//Condicional encadeada

		int nota = 10;
		
		System.out.println("Nota: " + nota);
		if(nota >= 7)
			System.out.println("Aprovado :)");
		else if(nota >=5 && nota < 7)
			System.out.println("Prova Recuperação :/");
		else
			System.out.println("Reprovado :(");
		
	}

}
