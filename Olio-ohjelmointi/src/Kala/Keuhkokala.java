package Kala;

public class Keuhkokala extends Kala{
	
	private int varsieviä;
	
	
	@Override
	public String toString() {
		return "Keuhkokala [varsieviä=" + varsieviä + ", toString()=" + super.toString() + "]";
	}
	

	public Keuhkokala() {
		super();
		super.setLaji("Keuhkokala");
		this.varsieviä = 4;
	}
	void hengita() {
		System.out.println("Huoh -- Hengittelen ilmaa");
	}

	public int getVarsieviä() {
		return varsieviä;
	}

	public void setVarsieviä(int varsieviä) {
		this.varsieviä = varsieviä;
	}
	
	

}
