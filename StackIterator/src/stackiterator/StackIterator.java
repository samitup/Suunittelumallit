/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackiterator;

import java.util.NoSuchElementException;

/**
 *
 * @author kamaj
 */
interface Iterator {
	boolean hasNext();

	Object next();
}

public class StackIterator implements Iterator {
	private int index;
	private boolean called = false;
	private Stack stack;

	public StackIterator(Stack stack) {
		this.stack = stack;
		index = stack.getSize();

	}

	@Override
	public boolean hasNext() {

		return index != 0;
	}

	@Override
	public ListItem next() {
		called = true;
		if (index == 0) {
			throw new NoSuchElementException("" + "Ei käsiteltäviä elementtejä jäljellä");
		}
		--index;
		return stack.elements[index];
	}

	public void remove() {
		if (called) {
			for (int i = index; i < stack.getSize(); i++) {
				stack.elements[i] = stack.elements[i + 1];
			}
			called = false;
			stack.setSize(1);
		}

		else {
			throw new IllegalStateException("Virhe tapahtui!");
		}
	}

}
