package Kala;

public class Keuhkokala extends Kala{
	
	private int varsievi�;
	
	
	@Override
	public String toString() {
		return "Keuhkokala [varsievi�=" + varsievi� + ", toString()=" + super.toString() + "]";
	}
	

	public Keuhkokala() {
		super();
		super.setLaji("Keuhkokala");
		this.varsievi� = 4;
	}
	void hengita() {
		System.out.println("Huoh -- Hengittelen ilmaa");
	}

	public int getVarsievi�() {
		return varsievi�;
	}

	public void setVarsievi�(int varsievi�) {
		this.varsievi� = varsievi�;
	}
	
	

}
