
public class SekuntiViisari extends Kello {

	public int aika;

	public SekuntiViisari() {
	}

	public SekuntiViisari(SekuntiViisari x) { // Kopioidaan konstruktori
		super(x);
		if (x != null) {
			this.aika = x.aika;
		}
	}

	public int getAika() {
		return aika;
	}

	@Override
	public Kello clone() {
		return new SekuntiViisari(this);
	}

	@Override
	public boolean equals(Object object2) {
		if (!(object2 instanceof SekuntiViisari) || !super.equals(object2))
			return false;
		SekuntiViisari viisari2 = (SekuntiViisari) object2;
		return viisari2.aika == aika;
	}

	@Override
	public void setAika(int aika) {
		this.aika = aika;
	}

}
