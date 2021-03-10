/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackiterator;

/**
 *
 * @author kamaj
 */
public class Stack {
	private static final int DEFAULT_CAPACITY = 10;
	ListItem[] elements;

	ListItem top; // top näkyy oletuspakkaukseen
	private int size;

	public Stack() {
		top = null;
		size = 0;
		ListItem[] newArray = (new ListItem[DEFAULT_CAPACITY]);

		elements = newArray;
	}

	public StackIterator iterator() {
		return new StackIterator(this);
	}

	public void push(String aData) {
		ListItem newAlkio = new ListItem();
		if (size >= elements.length) {
			expandCapacity();
		}
		newAlkio.setData(aData);
		newAlkio.setLink(top);
		top = newAlkio;
		elements[size] = newAlkio;
		size++;

	}

	public ListItem pop() {
		ListItem takeAway;
		if (top == null) {
			takeAway = null; // pino on tyhjä
		} else {
			size--;
			takeAway = top;
			top = top.getLink();
		}
		return takeAway;
	}

	public ListItem top() {
		return elements[size - 1];
	}

	public ListItem topAndPop() {
		pop();
		return elements[size];
	}

	private void expandCapacity() {
		ListItem[] makeLarger = (new ListItem[elements.length * 2]);
		for (int i = 0; i < size; i++) {
			makeLarger[i] = elements[i];
		}
		elements = makeLarger;
	}

	// palautetaan pinottujen alkioiden lukumäärä
	public int getSize() {
		return size;
	}

	// listataan sisältö
	public void printItems() {
		ListItem lPointer = top;
		while (lPointer != null) {
			System.out.print(lPointer.getData() + ", ");
			lPointer = lPointer.getLink();
		}

	}

	public void setSize(int i) {
		this.size = size - i;
	}
}
