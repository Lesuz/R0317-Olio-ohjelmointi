package KirjaTeht;

public class Kirja {

	private String teoksenNimi = "Ei tietoa";
	private int julkaisuvuosi = 0 ;
	private String tekij� = "Ei tietoa";
	private double hinta = 0;
	
	public String toString() {
		String tuloste = "Teoksen nimi :" + this.getteoksenNimi() + "\n" + "Julkaisuvuosi: " + this.getjulkaisuvuosi() + "\n" + 
						 "Tekij�: " + this.gettekij�() + "\n" + "Hinta: " + this.gethinta();
		return tuloste;
	}
	
	public String getteoksenNimi () {
		return this.teoksenNimi;
	}
	public void setteoksenNimi (String uusiNimi) {
		this.teoksenNimi = uusiNimi;
	}
	public int getjulkaisuvuosi () {
		return this.julkaisuvuosi;
	}
	public void setjulkaisuvuosi (int uusiVuosi) {
		this.julkaisuvuosi = uusiVuosi;
	}
	public String gettekij� () {
		return this.tekij�;
	}
	public void settekij� (String uusiTekij�) {
		this.tekij� = uusiTekij�;
	}
	public double gethinta () {
		return this.hinta;
	}
	public void sethinta (double uusiHinta) {
		this.hinta = uusiHinta;
	}
}
