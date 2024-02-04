import java.util.Scanner;

public class SmartTv {
	
	boolean ligada = false;
	int canal = 1;
	int volume = 25;
	
	public void ligar() {
		ligada = true;
		System.out.println("Novo status --> Tv ligada? " + ligada);
	}
	
	public void desligar() {
		ligada = false;
		System.out.println("Novo status --> Tv desligada? " + ligada);
	}
	
	public void subirCanal () {
		canal++;
		System.out.println("Canal alterado para: " + canal);
	}
	
	public void voltarCanal () {
		canal--;
		System.out.println("Canal alterado para: " + canal);
	}
	
	public void escolherCanal () {
		try (Scanner ler = new Scanner(System.in)) {
			canal = ler.nextInt();
		}
		System.out.println("Canal alterado para: " + canal);
	}	
	
	public void aumentarVolume() {
		volume++;
		System.out.println("Volume aumentando: " + volume);
	}
	
	public void diminuirVolume() {
		volume--;
		System.out.println("Volume diminuindo: " + volume);
	}
	
}
