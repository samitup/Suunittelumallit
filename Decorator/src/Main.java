
public class Main {
	public static void main(String args[]) {
		Pohja juustoPizza = new Pohja("Juustopizza",1.50);
		Juusto juustoTäyte = new Juusto("Mozzarella",1,juustoPizza);
		
		Pohja pepperoniPizza = new Pohja("Pepperonipizza",1.50);
		Pepperoni pepperoniTäyte = new Pepperoni("pepperoni",2,pepperoniPizza);
		

		Pohja sieniPizza = new Pohja("Sienipizza",1.50);
		Sieni sieniTäyte = new Sieni("Sieni",20,sieniPizza);
		Juusto juustTäyteSieniPizzaan = new Juusto("Mozzarella",1,sieniTäyte);
		
		Pizza valinta1 = juustoTäyte;
		Pizza valinta2 = pepperoniTäyte;
		Pizza valinta3 = juustTäyteSieniPizzaan;
		
		
		
		System.out.println(valinta1.getNimi()+" "+valinta1.getHinta());
		System.out.println(valinta2.getNimi()+" "+valinta2.getHinta());
		System.out.println(valinta3.getNimi()+" "+valinta3.getHinta());

		
	}
}
