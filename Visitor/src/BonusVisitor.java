//Konkreettinen visitor ?
public class BonusVisitor implements PokemonVisitor {
	private int bonus;
	public BonusVisitor(int bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public void visit(CharmeleonState charmaleon) {
		 charmaleon.setBonus(bonus);
		 
	}

	@Override
	public void visit(CharmanderState charmander) {
		charmander.setBonus(2);
	}

	@Override
	public void visit(CharizadState charizad) {
		charizad.setBonus(3);
	}

}
