package Builders;

import java.util.ArrayList;
import Ingredients.Ingredients;
import Ingredients.McBun;
import Ingredients.McSalad;
import Ingredients.McSauce;
import Ingredients.McSteak;

public class McDonaldsBuilder extends HamburgerBuilder {
	StringBuilder ingredients = new StringBuilder();
	private McSalad salad = new McSalad();
	private McSauce sauce = new McSauce();
	private McSteak steak = new McSteak();
	private McBun bun = new McBun();

	@Override
	public void buildSalad() {
		ingredients.append(salad);
		ingredients.append(", ");

	}

	@Override
	public void buildSauce() {
		ingredients.append(sauce);
		ingredients.append(", ");

	}

	@Override
	public void buildSteak() {
		ingredients.append(steak);
		ingredients.append(", ");

	}

	@Override
	public void buildBun() {
		ingredients.append(bun);

	}

	public StringBuilder getHamburger() {
		return ingredients;
	}

}
