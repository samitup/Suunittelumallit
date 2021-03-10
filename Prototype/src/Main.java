import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String args[]) throws CloneNotSupportedException {

		Kello sekuntiViisari = new SekuntiViisari();
		sekuntiViisari.setAika(60);

		System.out.println("Alkuperäinen sekuntiviisari, aika: " + sekuntiViisari.getAika());

		Kello sekuntiViisariKopio = sekuntiViisari.clone();

		System.out.println("Kopio sekuntiviisarista, aika: " + sekuntiViisariKopio.getAika());
		System.out.println(
				"Alkuperäinen sekuntiviisari on sama kuin kopio: " + sekuntiViisari.equals(sekuntiViisariKopio));
		sekuntiViisariKopio.setAika(40);
		System.out.println("Kopion aika nyt: " + sekuntiViisariKopio.getAika());
		System.out.println("Alkuperäisen aika nyt: " + sekuntiViisari.getAika()); // Alkuperäinen aika ei muuttunut

		Kello minuuttiViisari = new MinuuttiViisari();
		minuuttiViisari.setAika(12);

		System.out.println("Alkuperäinen minuuttiviisari, aika: " + minuuttiViisari.getAika());

		Kello minuuttiViisariKopio = minuuttiViisari.clone();

		System.out.println("Kopio minuuttiviisarista, aika: " + minuuttiViisariKopio.getAika());
		System.out.println(
				"Alkuperäinen minuuttiviisari on sama kuin kopio: " + minuuttiViisari.equals(minuuttiViisariKopio));
		minuuttiViisariKopio.setAika(10);
		System.out.println("Kopion aika nyt: " + minuuttiViisariKopio.getAika());
		System.out.println("Alkuperäisen aika nyt: " + minuuttiViisari.getAika()); // Alkuperäinen aika ei muuttunut

	}
}