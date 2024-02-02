
public class Operadores {

	public static void main(String[] args) {
		
		/* Operadores aritméticos
		 * Operadores unários
		 * Operadores relacionais
		 * Operadores lógicos
		 * Operador   ternário  */
		
		
		//Operador de atribuição --> = Ex: int var = 5; é utilizado para definir o valor inicial ou sobrescrever o valor de uma variável.
		
		//Aritméticos são: + (adição), - (subtração), * (multiplicação) e / (divisão).
		
		int var = 5;
		
		var = - var;
		
		System.out.println(var);
		
		var = var * -1;
		
		System.out.println(var);
		
		int numero1 = 10;
		int numero2 = 10;
		int soma = numero1 + numero2;
		int multi = numero1 * numero2;
		String resultado = (soma==multi) ?"verdadeiro" : "falso";
		
		//int resultado = (soma==multi) ? 1 : 0;
		/*String resultado = "";
		if(soma==multi)
			resultado = "verdadeiro";
		else
			resultado = "falso";*/
		
		System.out.println("O primeiro número é: " + numero1);
		System.out.println("O segundo número é: " + numero2);
		System.out.println("A soma entre eles é " + soma);
		System.out.println("A multiplicação entre eles é " + multi);
		System.out.println("A multiplicação e a soma são iguais? " + resultado);
		
		
		String nomeCompleto = "LINGUAGEM" + "JAVA";
				
		//qual o resultado das expressoes abaixo?
		String concatenacao ="?"; 

		concatenacao = 1+1+1+"1";

	  /*concatenacao = 1+"1"+1+1;

		concatenacao = 1+"1"+1+"1";

		concatenacao = "1"+1+1+1;

		concatenacao = "1"+(1+1+1);*/
		
		System.out.println(nomeCompleto);
		System.out.println(concatenacao);
		
	}

}
