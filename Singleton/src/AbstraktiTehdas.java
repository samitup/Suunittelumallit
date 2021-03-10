
public class AbstraktiTehdas {
	private static AbstraktiTehdas INSTANCE = null;
	
	private AbstraktiTehdas() {}
	public static AbstraktiTehdas getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new AbstraktiTehdas();
		}
		return INSTANCE;
	}

}
