package Tuntiteht�v�9;

public class PuunIstuttaja {

	public static void main(String[] args) {

		// Luodaan olio
		Omena ekaOmena = new Omena();
		Omena tokaOmena = new Omena();
		Omena kolmasOmena = new Omena();
		
		Omenapuu omaPuu = new Omenapuu();

		// Asetetaan arvot
		ekaOmena.v�ri = "vihre�";
		ekaOmena.lajike = "Valkeakuulas";

		tokaOmena.v�ri = "Punainen";
		tokaOmena.lajike = "Ida Red";

		kolmasOmena.v�ri = "Keltainen";
		kolmasOmena.lajike = "Tuntematon";
 
	
		omaPuu.omenat[0] = ekaOmena;
		omaPuu.omenat[1] = tokaOmena;
		omaPuu.omenat[2] = kolmasOmena;
		
		System.out.println( omaPuu );

	}
}
