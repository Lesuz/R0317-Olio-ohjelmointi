package OmenaHarjoitus;

public class Omena {

	private String väri;
	private String lajike;
	private int paino;
	
	public String toString() {
		String tuloste = "Lajike: " + this.getLajike() + ", väri: " + this.getVäri() + ", paino: " + this.getPaino();
		return tuloste;
	}
	public String getVäri() {
		return this.väri;
	}
	public void setVäri(String uusiVäri) {
		this.väri = uusiVäri;
	}
	public String getLajike() {
		return this.lajike;
	}
	public void setLajike(String uusiLajike) {
		this.lajike = uusiLajike;
	}
	public int getPaino() {
		return this.paino;
	}
	public void setPaino(int uusiPaino) {
		this.paino = uusiPaino;
	}
	public Omena() {
		this.lajike = "Ei arvoa";
		this.väri = "Väritön";
	}
	public void haukkaa() {
		System.out.println("Rouskis!");
		this.paino -= 10;
	}
}
