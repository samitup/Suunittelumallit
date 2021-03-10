/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackiterator;

import java.util.LinkedList;

/**
 *
 * @author kamaj
 */
public class Stack {
	private LinkedList<String> list;
	
        ListItem top; // top näkyy oletuspakkaukseen
        private int size;

        public Stack() {
                top = null;
                size = 0;
           	 list = new LinkedList<String>();

        }
        //  palautetaan pino-iteraattori
        public StackIterator iterator() {
            return new StackIterator(this);
        }
        // muodostetaan uusi alkio ja viedään se huipulle
        public void push(String aData) {
                ListItem newItem = new ListItem(); // luodaan uusi lista-alkio
                newItem.setData(aData);
                newItem.setLink(top); // kytketään uusi alkio aikaisempaan huippualkioon
                top = newItem;
                list.add(aData);// uusi alkio pinon 1:ksi
                size++;
        }
        // poistetaan alkio pinon huipulta, jos pinossa ei alkioita palautetaan null
        public ListItem pop() {
                ListItem takeAway;
                if (top == null) {
                        takeAway = null; // pino on tyhjä
                }
                else
                {
                        size--;
                        takeAway = top;
                        top = top.getLink();
                        list.remove(top);
                }
                return takeAway;
        }
        // palautetaan pinottujen alkioiden lukumäärä
        public int getSize() {
                return size;
        }
        // listataan sisältö
        public void printItems() {
        	java.util.Iterator<String> iterator = list.iterator();
        	while(iterator.hasNext()){
        	    Object value = iterator.next();
        	    System.out.println(value);
        	}
               

        }
}

