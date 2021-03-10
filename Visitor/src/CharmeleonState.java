
public class CharmeleonState extends AbstractPokemon implements LevelState {
	private int bonus;
	
	public CharmeleonState() {
		
	}
public CharmeleonState(int bonus) {
		this.bonus = bonus;
		System.out.println("Konstruktori bonus: "+bonus);
	}
	@Override
	public void next(Pokemon poke) {
		poke.setState(new CharmanderState());

	}

	@Override
	public void prev(Pokemon poke) {
		System.out.println("Charmeleon is level1 Pokemon");
	}

	public void printStatus() {
		System.out.println("printstatus " + bonus);
		System.out.println("Charmeleon is level 1 Pokemon you got " + bonus
				+ " bonuspoint and can shoot soapbubbles \n To levelup click '1'+enter three times");
	}

	public void accept(BonusVisitor visitor) {
		visitor.visit(this);
		System.out.println("accept: "+bonus);

	}

	public void setBonus(int bon) {
		this.bonus = bon;
		System.out.println("setter:" +bonus);

	}

	@Override
	public int getBonus() {
		System.out.println("getter: "+bonus);

		return this.bonus;
	}

}
