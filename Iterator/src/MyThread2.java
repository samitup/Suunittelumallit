import java.util.ArrayList;
import java.util.Iterator;

public class MyThread2 extends Thread {
	private ArrayList<Integer> lista;
	private Iterator<Integer> iterator;

	public MyThread2(ArrayList<Integer> lista, Iterator<Integer> iterator) {
		this.lista = lista;
		this.iterator = iterator;
	}

	public void run() {
		 { //teht b
			while (this.iterator.hasNext()) {
				System.out.println("MyThread2: " + iterator.next());

			}
		}
	}
}