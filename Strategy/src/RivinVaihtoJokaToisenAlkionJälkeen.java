import java.util.ArrayList;

public class RivinVaihtoJokaToisenAlkionJälkeen implements ListConverter {
	String merkkijono = "";

	@Override
	public String listToString(ArrayList<String> list) {
		String taulukko[] = new String[list.size()];
		list.toArray(taulukko);
		for (int i = 0; i < list.size(); i++) {
			if (i % 2 == 1) {
				merkkijono += taulukko[i] + "\n"; //Lisää rivivälin joka toisen alkion jälkeen
			} else {
				merkkijono += taulukko[i];
			}
		}
		return merkkijono;
	}

	@Override
	public String toString() {
		return merkkijono.toString();
	}
}
