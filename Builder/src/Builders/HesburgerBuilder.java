package Builders;
import java.util.ArrayList;
import java.util.List;

import Ingredients.Bun;
import Ingredients.Ingredients;
import Ingredients.Salad;
import Ingredients.Sauce;
import Ingredients.Steak;

public class HesburgerBuilder extends HamburgerBuilder {

	private ArrayList<Ingredients> ingredients = new ArrayList<>();
	private Salad salad = new Salad();
	private Sauce sauce = new Sauce();
	private Steak steak = new Steak();
	private Bun bun = new Bun();

	@Override
	public void buildSalad() {
		ingredients.add(salad);
	}

	@Override
	public void buildSauce() {
		ingredients.add(sauce);
	}

	@Override
	public void buildSteak() {
		ingredients.add(steak);

	}

	@Override
	public void buildBun() {
		ingredients.add(bun);

	}

	public ArrayList<Ingredients> getHamburger() {
		return ingredients;
	}

}
