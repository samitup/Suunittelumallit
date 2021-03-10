import Builders.HesburgerBuilder;
import Builders.McDonaldsBuilder;

public class Main {
	public static void main(String args[]) {

		Cook cook = new Cook();

		HesburgerBuilder hesburgerBuilder = new HesburgerBuilder();
		McDonaldsBuilder mcBuilder = new McDonaldsBuilder();

		cook.setHamburgerBuilder(hesburgerBuilder);
		cook.constructHamburger();
		System.out.println("Hesburgerin hampurilaisen ainesosat: " + hesburgerBuilder.getHamburger());

		cook.setHamburgerBuilder(mcBuilder);
		cook.constructHamburger();
		System.out.println("McDonaldsin hampurilaisen ainesosat: " + mcBuilder.getHamburger());

	}
}
