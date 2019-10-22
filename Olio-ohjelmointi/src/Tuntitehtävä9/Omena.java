package Tuntiteht‰v‰9;

public class Omena {

	String lajike;
	String v‰ri;
	int paino;
	
	public Omena() {
		lajike = "Ei m‰‰ritelty";
		v‰ri = "Ei m‰‰ritelty";
		paino = 5;
	}
	public Omena(String lajike, String v‰ri, int paino) {
		this.lajike = lajike;
		this.v‰ri = v‰ri;
		this.paino = paino;
	}
	public String getLajike() {
		return lajike;
	}
	public void setLajike(String lajike) {
		this.lajike = lajike;
	}
	public String getV‰ri() {
		return v‰ri;
	}
	public void setV‰ri(String v‰ri) {
		this.v‰ri = v‰ri;
	}
	public int getPaino() {
		return paino;
	}
	public void setPaino(int paino) {
		this.paino = paino;
	}
	
	
}
