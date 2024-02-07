import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		String nomeCliente; 
		String agencia;
		int numero;
		double saldo;
		
		System.out.print("Por favor, digite o seu nome: ");
		nomeCliente = sc.nextLine();
		System.out.print("Por favor, digite o número da conta: ");
		numero = sc.nextInt();
		System.out.print("Por favor, digite o número da Agência: ");
		agencia = sc.next();
		System.out.print("Por favor, digite o número do saldo: ");
		saldo = sc.nextDouble();
		
		System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
		", conta " + numero + " e seu saldo " + saldo+ " já está disponível para saque.");
		
	}

}
