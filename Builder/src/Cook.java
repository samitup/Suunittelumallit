import Builders.HamburgerBuilder;

//Director
public class Cook {
	private HamburgerBuilder hamburgerBuilder;

	public void setHamburgerBuilder(HamburgerBuilder hb) {
		this.hamburgerBuilder = hb;
	}

	public void constructHamburger() {
		hamburgerBuilder.buildSalad();
		hamburgerBuilder.buildSauce();
		hamburgerBuilder.buildSteak();
		hamburgerBuilder.buildBun();
	}
}
