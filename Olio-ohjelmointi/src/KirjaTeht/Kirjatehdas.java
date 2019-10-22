package KirjaTeht;

public class Kirjatehdas {
	public static void main(String[] args) {
		
		Kirja ekaKirja = new Kirja();
		Kirja tokaKirja = new Kirja();
		//Kirja kolmasKirja = new Kirja("Turms kuolematon", 1956, "Waltari, Mika", 0);
		
		ekaKirja.setteoksenNimi("Sinuhe egyptiläinen");
		ekaKirja.setjulkaisuvuosi(1950);
		ekaKirja.settekijä("Waltari, Mika");
		
		System.out.println(ekaKirja);
		System.out.println();
		System.out.println(tokaKirja);
		System.out.println();
		//System.out.println(kolmasKirja);
	}
}
