import java.util.ArrayList;
import java.util.Iterator;

public class Main {
	public static void main(String args[]) {
		
		ArrayList<Integer> lista = new ArrayList<Integer>();

		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		
		Iterator<Integer> iterator1 = lista.iterator();
		Iterator<Integer> iterator2 = lista.iterator();
		
		MyThread1 myThread1 = new MyThread1(lista, iterator1);
		MyThread2 myThread2 = new MyThread2(lista, iterator1); //iterator2 teht a
		
		myThread1.start();
		lista.add(100);
		myThread2.start();
		lista.add(200);
	}
}
