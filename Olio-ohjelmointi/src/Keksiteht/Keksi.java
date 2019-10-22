package Keksiteht;

public class Keksi {

	private String merkki;
	private int paino;
	
	public String toString() {
		String kuvaus = "Keksin merkki on " + this.getmerkki() + " ja keksin paino on " + this.getpaino() + "g .";
		return kuvaus;
	}
	public String getmerkki () {
		return this.merkki;
	}
	public void setmerkki (String uusiMerkki) {
		this.merkki = uusiMerkki;
	}
	public int getpaino () {
		return this.paino;
	}
	public void setpaino (int uusiPaino) {
		this.paino = uusiPaino;
	}
	public void haukkaa() {
		this.paino -= 10;
		
		while (paino == 0) {
			break;
		}
	}
}
