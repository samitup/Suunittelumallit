
public class Pohja implements Pizza {
	private String nimi;
	private double hinta;
	public Pohja(String nimi, double hinta) {
		this.nimi = nimi;
		this.hinta = hinta;
	}

	@Override
	public double getHinta() {
		return 2.0;
	}

	@Override
	public String getNimi() {
		return "Pohja";
	}
	

}
