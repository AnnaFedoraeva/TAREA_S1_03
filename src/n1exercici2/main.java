package n1exercici2;

import java.util.ArrayList;
import java.util.ListIterator;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <Integer> list1 = new ArrayList<>();
		ArrayList <Integer> list2 = new ArrayList<>();
		
		for (int i=1; i<6; i++) {
			list1.add(i);
		}
		for (int i=10; i>=6; i--) {
			list2.add(i);
		}
		
		System.out.println(list1);
		System.out.println(list2);
		
		
		
		ListIterator <Integer> iteratorList1 = list1.listIterator(list1.size()); 
		ListIterator <Integer> iteratorList2 = list2.listIterator(list2.size());
	
		
		while (iteratorList2.hasPrevious())  
		{  
			iteratorList1.add(iteratorList2.previous());
		}  
		System.out.println(list1.toString());
	}

}
