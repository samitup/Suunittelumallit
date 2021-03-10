import java.util.ArrayList;
import java.util.List;

public class Kotelo implements Laiteosa {
	
	private double hinta;
	List<Laiteosa> hinnat = new ArrayList<Laiteosa>();
	double summa = 0;

	
	public Kotelo(double hinta) {
		this.hinta = hinta;
	}

	public Kotelo() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getHinta() {		//Composite-luokka
		return hinta;
	}

	@Override
	public void lisääTuote(Laiteosa osa) {
		hinnat.add(osa);

	}

	@Override
	public double getSumma() {		//Summaa hinnat-arraylistan Laiteosa-olioiden hinnat
		for(Laiteosa o: hinnat) {
			summa += o.getSumma();
		}
		return summa + hinta;
	}
}
