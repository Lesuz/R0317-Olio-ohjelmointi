package OmenaHarjoitus;

public class Omenakone {
	
	static public void main(String args[]) {

	Omena ekaOmena = new Omena();
	Omena tokaOmena = new Omena();
	Omena kolmasOmena = new Omena();
	
	ekaOmena.setVäri("Vihreä");
	//System.out.println(ekaOmena.getVäri());
	ekaOmena.setLajike("Valkeakuulas");
	//System.out.println(ekaOmena.getLajike());
	ekaOmena.setPaino(120);
	
	tokaOmena.setVäri("Punainen");
	//System.out.println(tokaOmena.getVäri());
	tokaOmena.setLajike("Kaneliomena");
	//System.out.println(tokaOmena.getLajike());
	
	kolmasOmena.setVäri("Punainen");
	//System.out.println(kolmasOmena.getVäri());
	kolmasOmena.setLajike("Polka");
	//System.out.println(kolmasOmena.getLajike())
	
	System.out.println(ekaOmena);
	ekaOmena.haukkaa();
	//System.out.println(tokaOmena);
	//System.out.println(kolmasOmena);
	}
}
