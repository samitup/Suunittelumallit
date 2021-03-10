import java.util.ArrayList;
import java.util.Iterator;

public class MyThread1 extends Thread {
	private ArrayList<Integer> lista;
	private Iterator<Integer> iterator;

	public MyThread1(ArrayList<Integer> lista, Iterator<Integer> iterator) {
		this.lista = lista;
		this.iterator = iterator;
	}

	public void run() {
		 { //teht b
			while (this.iterator.hasNext()) {
				//  iterator.remove();
				System.out.println("MyThread1: " + iterator.next());

			}
		}
	}
}