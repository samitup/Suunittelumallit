import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Dice extends Game {
	String vuoro = null;
	int voittaja = 0;
	List<Integer> silmäluku = new ArrayList<Integer>();
	int max = 0;
	int laskuri = 0;
	boolean lopeta = false;

	@Override
	void initializeGame() {
		System.out.println("Tervetuloa noppapeliin! Pelaaja joka saa suurimman silmäluvun voittaa!");
	}

	@Override
	void makePlay(int player) {
		Scanner scanner = new Scanner(System.in);

		if (player == 0) { // Kun kaikki pelaajat käyty läpi, lopettaa pelin
			laskuri++;
			if (laskuri == 2) {
				lopeta = true;
				return;
			}
		}
		System.out.println("Pelaaja numero " + player + ", heitä noppaa painamalla enteriä");
		vuoro += scanner.nextLine();
		silmäluku.add((int) (Math.floor(Math.random() * 6) + 1)); // Numerot 1-6

		System.out.println("Pelaaja " + player + ", silmäluku: " + silmäluku.get(player));
		max = Collections.max(silmäluku);
		voittaja = silmäluku.indexOf(max);

	}

	@Override
	boolean endOfGame() {
		if (lopeta) {
			System.out.println("Suurin luku: " + max);

			return true;
		}
		return false;
	}

	@Override
	void printWinner() {
		System.out.println("Onneksi olkoon! Pelaaja numero " + voittaja + " voitit pelin!");
	}

}
