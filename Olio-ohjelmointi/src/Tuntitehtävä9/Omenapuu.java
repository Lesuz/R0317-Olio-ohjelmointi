package Tuntitehtävä9;

import java.util.Arrays;

public class Omenapuu {

	int istutusVuosi;
	Omena[] omenat = new Omena[5];
	Ötökkä[] tuholaiset = new Ötökkä[5];
	
	@Override
	public String toString() {
		return "Omenapuu [istutusVuosi=" + istutusVuosi + ", omenoita=" + Arrays.toString(omenat) + ", tuholaiset="
				+ Arrays.toString(tuholaiset) + "]";
	}

	public int getIstutusVuosi() {
		return istutusVuosi;
	}

	public void setIstutusVuosi(int istutusVuosi) {
		this.istutusVuosi = istutusVuosi;
	}

	public Omena[] getOmenat() {
		return omenat;
	}

	public void setOmenat(Omena[] omenat) {
		this.omenat = omenat;
	}

	public Ötökkä[] getTuholaiset() {
		return tuholaiset;
	}

	public void setTuholaiset(Ötökkä[] tuholaiset) {
		this.tuholaiset = tuholaiset;
	}
	
	
}
