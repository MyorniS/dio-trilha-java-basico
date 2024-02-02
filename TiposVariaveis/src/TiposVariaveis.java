import java.util.Scanner;

public class TiposVariaveis {

	public static void main(String[] args) {
		
		/* FAMILIA  - TIPO PRIMITIVO - WRAPPER CLASS - TAMANHO
		 * LÓGICO   - 	  boolean    -   Boolean     - 1 bit               
		 * LITERAIS -	  char       -   Character   - 1 byte         
		 *          -	    --       -   String      - 1 byte/cada
		 * INTEIROS -	  byte       -   Byte        - 1 byte         
		 * 			-	  short      -   Short       - 2 bytes         
		 * 			-	  int        -   Integer     - 4 bytes          
		 * 			-	  long       -   Long        - 8 bytes           
		 * REAIS	-	  float      -   Float       - 4 bytes         
		 * 			-	  double     -   Double      - 8 bytes          
		 */
		
		String nome = "Murilo";
		int idade = 25;
		float sal = 1825.54f;
		char letra = 'G';
		boolean resposta = false;
		
		System.out.println("A idade de " + nome + " é " + idade);
		System.out.println("Sabe o Senhor " + letra + "? Então, sabia que ele é casado? " + resposta);
		System.out.println(sal);
		
		try (Scanner ler = new Scanner(System.in)) {
			System.out.print("Qual o seu nome? ");
			String name = ler.nextLine();
			System.out.print("E a sua idade? ");
			int id = ler.nextInt();
			System.out.println("Legal seu nome é " + name + " e sua idade é " + id);
		}
		
	}

}
