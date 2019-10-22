package OmenaHarjoitus;

public class Omena {

	private String v�ri;
	private String lajike;
	private int paino;
	
	public String toString() {
		String tuloste = "Lajike: " + this.getLajike() + ", v�ri: " + this.getV�ri() + ", paino: " + this.getPaino();
		return tuloste;
	}
	public String getV�ri() {
		return this.v�ri;
	}
	public void setV�ri(String uusiV�ri) {
		this.v�ri = uusiV�ri;
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
		this.v�ri = "V�rit�n";
	}
	public void haukkaa() {
		System.out.println("Rouskis!");
		this.paino -= 10;
	}
}
