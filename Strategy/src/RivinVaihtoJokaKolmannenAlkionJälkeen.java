import java.util.ArrayList;

public class RivinVaihtoJokaKolmannenAlkionJälkeen implements ListConverter {

	String merkkijono = "";

	@Override
	public String listToString(ArrayList<String> list) {
		for (int i = 0; i < list.size(); i++) {
			if (i % 3 == 2) {
				merkkijono += list.get(i) + "\n"; //Lisää rivivälin joka kolmannen alkion jälkeen

			} else {
				merkkijono += list.get(i);
			}
		}
		return merkkijono;
	}

	@Override
	public String toString() {
		return merkkijono.toString();
	}

}
