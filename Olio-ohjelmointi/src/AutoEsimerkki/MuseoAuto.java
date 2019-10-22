package AutoEsimerkki;

public class MuseoAuto extends Auto{

	int käyttöönottovuosi;
	

	@Override
	public String toString() {
		return "MuseoAuto [käyttöönottovuosi=" + käyttöönottovuosi + ", toString()=" + super.toString() + "]";
	}


	public MuseoAuto() {
		super();
		this.käyttöönottovuosi = 1950;
		//Oletuksena kaikki museoaitot otettiin käyttöön 19501
		
	}
	
	
}
