
public class MinuuttiViisari extends Kello {

	public int aika;

	public MinuuttiViisari() {
	}

	public MinuuttiViisari(MinuuttiViisari x) { // Kopioidaan konstruktori
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
		return new MinuuttiViisari(this);
	}

	@Override
	public boolean equals(Object object2) {
		if (!(object2 instanceof MinuuttiViisari) || !super.equals(object2))
			return false;
		MinuuttiViisari viisari2 = (MinuuttiViisari) object2;
		return viisari2.aika == aika;
	}

	@Override
	public void setAika(int aika) {
		this.aika = aika;
	}

}
