import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String args[]) {
		ArrayList<String> lista = new ArrayList();
		lista.add("a");
		lista.add("b");
		lista.add("c");
		lista.add("d");
		lista.add("e");
		lista.add("f");
		Context a = new Context(new RivinVaihtoAlkionJälkeen());

		ListConverter yksi = new RivinVaihtoAlkionJälkeen();
		ListConverter kaksi = new RivinVaihtoJokaToisenAlkionJälkeen();
		ListConverter kolme = new RivinVaihtoJokaKolmannenAlkionJälkeen();

		a.setStrategy(kolme);
		a.add(lista);
		a.tulosta();

	}
}
