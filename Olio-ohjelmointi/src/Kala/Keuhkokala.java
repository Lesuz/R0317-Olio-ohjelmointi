package Kala;

public class Keuhkokala extends Kala{
	
	private int varsieviš;
	
	
	@Override
	public String toString() {
		return "Keuhkokala [varsieviš=" + varsieviš + ", toString()=" + super.toString() + "]";
	}
	

	public Keuhkokala() {
		super();
		super.setLaji("Keuhkokala");
		this.varsieviš = 4;
	}
	void hengita() {
		System.out.println("Huoh -- Hengittelen ilmaa");
	}

	public int getVarsieviš() {
		return varsieviš;
	}

	public void setVarsieviš(int varsieviš) {
		this.varsieviš = varsieviš;
	}
	
	

}
