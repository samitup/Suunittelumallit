
public class Prosessori implements Laiteosa {

	private double hinta;

	public Prosessori(double hinta) {
		this.hinta = hinta;
	}

	@Override
	public double getHinta() {
		return hinta;
	}

	@Override
	public void lisääTuote(Laiteosa osa) {
		// TODO Auto-generated method stub

	}

	@Override
	public double getSumma() {
		// TODO Auto-generated method stub
		return 0;
	}

}
