package Harjoitus22lokakuu;

import java.util.ArrayList;

public class Tietorakenteita {
	
	public static void main(String[] args) {
		
		String[] taulu = new String[10];
		
		ArrayList<String> uusiTaulu = new ArrayList<String>();
		
		for (int i = 0; i < 1000000; i++) {
		
			uusiTaulu.add("Hoi Maailma");
		}
		
		System.out.println("Alkion x on: " + uusiTaulu.get(999999));
	}

}
