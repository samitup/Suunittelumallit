
public class Kissa extends AterioivaOtus {

	@Override
	public Juoma createJuoma() {
		return new Mehu();
	}

}
