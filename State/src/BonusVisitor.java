//Konkreettinen visitor ?
public class BonusVisitor implements PokemonVisitor {
	public BonusVisitor() {
		
	}
	
	@Override
	public void visit(CharmeleonState charmaleon) {
		 charmaleon.setBonus(1);
		 
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
