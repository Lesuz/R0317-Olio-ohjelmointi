package OmenaHarjoitus;

public class Omenakone {
	
	static public void main(String args[]) {

	Omena ekaOmena = new Omena();
	Omena tokaOmena = new Omena();
	Omena kolmasOmena = new Omena();
	
	ekaOmena.setV�ri("Vihre�");
	//System.out.println(ekaOmena.getV�ri());
	ekaOmena.setLajike("Valkeakuulas");
	//System.out.println(ekaOmena.getLajike());
	ekaOmena.setPaino(120);
	
	tokaOmena.setV�ri("Punainen");
	//System.out.println(tokaOmena.getV�ri());
	tokaOmena.setLajike("Kaneliomena");
	//System.out.println(tokaOmena.getLajike());
	
	kolmasOmena.setV�ri("Punainen");
	//System.out.println(kolmasOmena.getV�ri());
	kolmasOmena.setLajike("Polka");
	//System.out.println(kolmasOmena.getLajike())
	
	System.out.println(ekaOmena);
	ekaOmena.haukkaa();
	//System.out.println(tokaOmena);
	//System.out.println(kolmasOmena);
	}
}
