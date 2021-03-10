
public class CharmanderState extends AbstractPokemon implements LevelState {
	private int bonus;
	@Override
	public void next(Pokemon poke) {
		poke.setState(new CharizadState());
	}

	@Override
	public void prev(Pokemon poke) {
		poke.setState(new CharmeleonState());
	}

	@Override
	public void printStatus() {
		System.out.println("Charmander is level 2 Pokemon now! You got "+bonus+" bonuspoint and can shoot sand now! \n To level up click '1'+enter three times");
	}

	@Override
	public void accept(PokemonVisitor visitor) {
		visitor.visit(this);
	}

	
	public void setBonus(int bonus) {
		System.out.println(bonus);

		 this.bonus = bonus;
	}

	@Override
	public int getBonus() {
		return this.bonus;
	}

}
