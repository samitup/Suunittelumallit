
public class FactoryMethod {
	
	public static void main(String args[]) {
		AterioivaOtus opettaja = new Opettaja();
		AterioivaOtus opiskelija = new Opiskelija();
		AterioivaOtus kissa = new Kissa();
		
		opettaja.aterioi();
		opiskelija.aterioi();
		kissa.aterioi();
	}

}
