package Kala;

public class Kala {
	
	static int parvenKoko;
	private String laji;
	private double paino;
	
	
	@Override
	public String toString() {
		return "Kala [laji=" + laji + ", paino=" + paino + "]";
	}
	public static int getParvenKoko() {
		return parvenKoko;
	}
	public static void setParvenKoko(int parvenKoko) {
		Kala.parvenKoko = parvenKoko;
	}
	public String getLaji() {
		return laji;
	}
	public void setLaji(String laji) {
		this.laji = laji;
	}
	public double getPaino() {
		return paino;
	}
	public void setPaino(double paino) {
		this.paino = paino;
	}

}
