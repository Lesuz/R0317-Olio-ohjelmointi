package AutoEsimerkki;

public class Autotehdas {

	public static void main(String[] args) {
		
	Auto a1 = new Auto();
	MuseoAuto m1 = new MuseoAuto();
	
	m1.setV�ri("Musta");
	m1.setNopeus(100);
	m1.k�ytt��nottovuosi = 1951;
	// ei voi k�ytt�� setteri� koska se on public muuttuja!
	
	a1.setV�ri("Punainen");
	
	System.out.println(a1);
	System.out.println(m1);
	}
}
