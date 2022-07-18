package n1exercici2;

import java.util.ArrayList;
import java.util.ListIterator;

//Crea i emplena un List<Integer>. 
//Crea un segon List<Integer> i insereix a la segona llista els elements de la primera en ordre invers. 
//Empra els objectes ListIterator per a llegir els elements de la primera llista i inserir-los en la segona.

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();

		for (int i = 1; i < 6; i++) {
			list1.add(i);
		}

		System.out.println("list 1: " + list1);

		ListIterator<Integer> iteratorList1 = list1.listIterator(list1.size());
		ListIterator<Integer> iteratorList2 = list2.listIterator(list2.size());

		while (iteratorList1.hasPrevious()) {
			iteratorList2.add(iteratorList1.previous());
		}
		System.out.println("list 1 añadido en list 2 en orden inverso: " + list2.toString());
	}

}
