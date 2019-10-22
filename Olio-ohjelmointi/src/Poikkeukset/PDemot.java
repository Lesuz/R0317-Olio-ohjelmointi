package Poikkeukset;

public class PDemot {

	public static void main(String[] args) {
		
		int[] taulu = new int[10];
		
		try {
			for (int i = 0 ; i <= 10; i++) {
			System.out.println(i + ": " + taulu[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Taulukon ideksi ylitty");
		} catch(ArithmeticException e) {
			System.out.println("Laskutoimituksessa tapahtui virhe!");
		}catch (Exception e) {
			System.out.println("Ohjelman suorituksessa tapahtui virhe. Ota yhteys asiakaspalveluun!");
			System.out.println(e.getMessage());
			// e.printStackTrace(); tulostaa alkuperäisen virheilmoituksen
			//muuttujaan e tallentuu virheet jotka tapahtuo koodia ajettaessa
			//Exception e ottaa kaikki virhe ilmotukset joten jos se ekana catchina niin muita catheja ei oteta huomioon!
		} finally {
			System.out.println("Lopputoimet ohjelman päättyessä!");
		}
	}
}
