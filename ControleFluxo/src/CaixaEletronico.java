import java.util.Scanner;

public class CaixaEletronico {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		//Condicional Composta
		double saldo = 25.0;

		System.out.println("Sua conta tem o saldo de: " + saldo);
		System.out.println("Solicite um valor para retirada: "); 
		double valorSolicitado = ler.nextDouble();
		
		if(valorSolicitado <= saldo) {
			saldo = saldo - valorSolicitado;
			System.out.println("Os R$" + valorSolicitado + " que foi solicitado podem ser retirados");
			System.out.println("Saldo atual: " + saldo);
		} 
		else
			System.out.println("Saldo insuficiente");
		
		
		
	}

}
