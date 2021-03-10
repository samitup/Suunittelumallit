import java.util.ArrayList;
import java.util.List;

public class Emolevy implements Laiteosa {

	private double hinta;
	List<Laiteosa> hinnat = new ArrayList<Laiteosa>();

	public Emolevy() {			//Composite-luokka

	}

	public Emolevy(double hinta) {
		this.hinta = hinta;
	}

	public double getSumma() {				//rekursio
		if (hinnat.isEmpty() == true) {
			return 0;
		}
		double lastNum = hinnat.remove(hinnat.size() - 1).getHinta(); //poistaa viimeisen alkion listasta
		return lastNum + getSumma();
	}

	@Override
	public void lisääTuote(Laiteosa osa) {
		hinnat.add(osa);
	}

	@Override
	public double getHinta() {
		return hinta;
	}

}
