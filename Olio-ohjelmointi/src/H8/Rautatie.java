package H8;

import java.io.*;
import java.net.*;
import java.util.Scanner;


public class Rautatie {
	
	public static void main(String[] args) throws Throwable {
		
	//URL url = new URL ("http://www.gutenberg.org/cache/epub/10863/pg10863.txt");

	//BufferedReader read = new BufferedReader( new InputStreamReader(url.openStream()));
	
	//String i;
	
	//while((i = read.readLine()) != null)
	//	System.out.println(i);
	//read.close();
		
	Scanner lukija = null;
	File tiedosto = new File("C:\\Users\\lsusa\\Tietojenkäsittely\\Ohjelmoinnin jatkokurssi\\pg10863.txt");
	
	try {
		
		System.out.println("What word are you looking for?");
		Scanner vastaus = new Scanner(System.in);
		
		String sana = vastaus.nextLine();
		lukija = new Scanner(tiedosto);
		
		while(lukija.hasNextLine()) {
			String rivi = lukija.nextLine();
			//System.out.println(rivi);
			String haettava = sana;
			
			if(rivi.indexOf(haettava) > -1) {
				System.out.println(rivi);
			}
		}
	} catch (FileNotFoundException e) {
		System.out.println("Tiedostoa ei löydy..");
	}
	
	}
	
}
