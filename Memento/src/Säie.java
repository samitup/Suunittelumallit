
public class Säie extends Thread {

	private int pelaajanNumero;

	int laskuri = 1;
	Arvuuttaja a;

	public Säie(int pelaajanNumero, Arvuuttaja a) {
		this.a = a;
		this.pelaajanNumero = pelaajanNumero;
	}


	@Override
	public void run() {
		Object o = a.liityPeliin();
		boolean arvausOikein = false;
		while (!arvausOikein) {

			int arvaus = (int) (Math.random() * (6 + 1)); // Arpoo arvauksen välillä (0-6)

			if (a.arvaus(o, arvaus)) {
				System.out.println("Pelaaja " + pelaajanNumero + ", arvauksesi: " + arvaus + ", OIKEIN " + laskuri
						+ ". yrityksellä!");
				arvausOikein = true; // Kun arvaus oikein break;
			} else {
				System.out.println("Pelaaja " + pelaajanNumero + ", arvauksesi: " + arvaus + ", väärin.");
				laskuri++;
			}
		}
	};
}
