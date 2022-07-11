package n1exercici1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class main {

	public static void main(String[] args) {

		ArrayList<Month> meses = new ArrayList<>();

		Month enero = new Month("enero");
		Month febrero = new Month("febrero");
		Month marzo = new Month("marzo");
		Month abril = new Month("abril");
		Month mayo = new Month("mayo");
		Month junio = new Month("junio");
		Month julio = new Month("julio");
		Month septiembre = new Month("septimebre");
		Month octubre = new Month("octubre");
		Month noviembre = new Month("noviembre");
		Month diciembre = new Month("diciembre");

		meses.add(enero);
		meses.add(febrero);
		meses.add(marzo);
		meses.add(abril);
		meses.add(mayo);
		meses.add(junio);
		meses.add(julio);
		meses.add(septiembre);
		meses.add(octubre);
		meses.add(noviembre);
		meses.add(diciembre);

		Month agosto = new Month("agosto");

		meses.add(7, agosto);

		System.out.println(meses.toString());

		HashSet<Month> hashSet = new HashSet<Month>(meses);

		hashSet.add(agosto);
		hashSet.add(agosto);
		hashSet.add(agosto);

		System.out.println(hashSet);
		
		int contador = 0;
		
		//usamos for-each para recorrer hashSet y confirmar que el objeto agosto no esta duplicado (contador==1)
		for(Month mes: hashSet) {
			if (mes.equals(agosto)) {
				contador++;
			}
		}
		System.out.println(contador);
		
		//recorremos la lista con un iterador

		Iterator<Month> mesesIt = hashSet.iterator();

		while (mesesIt.hasNext()) {
			System.out.println(mesesIt.next());
		}

	}

}
