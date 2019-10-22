package AutoEsimerkki;

public class Auto {

	private String väri;
	private int nopeus;
	private int ajokilometrit;
	static int autojenLkm;
	
	
	@Override
	public String toString() {
		return "Auto [väri=" + väri + ", nopeus=" + nopeus + ", ajokilometrit=" + ajokilometrit + "]";
	}
	public Auto() {
		
		this.väri = "Ei väriä";
		this.nopeus = 10;
		this.ajokilometrit = 0;
	}
	
	public String getVäri() {
		return väri;
	}
	public void setVäri(String väri) {
		this.väri = väri;
	}
	public int getNopeus() {
		return nopeus;
	}
	public void setNopeus(int nopeus) {
		this.nopeus = nopeus;
	}
	public int getAjokilometrit() {
		return ajokilometrit;
	}
	public void setAjokilometrit(int ajokilometrit) {
		this.ajokilometrit = ajokilometrit;
	}
	
	
	
}
