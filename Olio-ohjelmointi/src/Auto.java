public class Auto {
	
	// Luokkamuuttijien esittely
	String v�ri;
	int nopeus;
	int tankinTilavuus;
	
	public static void main(String args []) {
		
		// Olioiden luominen
		Auto a1 = new Auto();
		Auto a2 = new Auto();
		
		// Tietojen muuttaminen
		a1.nopeus = 20;
		a2.nopeus = 100;
		
		a1.v�ri = "Punainen";
		a2.v�ri = "Sininen";
		
		System.out.println(a1);
		System.out.println(a2);
	}
	public String toString() {
		return "Auton v�ri: " + v�ri + ", " + "nopeus : " + nopeus;
	}
}
