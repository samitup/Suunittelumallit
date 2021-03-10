import java.util.ArrayList;
import java.util.List;

public class Context {
	private ArrayList<String> lista;
	private ListConverter strategy;
	private String merkkijono;

	public Context(ListConverter strategy) {
		this.lista = new ArrayList<String>();
		this.strategy = strategy;
	}

	public void add(ArrayList<String> lista) {
		lista.add(strategy.listToString(lista));
	}

	public void setStrategy(ListConverter strategy) {
		this.strategy = strategy;
	}

	public void tulosta() {
		merkkijono = strategy.listToString(lista);
		System.out.println(merkkijono);

	}

}
