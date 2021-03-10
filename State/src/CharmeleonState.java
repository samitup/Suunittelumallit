
public class CharmeleonState extends AbstractPokemon implements LevelState {
	private int bonus;
	BonusVisitor bonuksenAntaja = new BonusVisitor();

	@Override
	public void next(Pokemon poke) {
		poke.setState(new CharmanderState());

	}

	@Override
	public void prev(Pokemon poke) {
		System.out.println("Charmeleon is level1 Pokemon");
	}

	@Override
	public void printStatus() {
		System.out.println("Charmeleon is level 1 Pokemon you got " + bonus
				+ " bonuspoint and can shoot soapbubbles \n To levelup click '1'+enter three times");
	}

	public void accept(PokemonVisitor visitor) {
		bonuksenAntaja.visit(this);
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
