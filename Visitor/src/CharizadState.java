
public class CharizadState extends AbstractPokemon implements LevelState {
private int bonus;
	@Override
	public void next(Pokemon poke) {
		System.out.println("Charizad is at max level now!");
	}

	@Override
	public void prev(Pokemon poke) {
		poke.setState(new CharmanderState());
	}

	@Override
	public void printStatus() {
		System.out.println("Charizad is level 3 Pokemon! You got "+bonus+" bonuspoint and can shoot fire now!");
	}

	@Override
	public void accept(BonusVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public void setBonus(int bonus) {
		 this.bonus = bonus;
	}

	@Override
	public int getBonus() {
		return this.bonus;
	}

}
