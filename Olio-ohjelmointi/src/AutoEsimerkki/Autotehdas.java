package AutoEsimerkki;

public class Autotehdas {

	public static void main(String[] args) {
		
	Auto a1 = new Auto();
	MuseoAuto m1 = new MuseoAuto();
	
	m1.setVäri("Musta");
	m1.setNopeus(100);
	m1.käyttöönottovuosi = 1951;
	// ei voi käyttää setteriä koska se on public muuttuja!
	
	a1.setVäri("Punainen");
	
	System.out.println(a1);
	System.out.println(m1);
	}
}
