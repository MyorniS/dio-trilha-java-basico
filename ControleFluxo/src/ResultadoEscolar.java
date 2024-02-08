
public class ResultadoEscolar {

	public static void main(String[] args) {
		
		//Condicional ternária

		int nota = 10;
		
		System.out.println("Nota: " + nota);
		
		String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
		System.out.println(resultado);
		
//		Condicional encadeada
//		if(nota >= 7)
//			System.out.println("Aprovado :)");
//		else if(nota >=5 && nota < 7)
//			System.out.println("Prova Recuperação :/");
//		else
//			System.out.println("Reprovado :(");
		
	}

}
