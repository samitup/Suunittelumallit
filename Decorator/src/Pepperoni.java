
public class Pepperoni extends TäyteDecorator{
	private String nimi;
    private double hinta;
    private Pizza kohdePizza;

    Pepperoni(String nimi, double hinta, Pizza kohdePizza) {
    	this.nimi = nimi;
    	this.hinta = hinta;
    	this.kohdePizza = kohdePizza;
    }

	public String getNimi() {
		return kohdePizza.getNimi() + " - " + this.nimi; 
	}

	public double getHinta() {
		return kohdePizza.getHinta() + this.hinta;
	}
}
