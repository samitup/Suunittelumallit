
public abstract class Kello {
	public int aika;

	public Kello() {
	}

	public Kello(Kello x) { //Kopioidaan konstruktori
		if (x != null) {
			this.aika = x.aika;
		}
	}

	public abstract int getAika();

	public abstract void setAika(int aika);

	public abstract Kello clone();

	@Override
	public boolean equals(Object object2) { // 1) Klooni luo uuden kello-instanssin. Viite kahdelle instanssille on
											// erilainen, koska molemmilla on eri ​​viitteet.
		if (!(object2 instanceof Kello)) // 2) Jos equalsia ei overridata, superclassin objekti # equals
											// otetaan käyttöön. Tämä tarkistaa objektin muistin sijainnin. Kohdan 1
											// mukaan molemmilla on eri osoite, joten palauttaa false.

			return false;
		Kello kello2 = (Kello) object2;
		return kello2.aika == aika;
	}

}
