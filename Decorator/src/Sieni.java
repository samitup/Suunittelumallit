
public class Sieni extends TäyteDecorator {
	private String nimi;
    private double hinta;
    private Pizza kohdePizza;

    Sieni(String nimi, double hinta, Pizza kohdePizza) {
    	this.nimi = nimi;
    	this.hinta = hinta;
    	this.kohdePizza = kohdePizza;
    }

	@Override
	public String getNimi() {
		return kohdePizza.getNimi() + " - " + this.nimi; 
	}

	@Override
	public double getHinta() {
		return kohdePizza.getHinta() + this.hinta;
	}

}
