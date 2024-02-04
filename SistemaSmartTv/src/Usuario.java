public class Usuario {

	public static void main(String[] args) throws Exception {
		
		SmartTv smartTv = new SmartTv();
		
		System.out.println("A Smart Tv está ligada? " + smartTv.ligada);
		System.out.println("A Smart Tv está em que canal? " + smartTv.canal);
		System.out.println("A Smart Tv está em que volume? " + smartTv.volume);
	
		smartTv.ligar();
		
		smartTv.subirCanal();
		
		System.out.print("Qual o canal que tu queres? ");
		smartTv.escolherCanal();
		
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		System.out.println("O volume aumentou para: " + smartTv.volume);
		smartTv.diminuirVolume();
		System.out.println("O volume diminuiu para: " + smartTv.volume);
		smartTv.voltarCanal();
		
		smartTv.desligar();
	}

}
