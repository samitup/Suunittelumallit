
public class Main {

	public static void main(String args[]) {

		Laiteosa hinnatYhteensä = new Kotelo();		//Tähän koko koneen hinta
		Laiteosa emolevyComposite = new Emolevy(); //  Tähän emolevyn hinta osineen

		Laiteosa kotelo = new Kotelo(100);
		Laiteosa emolevy = new Emolevy(100);
		Laiteosa muisti = new Muistipiiri(200);
		Laiteosa ohjain = new Näytönohjain(300);
		Laiteosa prosessori = new Prosessori(400);
		Laiteosa kortti = new Verkkokortti(500);
		
		emolevyComposite.lisääTuote(emolevy);
		emolevyComposite.lisääTuote(muisti);
		emolevyComposite.lisääTuote(ohjain);
		emolevyComposite.lisääTuote(prosessori);
		emolevyComposite.lisääTuote(kortti);
		
		hinnatYhteensä.lisääTuote(kotelo);
		hinnatYhteensä.lisääTuote(emolevyComposite);
		

		System.out.println("Kokoonpanoon hinta yhteensä: " + hinnatYhteensä.getSumma());
	}
}
