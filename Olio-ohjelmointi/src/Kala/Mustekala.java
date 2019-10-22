package Kala;

public class Mustekala extends Kala{

	private int lonkeroita;
	
	
	@Override
	public String toString() {
		return "Mustekala [lonkeroita=" + lonkeroita + ", toString()=" + super.toString() + "]";
	}
	

	public Mustekala() {
		super();
		super.setLaji("Mustekala");
		this.lonkeroita = 8;
	}


	void vapautaMustetta() {
		System.out.println("Mustetta p‰‰stetty!");
	}


	public int getLonkeroita() {
		return lonkeroita;
	}


	public void setLonkeroita(int lonkeroita) {
		this.lonkeroita = lonkeroita;
	}
	
}
