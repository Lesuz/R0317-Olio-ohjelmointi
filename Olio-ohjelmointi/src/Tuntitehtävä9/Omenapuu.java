package Tuntiteht�v�9;

import java.util.Arrays;

public class Omenapuu {

	int istutusVuosi;
	Omena[] omenat = new Omena[5];
	�t�kk�[] tuholaiset = new �t�kk�[5];
	
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

	public �t�kk�[] getTuholaiset() {
		return tuholaiset;
	}

	public void setTuholaiset(�t�kk�[] tuholaiset) {
		this.tuholaiset = tuholaiset;
	}
	
	
}
