package Keksiteht;

public class Keksitehdas {
	public static void main(String[] args) {
		
		Keksi ekaKeksi = new Keksi();
		Keksi tokaKeksi = new Keksi();
		Keksi kolmasKeksi = new Keksi();
		
		ekaKeksi.setmerkki("Fazer");
		ekaKeksi.setpaino (15);
		
		tokaKeksi.setmerkki("Marabou");
		tokaKeksi.setpaino(20);
		
		kolmasKeksi.setmerkki("Fazer");
		kolmasKeksi.setpaino(40);
		
		System.out.println(ekaKeksi);
		System.out.println();
		System.out.println(tokaKeksi);
		System.out.println();
		System.out.println(kolmasKeksi);
	}
}
