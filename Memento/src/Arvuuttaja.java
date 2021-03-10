
public class Arvuuttaja {


	public Arvuuttaja() {
		// TODO Auto-generated constructor stub
	}

	public Object liityPeliin() {
		int vastaus = (int) (Math.random() * (6 + 1));		//Arpoo luvun johon verrataan (0-6)
		System.out.println("Pelaajan  luku on: "+vastaus);
		return new Memento(vastaus);
	}

	public boolean arvaus(Object o, int arvaus) {
		Memento m = (Memento) o;
		if (m.getArvaus() == arvaus) {
			return true;
		}

		return false;
	}

	private class Memento {

		int arvaus;

		public Memento(int arvaus) {
			this.arvaus = arvaus;
		}

		protected int getArvaus() {
			return this.arvaus;
		}

	}

}
