package Kala;

public class Testiohjelma {

	public static void main(String[] args){

		 Mustekala matti = new Mustekala();
		 matti.setPaino(3.2);
		 System.out.println(matti);

		 Keuhkokala keke  = new Keuhkokala();
		 keke.setPaino(4.62);
		 System.out.println(matti);

		 matti.vapautaMustetta();
		 keke.hengita();

		 keke.setVarsieviä(5);
		 matti.setLonkeroita(6);

		System.out.println(matti);
		System.out.println(keke);
	}

}
