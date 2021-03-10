import java.util.ArrayList;
import java.util.Iterator;

public class RivinVaihtoAlkionJälkeen implements ListConverter {
	String merkkijono = "";

	public String listToString(ArrayList<String> list) {

		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			merkkijono += iterator.next() + "\n"; //Lisää rivivälin jokaisen alkion jälkeen
		}
		return merkkijono;
	}

	@Override
	public String toString() {
		return merkkijono.toString();
	}
}
