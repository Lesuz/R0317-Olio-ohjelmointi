package AutoEsimerkki;

public class MuseoAuto extends Auto{

	int k�ytt��nottovuosi;
	

	@Override
	public String toString() {
		return "MuseoAuto [k�ytt��nottovuosi=" + k�ytt��nottovuosi + ", toString()=" + super.toString() + "]";
	}


	public MuseoAuto() {
		super();
		this.k�ytt��nottovuosi = 1950;
		//Oletuksena kaikki museoaitot otettiin k�ytt��n 19501
		
	}
	
	
}
