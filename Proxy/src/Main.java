import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	/**
	 * Test method
	 */
	public static void main(String[] args) {
		Image image1 = new ProxyImage("HiRes_10MB_Photo1");
		Image image2 = new ProxyImage("HiRes_10MB_Photo2");
		List<Image> valokuvakansio = new ArrayList<Image>();
		valokuvakansio.add(image1);
		valokuvakansio.add(image2);
		int valinta;

		do {
			System.out.println(
					"\n Lataa kuvien nimet paina '1'\n" +" Ladataksesi kuvien tiedot paina '2' \n" + " Lopetus paina '3' ");
			Scanner lukija = new Scanner(System.in);
			valinta = lukija.nextInt();
			switch (valinta) {
			case 1:
				for (int i = 0; i < valokuvakansio.size(); i++) {
					System.out.println("Valokuvan " + (i + 1) + ". nimi: " + valokuvakansio.get(i).showData());
				}
				continue;
			case 2:
			
			image1.displayImage(); // loading necessary
			image1.displayImage(); // loading unnecessary
			image2.displayImage(); // loading necessary
			image2.displayImage(); // loading unnecessary
			image1.displayImage(); // loading unnecessary
			continue;
			case 3:
				System.out.println("Poistutaan...");
				System.exit(0);
			}
				
		} while (valinta != 3);
	}
}
