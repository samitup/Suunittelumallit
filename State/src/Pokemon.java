
public class Pokemon {
	private LevelState state = new CharmeleonState();

	private int xp = 0;
	int summa = 0;

	// getter, setter
	public void setState(LevelState state) {
		this.state = state;

	}

	public LevelState getState() {
		return this.state;
	}

	public void previousState() {
		state.prev(this);
	}

	public void nextState() {
		state.next(this);
	}

	public void printStatus() {
		state.printStatus();
	}

	public void levelUp(int xp) {
		this.xp = xp;
		summa += this.xp;
		if (summa == 3) {
			this.nextState();
		} else if (summa == 6) {
			this.nextState();
		} else if (summa > 6) {
			this.nextState();
		}
	}

}
